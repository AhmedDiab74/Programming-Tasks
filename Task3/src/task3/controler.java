/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author hp
 */
public class controler {
    @FXML
   public Button button;
    
    int i =1;
    @FXML
    public void act(ActionEvent e){
        
            button.setText("Presserd: "+i);
            i++;
        
    }
    public class PleaseProvideControllerClassName {
        
    }
}
