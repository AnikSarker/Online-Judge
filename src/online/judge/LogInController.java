/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Aspire
 */
public class LogInController implements Initializable {
    
    OnlineJudge main;
    
    @FXML
    private Label label;
    
    @FXML
    private void bLogIn(ActionEvent event) throws IOException {
        main.showHomePage();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    public void setMain(OnlineJudge scene){
        main=scene;
        
    } 
    
}