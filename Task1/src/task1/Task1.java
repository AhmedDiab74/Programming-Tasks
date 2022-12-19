package task1;

import java.io.File;
import java.net.MalformedURLException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ِAhmed Diab
 */
public class Task1 extends Application implements Runnable {

    public static ImageView myImage = new ImageView();

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        (new Thread(new Task1())).start();
        StackPane p = new StackPane();
        p.getChildren().add(myImage);
        Scene scene = new Scene(p);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Task 1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void run() {

        try {

            File file1 = new File("/firstimage.jpg");
            File file2 = new File("/secondimage.jpg");
            File file3 = new File("/thirdimage.jpg");

            Image a = new Image(file1.toURI().toURL().toExternalForm());
            Image b = new Image(file2.toURI().toURL().toExternalForm());
            Image c = new Image(file3.toURI().toURL().toExternalForm());

            for (int i = 0; true; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                if (i % 2 == 0) {
                    myImage.setImage(a);
                    System.out.println("1");
                } else if (i % 3 == 0) {
                    myImage.setImage(b);
                    System.out.println("2");
                } else {
                    myImage.setImage(c);
                    System.out.println("3");
                }
            }

        } catch (MalformedURLException e) {
        }
    }

}
