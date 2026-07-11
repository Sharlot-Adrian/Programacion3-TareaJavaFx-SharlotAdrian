package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegistroDestinoController {

    @FXML
    private Button bttCargarArchivo;

    @FXML
    private Button bttGuardarArchivo;

    @FXML
    private Label lblMensaje;

    @FXML
    private Label lblNombreDestino;

    @FXML
    private TableView<String> tbvwDestinosRegistrados;

    @FXML
    private TextField tfNombreDestino;

    @FXML
    private Text txtDestino;

    @FXML
    public void initialize(){
        //lstvwDestinosRegistrados.getItems().add();
    }

    @FXML
    void cargarArchivo(ActionEvent event) {

    }

    @FXML
    void guardarArchivo(ActionEvent event) {

    }

}

