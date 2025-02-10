import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

/**
 * A Driver to run and display the motepad.
 *
 * @author Aniekan Ekarika, Alamin Adeleke
 * @version 28/1/2025
 */
public class App extends Application
{
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        
        Date date1 = new Date();
        root.getChildren().addAll(date1);
        
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.show();
    }
}
