/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlmoviedatabase.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abdi
 */
public class CategorySceneController implements Initializable {

    @FXML
    private TextField txtField_name;
    @FXML
    private Button btn_saveCategory;
    @FXML
    private Button btn_closeScene;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handle_saveCategory(ActionEvent event) {
    }

    @FXML
    private void handle_closeScene(ActionEvent event) {
    }
    
}
