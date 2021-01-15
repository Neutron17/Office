package neutron;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static double height = 300.0;
    public static double width = 300.0;
    public static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        height = stage.getHeight();
        width = stage.getWidth();
        stage.setTitle("Neutron Office");
        stage.setMaximized(true);
        stage.setMinHeight(300);
        stage.setMinWidth(300);
        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
