package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerPantallaPrincipal {

    private Stage pantallaPrincipal;

    public void setPantallaPrincipal(Stage stage){
        this.pantallaPrincipal = stage;
    }

    @FXML
    private MenuBar mnbrOpciones;

    @FXML
    private Text txtSubtitulo;

    @FXML
    private Text txtTitulo;

    @FXML
    void abrirConsultaDestino(ActionEvent event) {

    }

    @FXML
    void abrirConsultaPaquete(ActionEvent event) {

    }

    @FXML
    void abrirDemostracionHilos(ActionEvent event) {

    }

    @FXML
    void abrirRegistroDestino(ActionEvent event) {

    }

    @FXML
    void abrirRegistroPaquete(ActionEvent event) {

    }
    
    @FXML
    void salir(ActionEvent event) {

    }
}
