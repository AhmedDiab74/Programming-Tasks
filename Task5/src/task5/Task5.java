/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Diab
 */
public class Task5 extends Application {

    /**
     * @throws java.lang.Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle c = new Circle(200,Color.WHITE);
        c.setStroke(Color.BLACK);
        Ellipse e = new Ellipse(440, 180,50,20);
        Ellipse e2 = new Ellipse(270, 180,50,20);
Polygon polygon = new Polygon(360,230,320,290,390,290);
Arc a = new Arc(360,270, 150,125,-45,-90);
        Pane b = new Pane();
       b.getChildren().add(e);
       b.getChildren().add(e2);
       b.getChildren().add(polygon);
       b.getChildren().add(a);
StackPane pp = new StackPane(c,b);

        Scene s = new Scene(pp, 700, 500);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Face");
        primaryStage.setScene(s);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
