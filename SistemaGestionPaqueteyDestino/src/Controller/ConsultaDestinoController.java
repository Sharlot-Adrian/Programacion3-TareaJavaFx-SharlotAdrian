package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import model.Destino;
import utils.ArchivoUtil;

public class ConsultaDestinoController {

    @FXML
    private Button bttCargarArchivo;

    @FXML
    private Label lblMensaje;

    @FXML
    private TableColumn<Destino, String> clmDestinos;

    @FXML
    private TableView<Destino> tbvwDestinos;

    @FXML
    private ObservableList<Destino> listaDestinos;

    @FXML
    private Text txtTitulo;

    @FXML
    public void initialize(){
        clmDestinos.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        listaDestinos = FXCollections.observableArrayList(ArchivoUtil.leerDestino());
        tbvwDestinos.setItems(listaDestinos);
    }

    @FXML
    void cargarArchivo(ActionEvent event) {

        if(!ArchivoUtil.leerDestino().isEmpty()){
            listaDestinos.setAll(ArchivoUtil.leerDestino());
        }
        else
            lblMensaje.setText("Debe agregar nuevos destinos para verlos en la lista. ");

    }

}

