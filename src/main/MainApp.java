package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        File fxmlFile = new File("src/resources/main.fxml");
        URL fxmlLocation = fxmlFile.toURI().toURL();
        FXMLLoader loader = new FXMLLoader(fxmlLocation);

        Scene scene = new Scene(loader.load());
        stage.setTitle("Student Management System");
        stage.setScene(scene);
        stage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}