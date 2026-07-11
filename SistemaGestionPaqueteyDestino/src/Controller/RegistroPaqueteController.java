package controller;

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

    }

    @FXML
    void guardarEnArchivo(ActionEvent event) {

    }

    @FXML
    private void crearPaquete(){
        String codigo = tfCodigo.getText();
        String destinatario = tfNombreDestinatario.getText();
        String pesoString = tfPesoPaquete.getText();

        Double peso = Double.parseDouble(pesoString);
        Destino destino = cmbDestino.getValue();


    }

}
