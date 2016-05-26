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
 * FXML Controller class
 *
 * @author Anik
 */
public class HomeAdminController implements Initializable {
    OnlineJudge main;
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void bContestChoice(ActionEvent event) throws IOException{
        main.showContestProblemChoice();
    }
    
    @FXML
    private void bLogIn(ActionEvent event) throws IOException {
        main.showLogIn();
    }

    public void setMain(OnlineJudge scene){
        main=scene;
    } 

    

    
}
