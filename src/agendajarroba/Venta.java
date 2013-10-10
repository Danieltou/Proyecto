
package agendajarroba;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class Venta {
    
    @FXML private ComboBox seleccionventaCB;
     
@FXML private TextField fechaconvenTF;
@FXML private TextField totalconvenTF;
@FXML private TextField nombreconvenTF;
@FXML private TextField idconvenTF;
@FXML private TextField apellidoconvenTF;
@FXML private TextField idprodconvenTF;
@FXML private TextField nomprodconvenTF;
@FXML private TextField ivaprodconvenTF;
@FXML private TextField valunprodconvenTF;
@FXML private TextField cantprodconvenTF;
@FXML private TextField subtotprodconvenTF;
@FXML private TextField telModClienteTF;
 @FXML private TextField apeModClienteTF;
  @FXML private TextField idModClienteTF;
      @FXML private CheckBox comboanular;
    public void seleccionarVenta(){
        int selectedPerson =seleccionventaCB.getSelectionModel().getSelectedIndex();
        
  
  if(selectedPerson==0){
      
      fechaconvenTF.setText("1/2/3");
totalconvenTF.setText("12334");
nombreconvenTF.setText("sss");
idconvenTF.setText("245");
apellidoconvenTF.setText("dass");
idprodconvenTF.setText("543");
nomprodconvenTF.setText("ahj");
ivaprodconvenTF.setText("234");
valunprodconvenTF.setText("2341");
cantprodconvenTF.setText("23");
subtotprodconvenTF.setText("5642");  
  telModClienteTF.setText("14353421");
  apeModClienteTF.setText("dfwa");
  idModClienteTF.setText("321");
  comboanular.setVisible(true);
  }
  if(selectedPerson==1){
    fechaconvenTF.setText("6/5/4");
totalconvenTF.setText("123as34");
nombreconvenTF.setText("ss234s");
idconvenTF.setText("2e445");
apellidoconvenTF.setText("da34ss");
idprodconvenTF.setText("54sa3");
nomprodconvenTF.setText("ah21j");
ivaprodconvenTF.setText("234def");
valunprodconvenTF.setText("22341");
cantprodconvenTF.setText("2334");
subtotprodconvenTF.setText("51a642");  
  telModClienteTF.setText("1435sf3421");
  apeModClienteTF.setText("df34wa");
  idModClienteTF.setText("3a21");
  comboanular.setVisible(true);
  }
  if(selectedPerson==2){
   fechaconvenTF.setText("1/22/3");
totalconvenTF.setText("1232334");
nombreconvenTF.setText("ssads");
idconvenTF.setText("24asd5");
apellidoconvenTF.setText("ddasass");
idprodconvenTF.setText("54343");
nomprodconvenTF.setText("ahasj");
ivaprodconvenTF.setText("2334");
valunprodconvenTF.setText("254341");
cantprodconvenTF.setText("2523");
subtotprodconvenTF.setText("56322");  
  telModClienteTF.setText("1435fasd3421");
  apeModClienteTF.setText("d4wa");
  idModClienteTF.setText("3231");
  comboanular.setVisible(true);
  }
  
    }
}
