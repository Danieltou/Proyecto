/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendajarroba;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class proveedor {

    @FXML
    private ComboBox TipoIDCB;
    @FXML
    private TextField IDCuentaTF;
    @FXML
    private VBox emergenteC;
    @FXML
    private VBox emergenteP;
    @FXML
    private VBox emergenteCli;
    @FXML
    private Pane proveedorCP;
    @FXML
    private Pane modificarPP;
    @FXML
    private Pane clienteCrearP;
    @FXML
    private Pane modificarP;
    @FXML
    private Pane registroCP;
    @FXML
    private TextField emailEmTF;
    @FXML
    private TextField emailContTF;
    @FXML
    private Pane modificarClienteP;
    @FXML
    private Label valemialprov1;
    @FXML
    private Label valemialprov2;
    @FXML
    private TextField nomEmTF;
    @FXML
    private TextField telEmTF;
    @FXML
    private Label valnomEm;
    @FXML
    private Label valtelEm;
    @FXML
    private TextField nomContTF;
    @FXML
    private TextField apeContTF;
    @FXML
    private Label valnomCont;
    @FXML
    private Label valapeCont;
    @FXML private ComboBox provCH;
    @FXML private TextField nomPMTF;
    @FXML private TextField telPMTF;
    @FXML private TextField emailPTF;
    @FXML private TextField nomContMTF;
    @FXML private TextField apeContMTF;
    @FXML private TextField telContMTF;
    @FXML private TextField emailContMTF;
    @FXML private Label valemialprov3;
@FXML private Label valemialprov4;
@FXML private Label valnomProveedor;
@FXML private Label valtelProveedor;
@FXML private Label valcorreoProveedor;
@FXML private Label valnomContM;
@FXML private Label valapeContM;
@FXML private Label valtelContM;
@FXML private Label valcorreoContM;

    public void mostrarProveedor() {
        emergenteC.setVisible(false);
        emergenteP.setVisible(true);
        emergenteCli.setVisible(false);
    }

    public void mostrarModificar() {
        proveedorCP.setVisible(false);
        modificarPP.setVisible(true);
        modificarP.setVisible(false);
        registroCP.setVisible(false);
        clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
    }

    public void mostrarCrear() {

        proveedorCP.setVisible(true);
        modificarPP.setVisible(false);
        modificarP.setVisible(false);
        registroCP.setVisible(false);
        clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
    }

    public void valCrear() {
        String email = emailEmTF.getText();
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{3})?$");
        Matcher mat = pat.matcher(email);
        if (mat.find()) {
            valemialprov1.setVisible(false);
        } else {

            valemialprov1.setVisible(true);
        }

        String email2 = emailContTF.getText();
        Pattern pat2 = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{3})?$");
        Matcher mat2 = pat2.matcher(email2);
        if (mat2.find()) {
            valemialprov2.setVisible(false);
        } else {

            valemialprov2.setVisible(true);
        }


        if (nomEmTF.getText().equals("")) {
            valnomEm.setVisible(true);
        } else {

            valnomEm.setVisible(false);
        }
        if (telEmTF.getText().equals("")) {
            valtelEm.setVisible(true);
        } else {
            valtelEm.setVisible(false);
        }
        if (nomContTF.getText().equals("")) {
            valnomCont.setVisible(true);
        } else {
            valnomCont.setVisible(false);
        }

        if (apeContTF.getText().equals("")) {
            valapeCont.setVisible(true);
        } else {
            valapeCont.setVisible(false);
        }

    }
    public void  Modificar(){
    int selectedPerson =provCH.getSelectionModel().getSelectedIndex();
  
  if(selectedPerson==0){
  nomPMTF.setDisable(false);
  telPMTF.setDisable(false);
  emailPTF.setDisable(false);
  nomContMTF.setDisable(false);
  apeContMTF.setDisable(false);
  telContMTF.setDisable(false);
  emailContMTF.setDisable(false);
  
  nomPMTF.setText("sf");
  telPMTF.setText("sfsdfs");
  emailPTF.setText("sffhgh");
  nomContMTF.setText("sfsasfd");
  apeContMTF.setText("sffghgfh");
  telContMTF.setText("sfrwer");
  emailContMTF.setText("sfasdf");
  
  
  }
  if(selectedPerson==1){
   nomPMTF.setDisable(false);
  telPMTF.setDisable(false);
  emailPTF.setDisable(false);
  nomContMTF.setDisable(false);
  apeContMTF.setDisable(false);
  telContMTF.setDisable(false);
  emailContMTF.setDisable(false);
  
  nomPMTF.setText("sf");
  telPMTF.setText("sfsdfs");
  emailPTF.setText("sffhgh");
  nomContMTF.setText("sfsasfd");
  apeContMTF.setText("sffghgfh");
  telContMTF.setText("sfrwer");
  emailContMTF.setText("sfasdf");
  }
  if(selectedPerson==2){
    nomPMTF.setDisable(false);
  telPMTF.setDisable(false);
  emailPTF.setDisable(false);
  nomContMTF.setDisable(false);
  apeContMTF.setDisable(false);
  telContMTF.setDisable(false);
  emailContMTF.setDisable(false);
  
  nomPMTF.setText("sf");
  telPMTF.setText("sfsdfs");
  emailPTF.setText("sffhgh");
  nomContMTF.setText("sfsasfd");
  apeContMTF.setText("sffghgfh");
  telContMTF.setText("sfrwer");
  emailContMTF.setText("sfasdf");
  }
    }
    
    public  void valModificar(){
       String  email=emailPTF.getText();
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{3})?$");
        Matcher mat = pat.matcher(email);     
        if (mat.find()){
        valemialprov4.setVisible(false);
          }
          else {
         
          valemialprov4.setVisible(true);
          }
        
         String  email2=emailContMTF.getText();
        Pattern pat2 = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{3})?$");
        Matcher mat2 = pat2.matcher(email2);     
        if (mat2.find()){
        valemialprov3.setVisible(false);
          }
          else {
         
          valemialprov3.setVisible(true);
          }
         
         if (nomPMTF.getText().equals("")){
        valnomProveedor.setVisible(true);
          }
      
          else {
        
         valnomProveedor.setVisible(false);
          }
           if (telPMTF.getText().equals("")){
            valtelProveedor.setVisible(true);   
           }
           else{
           valtelProveedor.setVisible(false);  
           }
           
           
           if (emailPTF.getText().equals("")){
              valcorreoProveedor.setVisible(true);    
           }
           else{
               valcorreoProveedor.setVisible(false);
           }
           
                 if (nomContMTF.getText().equals("")){
            valnomContM.setVisible(true);    
             }
                 else{
                 valnomContM.setVisible(false); 
                 }
                 
                  
                  if (apeContMTF.getText().equals("")){
            valapeContM.setVisible(true);    
             }
                 else{
                 valapeContM.setVisible(false); 
                 }
                  
                  if (telContMTF.getText().equals("")){
            valtelContM.setVisible(true);    
             }
                 else{
                valtelContM.setVisible(false); 
                 }
                  
                  if (emailContMTF.getText().equals("")){
           valcorreoContM.setVisible(true);    
             }
                 else{
                 valcorreoContM.setVisible(false); 
                 }
    }
}
