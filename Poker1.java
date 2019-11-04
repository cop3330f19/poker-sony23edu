/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sony3
 */
public class Poker1 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
       
        //load the FXML Scene
        Parent root = FXMLLoader.load(getClass().getResource("poker.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Poker");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
