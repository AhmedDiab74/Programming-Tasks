/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class Task3 extends Application {

    /**
     * @throws java.lang.Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("design.fxml"));
        Parent root = loader.load();
                Scene scene = new Scene(root);
;
        primaryStage.setScene(scene);
//        primaryStage.setResizable(false);
        primaryStage.setTitle("First App");
        primaryStage.show();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
