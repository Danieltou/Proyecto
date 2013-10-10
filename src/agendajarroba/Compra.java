
package agendajarroba;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


public class Compra {
    
          @FXML private Pane emergenteCLienteP;
            @FXML private AnchorPane compra;
              @FXML private TextField nomCLienteTF;
              @FXML private Label valNomCliente;
@FXML private Label valapeCLiente;
 @FXML private TextField idCLiente2TF;
@FXML private Label validCliente;
     @FXML private ScrollPane consVentaP;
     @FXML private ScrollPane consCompraP;
        @FXML private Pane AnularVenP;

 @FXML private TextField apeCLiente2TF;
 
      @FXML private ScrollPane compraSP;
      @FXML private ScrollPane ventaSP;
          @FXML private TextField fechaVentTF;
          @FXML private ComboBox clienteCB;
           @FXML private TextField nomClienteTF;
    @FXML private TextField apeCLienteTF; 
      @FXML private TextField canFacturaTF;
      @FXML private Label valCantidadFac;
       String val7;
        @FXML private GridPane prod1;
        VistaController esta_mierda = new VistaController();
         @FXML private TextField fechaconcomTF;
@FXML private TextField totalconcomTF;
@FXML private TextField nombreconcomTF;
@FXML private TextField idconcomTF;
@FXML private TextField apellidoconcomTF;
@FXML private TextField idprodconcomTF;
@FXML private TextField nomprodconcomTF;
@FXML private TextField ivaprodconcomTF;
@FXML private TextField valunprodconcomTF;
@FXML private TextField cantprodconcomTF;
@FXML private TextField subtotprodconcomTF;
@FXML private CheckBox comboanularcompra;

    public void mostrar(){
    compra.setDisable(true);
emergenteCLienteP.setVisible(true);
    }
    public void validarCliente(){
    if (nomCLienteTF.getText().equals("")){
              valNomCliente.setVisible(true);    
           }
           else{
               valNomCliente.setVisible(false);
           }
           
                 if (apeCLiente2TF.getText().equals("")){
            valapeCLiente.setVisible(true);    
             }
                 else{
                 valapeCLiente.setVisible(false); 
                 }
                 
                  
                  if (idCLiente2TF.getText().equals("")){
            validCliente.setVisible(true);    
             }
                 else{
                 validCliente.setVisible(false); 
                 }
                  
                 
          
          
          if(!nomCLienteTF.getText().equals("")&&!apeCLiente2TF.getText().equals("")&&!idCLiente2TF.getText().equals("")){
          compra.setDisable(false);
emergenteCLienteP.setVisible(false);
}
    }
    public void fecha(){
        consCompraP.setVisible(false);
consVentaP.setVisible(false);
           AnularVenP.setVisible(false);
     compraSP.setVisible(true); 
     ventaSP.setVisible(false); 
      java.util.Date fecha = new Date();
  int dia=fecha.getDate();
  int mes=fecha.getMonth()+1;
  int anio=fecha.getYear()+1900;
  String d = Integer.toString(dia);
  String m = Integer.toString(mes);
  String a = Integer.toString(anio);
  fechaVentTF.setDisable(true);
      fechaVentTF.setText(d+"/"+m+"/"+a);
    }
    public void llenarCliente(){
              int selectedPerson =clienteCB.getSelectionModel().getSelectedIndex();
      if(selectedPerson==0){
  nomClienteTF.setText("nombre1");
  apeCLienteTF.setText("apellido2");
  }
      if(selectedPerson==1){
  nomClienteTF.setText("nombre2");
  apeCLienteTF.setText("apellido1");
  }
     
    }
    public void valProducto(){
    String  cant=canFacturaTF.getText();
        Pattern pat = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat = pat.matcher(cant);     
        if (mat.find()){
            val7="7";
        valCantidadFac.setVisible(false);
          }
          else {
         val7="no";
          valCantidadFac.setVisible(true);
          }
         if(val7.equals("7")){
         prod1.setVisible(true); 
         }
    }
    public void seleccionarCompra(ComboBox seleccioncompraCB,TextField fechaconcomTF){
     int selectedPerson =seleccioncompraCB.getSelectionModel().getSelectedIndex();
  
  if(selectedPerson==0){
      
     fechaconcomTF.setText("1/2/3");

  }
    }
}
