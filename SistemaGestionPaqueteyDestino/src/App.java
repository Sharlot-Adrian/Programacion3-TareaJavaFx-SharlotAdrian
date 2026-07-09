import controller.ControllerPantallaPrincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/pantallaPrincipal.fxml"));
        Parent root = loader.load();
        ControllerPantallaPrincipal controller = loader.getController();
        controller.setPantallaPrincipal(primaryStage);

        primaryStage.setTitle("Sistema de registro - Paquetes y destino");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
}
