
package agendajarroba;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Cliente {
 

    @FXML
    private Pane modificarPP;
    @FXML
    private Pane clienteCrearP;
    @FXML
    private Pane modificarP;
    @FXML
    private Pane registroCP;
    @FXML
    private Pane proveedorCP;
     @FXML
    private Pane modificarClienteP;
      @FXML
    private VBox emergenteC;
    @FXML
    private VBox emergenteP;
    @FXML
    private VBox emergenteCli;
    @FXML private TextField telModClienteTF;
    @FXML private Label valtelClientemod;
     @FXML private TextField idModClienteTF;
@FXML private Label validClientemod;
  @FXML private ComboBox NomModClienteCB;
   @FXML private TextField apeModClienteTF;
    public void mostrarRegistrarCliente(){
     clienteCrearP.setVisible(true);
    modificarP.setVisible(false);
   registroCP.setVisible(false);
    proveedorCP.setVisible(false);
      modificarPP.setVisible(false);
       modificarClienteP.setVisible(false);
    }
    public  void mostrarCliente(){
        
       emergenteC.setVisible(false);
        emergenteP.setVisible(false);
       emergenteCli.setVisible(true);
    }
    public void mostrarModificar(){
     clienteCrearP.setVisible(false);
    modificarP.setVisible(false);
   registroCP.setVisible(false);
    proveedorCP.setVisible(false);
      modificarPP.setVisible(false);
      modificarClienteP.setVisible(true);
    }
    public void valModificar(){
     String  tel=telModClienteTF.getText();
        Pattern pat5 = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat5 = pat5.matcher(tel);     
         if (mat5.find()){ 
valtelClientemod.setVisible(false);   
           
           }
           else{   
valtelClientemod.setVisible(true); 
           }
       String  id=idModClienteTF.getText();
        Pattern pat = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat = pat.matcher(id);     
         if (mat.find()){ 
validClientemod.setVisible(false);   
           
           }
           else{   
validClientemod.setVisible(true); 
           } 
    }
    public void seleccionarCliente(){
     int selectedPerson =NomModClienteCB.getSelectionModel().getSelectedIndex();
  
  if(selectedPerson==0){
  telModClienteTF.setDisable(false);
  apeModClienteTF.setDisable(false);
 idModClienteTF.setDisable(false);
 
  
  telModClienteTF.setText("sf");
  apeModClienteTF.setText("sfsdfs");
  idModClienteTF.setText("sffhgh");
  }
  if(selectedPerson==1){
   telModClienteTF.setDisable(false);
  apeModClienteTF.setDisable(false);
 idModClienteTF.setDisable(false);
 
  
  telModClienteTF.setText("sdsf");
  apeModClienteTF.setText("sfsdjkjffs");
  idModClienteTF.setText("sffdsashgh");
  }
  if(selectedPerson==2){
    telModClienteTF.setDisable(false);
  apeModClienteTF.setDisable(false);
 idModClienteTF.setDisable(false);
 
  
  telModClienteTF.setText("saaff");
  apeModClienteTF.setText("sfsnmnxdfs");
  idModClienteTF.setText("sffffhjkhgh");
  }
    }
    
}
