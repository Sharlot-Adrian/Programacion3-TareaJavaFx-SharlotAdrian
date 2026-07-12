package controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Destino;
import model.Paquete;
import utils.ArchivoUtil;

public class RegistroPaqueteController {

    @FXML
    private Button bttCargarDestino;

    @FXML
    private Button bttGuardarArchivo;

    @FXML
    private ComboBox<Destino> cmbDestino;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDestino;

    @FXML
    private Label lblMensaje;

    @FXML
    private Label lblNombreDestinatario;

    @FXML
    private Label lblPesoPaquete;

    @FXML
    private ProgressBar prgresbrAvanceGuardado;

    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfNombreDestinatario;

    @FXML
    private TextField tfPesoPaquete;

    @FXML
    private Text txtTitulo;

    @FXML
    private ObservableList<Destino> opcionesDestino;

    @FXML
    public void initialize(){
        
        opcionesDestino = FXCollections.observableArrayList(ArchivoUtil.leerDestino());
        opcionesDestino.add(new Destino("La Vega"));
        opcionesDestino.add(new Destino("Santiago"));
        cmbDestino.setItems(opcionesDestino);
        
    }
    

    @FXML
    void cargarDestinos(ActionEvent event) {

        if(!ArchivoUtil.leerDestino().isEmpty()){
            opcionesDestino.addAll(ArchivoUtil.leerDestino());
        }
        else{
            lblMensaje.setText("Aun no ha agregado nuevos destinos.");
            
        }

    }

    @FXML
    void guardarEnArchivo(ActionEvent event) {

        Paquete paquete = crearPaquete();

        if(paquete == null){
            lblMensaje.setText("Ha dejado algun campo vacio. Intentelo de nuevo.");
            return;
        }

        lblMensaje.setText("Guardando en segundo plano...");
        prgresbrAvanceGuardado.setProgress(0);

        Thread hilo = new Thread(() ->{

            try{
                for(int i = 0; i <=10; i++){
                    Thread.sleep(300);
                    int progreso = i;

                    Platform.runLater(()->{
                        prgresbrAvanceGuardado.setProgress(progreso/10.0);
                        lblMensaje.setText("Guardando..." + (progreso * 10) + "%");

                        if((progreso * 10) == 100){
                            lblMensaje.setText("Guardado.");
                        }
                    });

                }

                ArchivoUtil.guardarPaquete(paquete);

                Platform.runLater(()->{
                    tfCodigo.clear();
                    tfNombreDestinatario.clear();
                    tfPesoPaquete.clear();
                    cmbDestino.setValue(null);
                });
                
            }catch(Exception e){
                System.out.println("Error al guardar el paquete " + e.getMessage());

            }finally{
                lblMensaje.setText("Paquete guardado con hilos exitosamente.");
                prgresbrAvanceGuardado.setProgress(0);

            }


        });

        hilo.start();
    }

    @FXML
    private Paquete crearPaquete(){
        String codigo = tfCodigo.getText();
        String destinatario = tfNombreDestinatario.getText();
        String pesoString = tfPesoPaquete.getText();

        Double peso = Double.parseDouble(pesoString);
        Destino destino = cmbDestino.getValue();

        if(codigo.isEmpty()){
            return null;
        }else if(destinatario.isEmpty()){
            return null;
        }else if(pesoString.isEmpty()){
            return null;
        }else if(destino == null){
            return null;
        }

        Paquete paquete = new Paquete(codigo, destinatario, peso, destino);

        return paquete;
    }

}
