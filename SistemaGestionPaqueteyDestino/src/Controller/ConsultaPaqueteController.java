package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import model.Paquete;

public class ConsultaPaqueteController {

    @FXML
    private Button bttCargarArchivo;

    @FXML
    private TableColumn<Paquete, String> clmCodigo;

    @FXML
    private TableColumn<Paquete, String> clmDestinatario;

    @FXML
    private TableColumn<Paquete, String> clmDestino;

    @FXML
    private TableColumn<Paquete, String> clmPeso;

    @FXML
    public void initialize(){
        
    }

    @FXML
    private Label lblMensaje;

    @FXML
    private TableView<?> tbPaquetes;

    @FXML
    private Text txtTitulo;

    @FXML
    void cargarArchivo(ActionEvent event) {

    }

}

