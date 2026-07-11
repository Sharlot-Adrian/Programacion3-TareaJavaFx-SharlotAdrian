package controller;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.text.Text;
import utils.Navegacion;


public class ControllerPantallaPrincipal {

    @FXML
    private MenuBar mnbrOpciones;

    @FXML
    private Text txtSubtitulo;

    @FXML
    private Text txtTitulo;

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
