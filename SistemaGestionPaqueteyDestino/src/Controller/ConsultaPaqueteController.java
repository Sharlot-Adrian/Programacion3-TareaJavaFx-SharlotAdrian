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
import model.Paquete;
import utils.ArchivoUtil;

public class ConsultaPaqueteController {

    @FXML
    private Label lblMensaje;

    @FXML
    private TableView<Paquete> tbPaquetes;

    @FXML
    private Text txtTitulo;

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
    private ObservableList<Paquete> listaDestinos;

    @FXML
    public void initialize(){
        clmCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmDestinatario.setCellValueFactory(new PropertyValueFactory<>("destinatario"));
        clmPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        clmDestino.setCellValueFactory(new PropertyValueFactory<>("destino"));

        listaDestinos = FXCollections.observableArrayList(ArchivoUtil.leerPaquetes());
        tbPaquetes.setItems(listaDestinos);

        
    }

    @FXML
    void cargarArchivo(ActionEvent event) {

        if(!ArchivoUtil.leerPaquetes().isEmpty()){
            listaDestinos.setAll(ArchivoUtil.leerPaquetes());
        }
        else{
            lblMensaje.setText("Debes agregar paquetes nuevos antes de cargarlos. ");
        }
    }

}

