/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendajarroba;

import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Richard
 */
public class AgendaJarroba extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Vista.fxml"));
        
              int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
   int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
   

     Toolkit t = Toolkit.getDefaultToolkit();
     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     
     stage.setHeight(alto-50);
     stage.setWidth(ancho);
     
     
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/agendajarroba/css.css");
        stage.setScene(scene);
        stage.show();
    }

    
   
    public static void main(String[] args) {
        launch(args);
    }
}
