package Controller;
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
    void AbrirConsultaDestino(ActionEvent event) {

    }

    @FXML
    void abrirConsultaPaquetes(ActionEvent event) {

    }

    @FXML
    void abrirRegistroDestinos(ActionEvent event) {

    }

    @FXML
    void abrirRegistroPaquetes(ActionEvent event) {

    }

    @FXML
    void salir(ActionEvent event) {

    }
}
