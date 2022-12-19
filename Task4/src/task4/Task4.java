package task4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Diab
 */
public class Task4 extends Application{

    
 private final TableView<Record> tableView = new TableView<>();
 
    private final ObservableList<Record> dataList
            = FXCollections.observableArrayList();
    
    public class Record {
 
        private SimpleStringProperty f1, f2, f3;
 
        public String getF1() {
            return f1.get();
        }
 
        public String getF2() {
            return f2.get();
        }
 
        public String getF3() {
            return f3.get();
        }
 
       
        Record(String f1, String f2, String f3) {
            this.f1 = new SimpleStringProperty(f1);
            this.f2 = new SimpleStringProperty(f2);
            this.f3 = new SimpleStringProperty(f3);
            
        }
 
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        
            Button b1 = new Button("Submit");
            Button b2 = new Button("Clear");
            Label l1 = new Label("Firstname");
            Label l2 = new Label("Lastname");
            Label l3 = new Label("Email");
            TextField t1 = new TextField("");
            TextField t2 = new TextField();
            TextField t3 = new TextField();
            b1.setOnAction(e -> {
                try {
                    PrintWriter pw = new PrintWriter("file.csv");
                   
                     pw.write("First Name:    "+t1.getText()+"\nLast Name:    "+t2.getText()+"\nEmail:    "+t3.getText());                 
                     pw.flush();
                     pw.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Task4.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            GridPane p = new GridPane();
            p.setHgap(10);
            p.setVgap(10);
            p.setAlignment(Pos.CENTER);
            p.setPadding(new Insets(30));
            p.add(l1, 0, 0);
            p.add(t1, 1, 0);
            p.add(l2, 0,1 );
            p.add(t2, 1,1 );
            p.add(l3, 0,2 );
            p.add(t3, 1,2 );
            p.add(b1, 0,3 );
            p.add(b2, 1,3 );
            
            Scene s = new Scene(p,400,250);
            
            primaryStage.setTitle("Data App");
                primaryStage.centerOnScreen();
            primaryStage.setScene(s);
            primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
