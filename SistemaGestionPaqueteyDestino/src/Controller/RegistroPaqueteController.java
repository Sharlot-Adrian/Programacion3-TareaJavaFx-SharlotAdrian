package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegistroPaqueteController {

    @FXML
    private Button bttCargarDestino;

    @FXML
    private Button bttGuardarArchivo;

    @FXML
    private ComboBox<String> cmbDestino;

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
    public void initialize(){
        cmbDestino = new ComboBox<String>();
        ObservableList<String> opcionesDestino = cmbDestino.getItems();
        opcionesDestino.add("Santo Domingo");
        opcionesDestino.add("Santiago");
        opcionesDestino.add("La Vega");
        
    }

    @FXML
    void cargarDestinos(ActionEvent event) {

    }

    @FXML
    void guardarEnArchivo(ActionEvent event) {

    }

}
