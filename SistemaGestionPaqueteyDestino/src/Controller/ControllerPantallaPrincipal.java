package controller;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.Text;
import utils.Navegacion;


public class ControllerPantallaPrincipal {

    @FXML
    private ProgressBar prgrsbrSimulacion;

    @FXML
    private MenuBar mnbrOpciones;

    @FXML
    private Text txtSubtitulo;

    @FXML
    private Text txtTitulo;

    @FXML
    private Label lblMensaje;

    @FXML
    void abrirConsultaDestino(ActionEvent event) {

        Navegacion.abrirVentana("/view/consultaDestinos.fxml", "Consulta de Destinos");
    }

    @FXML
    void abrirConsultaPaquete(ActionEvent event) {

        Navegacion.abrirVentana("/view/consultaPaquetes.fxml", "Consulta de Paquetes");

    }

    @FXML
    void abrirDemostracionHilos(ActionEvent event) {

        Thread hilo = new Thread(()->{
            try{

                for(int i = 0; i<=10;i++){
                    Thread.sleep(300);
                    int progreso = i;

                    Platform.runLater(()->{
                        prgrsbrSimulacion.setProgress(progreso/10.0);
                        lblMensaje.setText("Actualizando entorno con hilos..." + (progreso * 10) +"%");

                        if((progreso * 10) == 100){
                            lblMensaje.setText("Todo listo!");
                        }
                    });

                }


            }catch(Exception e){

            }finally{
                prgrsbrSimulacion.setProgress(0);
            }

        });
        hilo.start();
    }

    @FXML
    void abrirRegistroDestino(ActionEvent event) {

        Navegacion.abrirVentana("/view/registroDestino.fxml", "Registro de Destinos");

    }

    @FXML
    void abrirRegistroPaquete(ActionEvent event) {

        Navegacion.abrirVentana("/view/registroPaquete.fxml", "Registro de paquetes");

    }
    
    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }
}
