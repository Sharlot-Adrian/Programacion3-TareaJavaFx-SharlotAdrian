package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import model.Destino;
import utils.ArchivoUtil;

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
    private TableView<Destino> tbvwDestinosRegistrados;

    @FXML
    private TextField tfNombreDestino;

    @FXML
    private Text txtDestino;

    @FXML
    private TableColumn<Destino, String> idCasillaDestinos;

    @FXML
    private ObservableList<Destino> listaDestinosFinal;

    @FXML
    public void initialize(){

        idCasillaDestinos.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        listaDestinosFinal = FXCollections.observableArrayList(ArchivoUtil.leerDestino());
        tbvwDestinosRegistrados.setItems(listaDestinosFinal);
    }

    @FXML
    void cargarArchivo(ActionEvent event) {
        listaDestinosFinal.setAll(ArchivoUtil.leerDestino());
    }

    @FXML
    void guardarArchivo(ActionEvent event) {

       String destinoTexto = tfNombreDestino.getText();
       Destino destino = new Destino(destinoTexto);
       ArchivoUtil.guardarDestino(destino);

    }

}

