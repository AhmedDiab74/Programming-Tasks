package task6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Diab
 */
public class Task6 extends Application {

    /**
     * @throws java.lang.Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception {
            Line l = new Line(50, 400, 300, 400);
            Line l2 = new Line(50,50, 50, 400);
            Line l3 = new Line(50, 50, 300, 50);
            Line l4 = new Line(300, 30, 300, 70);
            Line l5 = new Line(310, 40, 310, 60);
            Line l6 = new Line(312, 50, 610, 50);
            Line l7 = new Line(610, 50, 610, 200);
            Line l8 = new Line(610, 90, 610, 400);
            Line l9 = new Line(380, 400, 610, 400);
            Line l10 = new Line(300, 400, 380, 380);
            Text t = new Text(270, 100, "Power Source");
            Text t2 = new Text(500, 200, "Light bulb");
            Text t3 = new Text(320, 430, "Switch");
            Circle c = new Circle(610, 200, 30);
            Circle c1 = new Circle(300, 400, 5);
            Circle c2 = new Circle(380, 400, 5);
            Button b = new Button("CLOSE");
            Button b2 = new Button("OPEN");
            FlowPane f = new FlowPane();
            f.setHgap(20);
            f.setVgap(20);
            f.getChildren().add(b2);
            f.getChildren().add(b);
            f.setAlignment(Pos.CENTER);
            b.setOnAction(e -> {
                l10.setEndY(400);
                c.setFill(Color.YELLOW);
            });
            b2.setOnAction(e -> {
                l10.setEndY(380);
                c.setFill(Color.WHITE);
            });
            c.setFill(Color.WHITE);
            c.setStroke(Color.BLACK);
            c1.setFill(Color.WHITE);
            c1.setStroke(Color.BLACK);
            c2.setFill(Color.WHITE);
            c2.setStroke(Color.BLACK);
            Pane p = new Pane();
            p.getChildren().add(l);
            p.getChildren().add(l2);
            p.getChildren().add(l3);
            p.getChildren().add(l4);
            p.getChildren().add(l5);
            p.getChildren().add(l6);
            p.getChildren().add(l7);
            p.getChildren().add(l8);
            p.getChildren().add(l9);
            p.getChildren().add(l10);
            p.getChildren().add(c);
            p.getChildren().add(c1);
            p.getChildren().add(c2);
            p.getChildren().add(f);
            p.getChildren().add(t);
            p.getChildren().add(t2);
            p.getChildren().add(t3);
            
            Scene s = new Scene(p,700,500);
            primaryStage.setScene(s);
            primaryStage.setTitle("Button Practice");
            primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
