package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navegacion {

    public static <T> T abrirVentana(String ruta, String titulo){
        try{
            FXMLLoader loader = new FXMLLoader(Navegacion.class.getResource(ruta));

            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle(titulo);
            stage.show();

            return loader.getController();
            

        }catch(Exception e){
            throw new RuntimeException("Error al abrir "+ruta, e);
        }

    }
    
}
