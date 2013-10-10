package agendajarroba;

import Persona.Persona;
import java.awt.Dialog;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.MenuItem;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialogs;
import javafx.scene.control.Tooltip;
import javafx.stage.Modality;
import javafx.stage.Stage;




import np.com.ngopal.control.AutoFillTextBox;


public class VistaController implements Initializable {

private int seleccionIndice,seleccionIndice2,seleccionIndice3,seleccionIndice4,seleccionIndice5;
private String nombreProd;
    // Declaramos los botones
    @FXML private Button aniadirBT;
    @FXML private Button modificarBT;
    @FXML private Button nuevoBT;
    @FXML private Button reporteBt;
    @FXML private Button reciboBT;
    @FXML private Button cambioBT;
    @FXML private Button cuentasBT;
    @FXML private Button crearCBT;
    @FXML private Button eliminarCBT;
    @FXML private Button modificarCBT;
    @FXML private Button menos1;
    @FXML private Button menos2;
    @FXML private Button menos3;
    @FXML private Button menos4;
    @FXML private Button menos5;
    @FXML private Button menosV1;
    @FXML private Button menosV2;
    @FXML private Button menosV3;
    @FXML private Button menosV4;
    @FXML private Button menosV5; 
    @FXML private Button AnularComBT;
     
    
    // Declaramos los textfileds
    @FXML private TextField nombreTF;
    @FXML private TextField nombre;
    @FXML private TextField apellidoTF;
    @FXML private TextField edadTF;

    @FXML private TextField telefono1TF;
    @FXML private TextField telefono2TF;
    @FXML private TextField idreporteTF;
    @FXML private TextField nomreporteTF;
    @FXML private TextField cantreporteTF;
    @FXML private TextField idreciboTF;
    @FXML private TextField nomreciboTF;
    @FXML private TextField cantreciboTF;
    @FXML private TextField nomCTF;
    @FXML private PasswordField contCTF;
    @FXML private PasswordField recontCTF;
    @FXML private TextField nom2CTF;
    @FXML private TextField apeCTF;
    @FXML private TextField telCTF;
    @FXML private TextField dirCTF;
    @FXML private TextField nomMTF;
    @FXML private PasswordField contMTF;
    @FXML private PasswordField recontMTF;
    @FXML private TextField apeMTF;
    @FXML private TextField telMTF;
    @FXML private TextField dirMTF;
    @FXML private TextField facturaconTF;
    @FXML private TextField nomEmTF;
    @FXML private TextField telEmTF;
    @FXML private TextField nomContTF;
    @FXML private TextField apeContTF;
    @FXML private TextField nomPMTF;
    @FXML private TextField telPMTF;
    @FXML private TextField emailPTF;
    @FXML private TextField nomContMTF;
    @FXML private TextField apeContMTF;
    @FXML private TextField telContMTF;
    @FXML private TextField emailContMTF;
    @FXML private TextField nomloginTF;
    @FXML private TextField contraloginTF;
    @FXML private TextField nomClienteTF;
    @FXML private TextField apeCLienteTF; 

    
     @FXML private TextField nomCLienteTF;
    @FXML private TextField canFacturaTF;
    @FXML private TextField fechaVentTF;
@FXML private TextField telModClienteTF;
 @FXML private TextField idCLiente2TF;
 @FXML private TextField apeCLiente2TF;
 @FXML private TextField apeModClienteTF;
 @FXML private TextField idModClienteTF;
 @FXML private TextField emailEmTF;
@FXML private TextField emailContTF;
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
@FXML private TextField diaTF;
@FXML private TextField mesTF;
@FXML private TextField anioTF;
@FXML private TextField nomusMTF;
@FXML private TextField idMTF;



private Dialogs.DialogResponse Confirmacion;
  
       
    // Declaramos la tabla y las columnas
    @FXML private TableView<Persona> tablaPersonas;
    @FXML private TableColumn nombreCL;
    @FXML private TableColumn apellidoCL;
    @FXML private TableColumn edadCL;
    @FXML private TableColumn telefonoCL;
    @FXML private TableColumn telefono1CL;
    @FXML private TableColumn telefono2CL;
    @FXML private TableColumn EstadoCL;
    @FXML private TableColumn Colmedida;
    @FXML private TableColumn colPresentacion;
    @FXML private TableColumn colClasificacion;
    
    
    
    //Declaramos los label de las validaciones
    @FXML private Label valid;
    @FXML private Label nomval;
    @FXML private Label ival;
    @FXML private Label ival2;
    @FXML private Label unval;
    @FXML private Label stock_mval;
    @FXML private Label stock_maxval;
    @FXML private Label habval;
    @FXML private Label idreporteval;
    @FXML private Label cantreporteval;
    @FXML private Label idreciboval;
    @FXML private Label cantreciboval;
    @FXML private Label valnomC;
    @FXML private Label valcontC;
    @FXML private Label valrecontC;
    @FXML private Label valnom2C;
    @FXML private Label valapeC;
    @FXML private Label valdirC;
    @FXML private Label valtelC;
    @FXML private Label valcoinC;
    @FXML private Label valnomM;
    @FXML private Label valapeM;
    @FXML private Label valdirM;
    @FXML private Label valtelM;
    @FXML private Label prueba;
    @FXML private Label valnomEm;
    @FXML private Label valtelEm;
    @FXML private Label valnomCont;
    @FXML private Label valapeCont;
@FXML private Label valnomProveedor;
@FXML private Label valtelProveedor;
@FXML private Label valcorreoProveedor;
@FXML private Label valnomContM;
@FXML private Label valapeContM;
@FXML private Label valtelContM;
@FXML private Label valcorreoContM;
@FXML private Label valLogin;
@FXML private Label valCantP;
@FXML private Label validentificacion;
@FXML private Label valNomCliente;
@FXML private Label valapeCLiente;
@FXML private Label validCliente;
@FXML private Label valCantidadFac;
@FXML private Label  valapeClientemod;
@FXML private Label valtelClientemod;
@FXML private Label validClientemod;
@FXML private Label valemialprov1;
@FXML private Label valemialprov2;
@FXML private Label valemialprov3;
@FXML private Label valemialprov4;
@FXML private Label nombreTamaño;
@FXML private Label tamañoIva;
@FXML private Label tamañoCantidad;
@FXML private Label tamañomarca;
@FXML private Label tamañoStock_m;
@FXML private Label tamañoStock_max;
@FXML private Label laberEstado;
@FXML private Label labelPresentacion;
@FXML private Label labelMarca;
@FXML private Label labelMedida;
@FXML private Label labelClasificacion;

SimpleBooleanProperty maximizeProperty;

 



      //Declaramos los paneles
@FXML private Pane PproductosMaestra;
     @FXML private Pane productoP;
     @FXML private Pane cambioP;
     @FXML private Pane reporteP;
     @FXML private Pane reciboP;
     @FXML private Pane registroCP;
     @FXML private Pane modificarP;
     @FXML private Pane proveedorCP;
     @FXML private Pane modificarPP;
     @FXML private Pane login;
     @FXML private AnchorPane compra;
      @FXML private ScrollPane compraSP;
      @FXML private ScrollPane ventaSP;
      @FXML private AnchorPane venta;
      @FXML private AnchorPane ventanaprincipal;
      @FXML private Pane administradorLog;
     @FXML private Pane busquedaConC;
     @FXML private Pane clienteCrearP;
      @FXML private Pane AnularVenP;
     @FXML private Pane emergenteCLienteP;
     @FXML private Pane modificarClienteP;
     @FXML private Pane crearproveedorfacP;
     @FXML private ScrollPane consVentaP;
     @FXML private ScrollPane consCompraP;
      
    //Declaramos los VBox
    
  @FXML private VBox  emergenteC;
  @FXML private VBox  emergenteP;
  @FXML private VBox emergenteCli;
 
    ObservableList<Persona> personas;
    
    //Declaramos los comboBox
      @FXML private ComboBox nomCH;
      @FXML private ComboBox provCH;
      @FXML private ComboBox clienteCB;
      @FXML private ComboBox estadoCB;
      @FXML private ComboBox NomReciboCB;
     @FXML private ComboBox  comboMarca;
 @FXML private ComboBox comoMedida;
 @FXML private ComboBox comboPresentacion;
 @FXML private ComboBox comboClasificacion;
 @FXML private ComboBox TipoIDCB;
 @FXML private ComboBox  tipoidCentaMCB;
      
      @FXML private ComboBox NomModClienteCB;
      @FXML private ComboBox seleccionventaCB;
      @FXML private CheckBox comboanular;
     @FXML private CheckBox comboanularcompra;
     @FXML private ComboBox reportprodCB;
    @FXML private ComboBox seleccioncompraCB;
      
      //Declaramos los grid pane
       @FXML private GridPane prod1;
       @FXML private GridPane prod2;
       @FXML private GridPane prod3;
       @FXML private GridPane prod4;
       @FXML private GridPane prod5;
       @FXML private GridPane venta1;
       @FXML private GridPane venta2;
       @FXML private GridPane venta3;
       @FXML private GridPane venta4;
       @FXML private GridPane venta5;
       @FXML private GridPane grid1;
       @FXML private GridPane gridFactura;
         @FXML
    private TextField IDCuentaTF;
       
       String Estado;
       String val1;
      String val2;  
      String val3;  
      String val4;
      String val5;
      String val6;
      String val7;
      String val8;
       
     AutoFillTextBox busquedaRecibo;   
    AutoFillTextBox box;
     AutoFillTextBox box1;
      AutoFillTextBox box2;
       AutoFillTextBox box3;
        AutoFillTextBox box4;
         AutoFillTextBox box5;
        
       
     @FXML private MenuItem menupruebaM;
         ObservableList observableCuenta;
         ObservableList marca;
         ObservableList medida;
         ObservableList presentacion;
         ObservableList clasificacion;
         ObservableList EstadoObservable;
         ObservableList tipoDoc;
         ObservableList cuentaLogin;
         ObservableList contraseniaLogin;
        
 public VistaController(){
 String[] se  = new String[]{"deshabilitado","habilitado"};
 EstadoObservable = FXCollections.observableArrayList(); 
  for(int j=0; j<se.length; j++){
                EstadoObservable.add(se[j]);
            }
  String[] se2  = new String[]{"cedula","otro"};
  tipoDoc=FXCollections.observableArrayList();
 for(int j=0; j<se2.length; j++){
                tipoDoc.add(se[j]);
            }
   
    ObservableList data = FXCollections.observableArrayList();              
        String[] s = new String[]{"Chivas","Cocacola","aguardiente","pilsen","aguila","colinas","Old pack","123","1234","4521","4522","4532","6321","6542"};

            for(int j=0; j<s.length; j++){
                data.add(s[j]);
            }
              box = new AutoFillTextBox(data);
              box1 = new AutoFillTextBox(data);
              box2 = new AutoFillTextBox(data);
              box3 = new AutoFillTextBox(data);
              box4 = new AutoFillTextBox(data);
              box5 = new AutoFillTextBox(data);
              
     
              busquedaRecibo = new AutoFillTextBox(data);        

}      
    
    private int posicionPersonaEnTabla;
    
    @FXML private void  logear (ActionEvent event) {
encriptar enc = new encriptar();
 this.cuentaLogin = FXCollections.observableArrayList(); 
  this.contraseniaLogin = FXCollections.observableArrayList(); 
        try {    
        
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("select distinct nombre_cuenta,contrasenia from cuenta"));

            while (con.getResultado().next()) {
                
                cuentaLogin.add(con.getResultado().getObject("nombre_cuenta"));
                contraseniaLogin.add(con.getResultado().getObject("contrasenia"));
                
            }
            con.desconectar(); 
           
        }
        catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Object cuent : cuentaLogin) {
            
            for (Object contra : contraseniaLogin) {
                
                  if (nomloginTF.getText().equals(cuent)&&enc.encriptaEnMD5(contraloginTF.getText()).equals(contra)){
    login.setVisible(false);
    administradorLog.setVisible(true);
    valLogin.setVisible(false);
    }
    else{
   valLogin.setVisible(true);
}
            }
  
        }
}
    @FXML private void  cerrarSesion (ActionEvent event) {
    login.setVisible(true);
    administradorLog.setVisible(false);
    }
    
    
   
    
 
    
    //--------------------------------------------------Configuracion------------------------------------------------------\\
    
    
    ////////////////////////PRODUCTOS
    
     //productos
    @FXML public void productosMaestra () {
    PproductosMaestra.setVisible(true);
    }
    
    
    
    
    
    
    /////////////CUENTA
    
   
    

    @FXML public void cuenta () {

      emergenteC.setVisible(true);
      emergenteP.setVisible(false);
      emergenteCli.setVisible(false);
     }
    Cuenta cuenta = new Cuenta();
    @FXML
private void SeleccionTipo() {
    int selectedPerson = TipoIDCB.getSelectionModel().getSelectedIndex();

        if (selectedPerson == 0) {
            IDCuentaTF.setDisable(false);
        }
        if (selectedPerson == 1) {
            IDCuentaTF.setDisable(false);
        }
  }
    
    @FXML
private void ModificarS() throws SQLException {
   String valCuenta=(String) nomCH.getSelectionModel().getSelectedItem();
      Conexion cons = new Conexion();
          int idadm=0;
          String comboTipo;
        try {
            String idadmin;
             
            cons.conectar();
             cons.setResultado(cons.getStatement().executeQuery( "SELECT c.contrasenia,c.estado,c.nombre_cuenta,a.nombre_persona,a.telefono,a.direccion,a.apellido_persona,a.identificacion,\n" +
"a.tipo_identificacion\n" +
" FROM mydb.cuenta c\n" +
"join  administrador a on c.administrador_idadministrador=a.idadministrador\n" +
"where c.nombre_cuenta="+"'"+valCuenta+"'"));

            while (cons.getResultado().next()) {
                
             nomusMTF.setText(cons.getResultado().getString("c.nombre_cuenta"));
             nomMTF.setText(cons.getResultado().getString("a.nombre_persona"));
             apeMTF.setText(cons.getResultado().getString("a.apellido_persona")); 
             telMTF.setText(cons.getResultado().getString("a.telefono"));
             dirMTF.setText(cons.getResultado().getString("a.direccion"));
             idMTF.setText(cons.getResultado().getString("a.identificacion"));
             String idBase=cons.getResultado().getString("a.tipo_identificacion");
             for (Object e: tipoDoc){
 comboTipo=e.toString();
  if (idBase.equals(comboTipo)){
            seleccionIndice5=tipoDoc.indexOf(e);
                            }
 }
             tipoidCentaMCB.getSelectionModel().select(seleccionIndice5);
             

            }
            nomusMTF.setDisable(false);
             nomMTF.setDisable(false);
  recontMTF.setDisable(false);
  apeMTF.setDisable(false);
  telMTF.setDisable(false);
  dirMTF.setDisable(false);
  }
          catch (SQLException e) {
            cons.getConexion().rollback();
          
        } finally {
            cons.desconectar();
        }
}
     
   
     @FXML private void  regi (ActionEvent event) {
      registroCP.setVisible(true);
      modificarP.setVisible(false);
       proveedorCP.setVisible(false);
      modificarPP.setVisible(false);
      clienteCrearP.setVisible(false);
       modificarClienteP.setVisible(false);
      
     }
     
  @FXML private void modificarC (ActionEvent event) {
  modificarP.setVisible(true);
   registroCP.setVisible(false);
    proveedorCP.setVisible(false);
      modificarPP.setVisible(false);
       clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
      
  }
  
  @FXML private void valmodificarcuenta (ActionEvent event) {
      Dialogs.showConfirmDialog(null, "Desea guardar los cambios?", "insertar producto", "Informacion", Dialogs.DialogOptions.YES_NO);
      if (nomMTF.getText().equals("")){
        valnomM.setVisible(true);
          }
      
          else {
        
          valnomM.setVisible(false);
          }
          
           
           
         if (apeMTF.getText().equals("")){
              valapeM.setVisible(true);    
           }
           else{
                valapeM.setVisible(false); 
                 
           }
         if (dirMTF.getText().equals("")){
             valdirM.setVisible(true);    
           }
           else{
                valdirM.setVisible(false); 
                        
           }
          if (telMTF.getText().equals("")){
           valtelM.setVisible(true);    
           }
           else{
               valtelM.setVisible(false); 
                  
           }

    }
  
  
  private int autoCuenta() throws SQLException{
          Conexion cons = new Conexion();
          int idadm=0;
        try {
            String idadmin;
             
            cons.conectar();
             cons.setResultado(cons.getStatement().executeQuery("SELECT idadministrador+1 FROM mydb.administrador\n" +
"order by idadministrador desc\n" +
"limit 1"));

            while (cons.getResultado().next()) {
                
              idadmin= cons.getResultado().getString("idadministrador+1");
                idadm=Integer.parseInt( idadmin);
            }
  }
          catch (SQLException e) {
            cons.getConexion().rollback();
          
        } finally {
            cons.desconectar();
        }
        return idadm;
  }
  
  
    @FXML private void valcrearcuenta (ActionEvent event) throws SQLException {
        int nom=0,contc=0,recont=0,nom2=0,ape=0,dir=0,tel=0,idcuenta=0;
      if (nomCTF.getText().equals("")){
        valnomC.setVisible(true);
        nom=0;
          }
      
          else {
          valnomC.setVisible(false);
          nom=1;
          }
           if (contCTF.getText().equals("")){
            valcontC.setVisible(true); 
            contc=0;
           }
           else{
          
           valcontC.setVisible(false); 
           contc=1;
           }
           if (recontCTF.getText().equals("")){
               recont=0;
              valrecontC.setVisible(true);    
           }
           else{
               
                valrecontC.setVisible(false);
                 if (contCTF.getText().equals(recontCTF.getText())){
                    recont=1;
valcoinC.setVisible(false);    
}
           else{
                     recont=0;
  valcoinC.setVisible(true);
}
                            
           }
           
            if (nom2CTF.getText().equals("")){
                nom2=0;
              valnom2C.setVisible(true);    
           }
           else{
                nom2=1;
                valnom2C.setVisible(false); 
                
                   
           }
         if (apeCTF.getText().equals("")){
             ape=0;
              valapeC.setVisible(true);    
           }
           else{
             ape=1;
                valapeC.setVisible(false); 
                 
           }
         if (dirCTF.getText().equals("")){
             dir=0;
             valdirC.setVisible(true);    
           }
           else{
             dir=1;
                valdirC.setVisible(false); 
                        
           }
          if (telCTF.getText().equals("")){
              tel=0;
           valtelC.setVisible(true);    
           }
           else{
              tel=1;
               valtelC.setVisible(false); 
                  
           }
          if (IDCuentaTF.getText().equals("")){
              idcuenta=0;
           validentificacion.setVisible(true);    
           }
           else{
              idcuenta=1;
              validentificacion.setVisible(false); 
                  
           }
         if( nom==0&&contc==0&&recont==0&&nom2==0&&ape==0&&dir==0&&tel==0&&idcuenta==0){
         
         }
         else {
             encriptar enc = new encriptar();
             
            String contraEncriptada= enc.encriptaEnMD5(contCTF.getText());
              Confirmacion= Dialogs.showConfirmDialog(null, "Desea guardar los cambios?", "insertar Administrador", "Informacion", Dialogs.DialogOptions.YES_NO);
             if(Dialogs.DialogResponse.YES==Confirmacion){
             Conexion con = new Conexion(); 
             try{
                 con.conectar();
         con.getConexion().setAutoCommit(false);
            con.procedimiento("{ CALL insertarCuenta(?,?,?,?,?,?,?,?,?) }");
            con.getProcedimiento().setString("nombre_per", nom2CTF.getText());
            con.getProcedimiento().setString("tel",telCTF.getText());
            con.getProcedimiento().setString("dir", dirCTF.getText());             
            con.getProcedimiento().setString("ape", apeCTF.getText());
            con.getProcedimiento().setString("ident",IDCuentaTF.getText());
            con.getProcedimiento().setString("tipoident",TipoIDCB.getSelectionModel().getSelectedItem().toString());
            con.getProcedimiento().setString("nomcuenta", nomCTF.getText());
            con.getProcedimiento().setString("contra", contraEncriptada);
            con.getProcedimiento().setInt("idadmin",autoCuenta());
            
            con.getProcedimiento().execute();            
        												  
            con.getConexion().commit();
            System.out.print("funciona");
               }
         catch (SQLException e) {
            con.getConexion().rollback();
            Dialogs.showErrorDialog(null, "Error al insertar el producto", "","error", Dialogs.DialogOptions.OK);
          
        } finally {
            con.desconectar();
        }
     
         }
         }
         

          
         
    }
              
    
        public SimpleBooleanProperty maximizeProperty() {
        return maximizeProperty;
    }
         
    
///////////////PROVEEDOR    
     @FXML private void proveedor () {
       emergenteC.setVisible(false);
        emergenteP.setVisible(true);
       emergenteCli.setVisible(false);
     }
     
      @FXML private void  registroP (ActionEvent event) {
      proveedorCP.setVisible(true);
      modificarPP.setVisible(false);
      modificarP.setVisible(false);
      registroCP.setVisible(false);
       clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
     }
      
       @FXML private void  modPP (ActionEvent event) {
      proveedorCP.setVisible(false);
      modificarPP.setVisible(true);
      modificarP.setVisible(false);
      registroCP.setVisible(false);
       clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
     }
     @FXML private void  valcrearproveedor (ActionEvent event) {      
                 String  email=emailEmTF.getText();
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{3})?$");
        Matcher mat = pat.matcher(email);     
        if (mat.find()){
        valemialprov1.setVisible(false);
          }
          else {
         
          valemialprov1.setVisible(true);
          }
        
         String  email2=emailContTF.getText();
        Pattern pat2 = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{3})?$");
        Matcher mat2 = pat2.matcher(email2);     
        if (mat2.find()){
        valemialprov2.setVisible(false);
          }
          else {
         
          valemialprov2.setVisible(true);
          }
        
        
          if (nomEmTF.getText().equals("")){
        valnomEm.setVisible(true);
          }
      
          else {
        
         valnomEm.setVisible(false);
          }
           if (telEmTF.getText().equals("")){
            valtelEm.setVisible(true);   
           }
           else{
           valtelEm.setVisible(false);  
           }
           if (nomContTF.getText().equals("")){
              valnomCont.setVisible(true);    
           }
           else{
                valnomCont.setVisible(false);
           }
           
                 if ( apeContTF.getText().equals("")){
            valapeCont.setVisible(true);    
             }
                 else{
                 valapeCont.setVisible(false); 
                 }
        
     
     }
     
     @FXML
private void Modificarproveedor() {
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
     
     @FXML private void  valmodificarproveedor (ActionEvent event) {
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
    
     ///////////////CLIENTE
    @FXML private void  regiCliente (ActionEvent event) {  
    clienteCrearP.setVisible(true);
    modificarP.setVisible(false);
   registroCP.setVisible(false);
    proveedorCP.setVisible(false);
      modificarPP.setVisible(false);
       modificarClienteP.setVisible(false);
    }
     
      @FXML private void cliente () {
      emergenteC.setVisible(false);
        emergenteP.setVisible(false);
       emergenteCli.setVisible(true);
      }
      
     @FXML private void  modificarCliente (ActionEvent event) {
     clienteCrearP.setVisible(false);
    modificarP.setVisible(false);
   registroCP.setVisible(false);
    proveedorCP.setVisible(false);
      modificarPP.setVisible(false);
      modificarClienteP.setVisible(true);
     }  
     
     
    @FXML private void  valModificarCliente (ActionEvent event){
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
   @FXML private void  SeleccionClienteMod (ActionEvent event){
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
      
     
     //--------------------------------------------------factura------------------------------------------------------\\
//////////compra
     

      
      @FXML private void crearNuevo(ActionEvent event) {
compra.setDisable(true);
emergenteCLienteP.setVisible(true);
      }
       @FXML private void seleccionCliente2(ActionEvent event) {
idCLiente2TF.setDisable(false);
      }
      
      @FXML private void valCLiente(ActionEvent event) {
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
      
      @FXML private void regresar(ActionEvent event) {
compra.setDisable(false);
emergenteCLienteP.setVisible(false);
      }
      
    
     @FXML private void anularCom(ActionEvent event) {
     consCompraP.setVisible(false);
consVentaP.setVisible(true);
       compraSP.setVisible(false); 
     ventaSP.setVisible(false);
     }
     
     
     
      @FXML private void vercompra (ActionEvent event) {
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
      @FXML private void seleccionCliente (ActionEvent event) {
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
     
      
     @FXML private void agregarprincipal (ActionEvent event) {
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
     @FXML private void agregarprincipal1 (ActionEvent event) {
     prod2.setVisible(true);
     menos1.setVisible(false); 
     }
     @FXML private void agregarprincipal2 (ActionEvent event) {
     prod3.setVisible(true); 
     menos2.setVisible(false); 
     }
     @FXML private void agregarprincipal3 (ActionEvent event) {
     prod4.setVisible(true); 
     menos3.setVisible(false); 
     }
     @FXML private void agregarprincipa4 (ActionEvent event) {
     prod5.setVisible(true); 
     menos4.setVisible(false); 
     }
     @FXML private void quitarprincipal1 (ActionEvent event) {
     prod1.setVisible(false);
     menos1.setVisible(true); 
     }
     @FXML private void quitarprincipal2 (ActionEvent event) {
     prod2.setVisible(false); 
     menos1.setVisible(true); 
     }
     @FXML private void quitarprincipal3 (ActionEvent event) {
     prod3.setVisible(false); 
     menos2.setVisible(true); 
     }
     @FXML private void quitarprincipal4 (ActionEvent event) {
     prod4.setVisible(false); 
     menos3.setVisible(true); 
     }
     @FXML private void quitarprincipal5 (ActionEvent event) {
     prod5.setVisible(false);
     menos4.setVisible(true); 
     }
     
       @FXML private void seleccioncompracon(ActionEvent event) {
      
       int selectedPerson =seleccioncompraCB.getSelectionModel().getSelectedIndex();
  
  if(selectedPerson==0){
      
     fechaconcomTF.setText("1/2/3");
totalconcomTF.setText("12334");
nombreconcomTF.setText("sss");
idconcomTF.setText("245");
apellidoconcomTF.setText("dass");
idprodconcomTF.setText("543");
nomprodconcomTF.setText("ahj");
ivaprodconcomTF.setText("234");
valunprodconcomTF.setText("2341");
cantprodconcomTF.setText("23");
subtotprodconcomTF.setText("5642"); 
comboanularcompra.setVisible(true);
  }
  if(selectedPerson==1){
    fechaconcomTF.setText("1/2/3");
totalconcomTF.setText("12334");
nombreconcomTF.setText("sss");
idconcomTF.setText("245");
apellidoconcomTF.setText("dass");
idprodconcomTF.setText("543");
nomprodconcomTF.setText("ahj");
ivaprodconcomTF.setText("234");
valunprodconcomTF.setText("2341");
cantprodconcomTF.setText("23");
subtotprodconcomTF.setText("5642"); 
comboanularcompra.setVisible(true);
  }
  if(selectedPerson==2){
  fechaconcomTF.setText("1/2/3");
totalconcomTF.setText("12334");
nombreconcomTF.setText("sss");
idconcomTF.setText("245");
apellidoconcomTF.setText("dass");
idprodconcomTF.setText("543");
nomprodconcomTF.setText("ahj");
ivaprodconcomTF.setText("234");
valunprodconcomTF.setText("2341");
cantprodconcomTF.setText("23");
subtotprodconcomTF.setText("5642"); 
comboanularcompra.setVisible(true);
  }
  
      }
     
     //////////venta
     
      @FXML private void seleccionventacon(ActionEvent event) {
      
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
      
     
      @FXML private void crearproveedorfac(ActionEvent event) {
      ventaSP.setDisable(true);
      crearproveedorfacP.setVisible(true);
      }
      @FXML private void valcrearproveedorfac(ActionEvent event) {
      ventaSP.setDisable(false);
      crearproveedorfacP.setVisible(false);
      }
      @FXML private void cancelarproveedor(ActionEvent event) {
      ventaSP.setDisable(false);
      crearproveedorfacP.setVisible(false);
      }
     
    @FXML private void anularVenta(ActionEvent event) { 
    
 
consVentaP.setVisible(false);
consCompraP.setVisible(true);
       compraSP.setVisible(false); 
     ventaSP.setVisible(false);
    } 
      @FXML private void verventa (ActionEvent event) {
         
    java.util.Date fecha = new Date();
  int dia=fecha.getDate();
  int mes=fecha.getMonth()+1;
  int anio=fecha.getYear()+1900;
  String d = Integer.toString(dia);
  String m = Integer.toString(mes);
  String a = Integer.toString(anio);
  
  diaTF.setText(d);
mesTF.setText(m);
anioTF.setText(a);


  
  
consVentaP.setVisible(false);
consCompraP.setVisible(false);
          AnularVenP.setVisible(false);
     compraSP.setVisible(false);
     ventaSP.setVisible(true);
     
     }
     
     @FXML private void agregarventa (ActionEvent event) {
     venta1.setVisible(true); 
     
     }
     @FXML private void agregarventa1 (ActionEvent event) {
     venta2.setVisible(true);
     menosV1.setVisible(false); 
     }
     @FXML private void agregarventa2 (ActionEvent event) {
     venta3.setVisible(true); 
     menosV2.setVisible(false); 
     }
     @FXML private void agregarventa3 (ActionEvent event) {
     venta4.setVisible(true); 
     menosV3.setVisible(false); 
     }
     @FXML private void agregarventa4 (ActionEvent event) {
     venta5.setVisible(true); 
     menosV4.setVisible(false); 
     }
     @FXML private void quitarventa1 (ActionEvent event) {
     venta1.setVisible(false);
     menosV1.setVisible(true); 
     }
     @FXML private void quitarventa2 (ActionEvent event) {
     venta2.setVisible(false); 
     menosV1.setVisible(true); 
     }
     @FXML private void quitarventa3 (ActionEvent event) {
     venta3.setVisible(false); 
     menosV2.setVisible(true); 
     }
     @FXML private void quitarventa4 (ActionEvent event) {
     venta4.setVisible(false); 
     menosV3.setVisible(true); 
     }
     @FXML private void quitarventa5 (ActionEvent event) {
     venta5.setVisible(false);
     menosV4.setVisible(true); 
     }
    
     
     
     
    
    //--------------------------------------------------Inventario------------------------------------------------------\\
//////////CAMBIOS
    
     

     @FXML private void recibirProd() {
      int selectedPerson =NomReciboCB.getSelectionModel().getSelectedIndex();
      if(selectedPerson==0){
 idreciboTF.setText("sdaas");
  cantreciboTF.setText("7");
  }
      if(selectedPerson==1){
  idreciboTF.setText("dfs");
  cantreciboTF.setText("34");
  }
      if(selectedPerson==2){
  idreciboTF.setText("dfs");
  cantreciboTF.setText("11");
  }
     }  
     
    @FXML private void reportarprod(){
     int selectedPerson =reportprodCB.getSelectionModel().getSelectedIndex();
      if(selectedPerson==0){
 idreporteTF.setText("sdaas");
  cantreporteTF.setText("70");
  }
      if(selectedPerson==1){
  idreporteTF.setText("dfs");
  cantreporteTF.setText("384");
  }
      if(selectedPerson==2){
  idreporteTF.setText("dfs");
  cantreporteTF.setText("101");
  }
    }
     
     @FXML private void valreporte(ActionEvent event) {
       if (idreporteTF.getText().equals("")||nomreporteTF.getText().equals("")){
        idreporteval.setVisible(true);
          }
       
      
          else {
if(!idreporteTF.getText().equals("")){ idreporteval.setVisible(false);}
else{
idreporteval.setVisible(false);
}
          
          }
           if (cantreporteTF.getText().equals("")){
            cantreporteval.setVisible(true);   
           }
           else{
           cantreporteval.setVisible(false);  
           }
     }
     @FXML private void valrecibo (ActionEvent event) {
       if (idreciboTF.getText().equals("")){
        idreciboval.setVisible(true);
          }
          else {
if(!idreciboTF.getText().equals("")){ idreciboval.setVisible(false);}
else{
idreciboval.setVisible(false);
}
          
          }
           if (cantreciboTF.getText().equals("")){
            cantreciboval.setVisible(true);   
           }
           else{
           cantreciboval.setVisible(false);  
           }
     }
     
     
  
    
    //////////PRODUCTO
    /**
     * Método que realiza las acciones tras pulsar el boton "Nuevo"
     *
     * @param event
     */
    @FXML private void nuevo(ActionEvent event) {
        
         valid.setVisible(false);
          nomval.setVisible(false);  
          ival.setVisible(false);
          unval.setVisible(false);
          stock_mval.setVisible(false);
          stock_maxval.setVisible(false); 
                comboMarca.getSelectionModel().select(-1);
      comoMedida.getSelectionModel().select(-1);
      comboPresentacion.getSelectionModel().select(-1);
      comboClasificacion.getSelectionModel().select(-1);
      estadoCB.getSelectionModel().select(-1);
        try {   
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("SELECT idproducto+1 FROM producto\n" +
"order by idproducto desc\n" +
"limit 1;"));

            
             
            while (con.getResultado().next()) {
             
            nombreTF.setText(con.getResultado().getString("idproducto+1"));
            }
                  
            con.desconectar();
      
        }
            catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        apellidoTF.setText("");
        edadTF.setText("");
    
        telefono1TF.setText("");
        telefono2TF.setText("");

        modificarBT.setDisable(true);
    
        aniadirBT.setDisable(false);
    }
    
    @FXML private void aniadir(ActionEvent event) throws SQLException {
        Persona persona = new Persona();
   
    String marcains =(String) comboMarca.getSelectionModel().getSelectedItem();
    String medidains =(String) comoMedida.getSelectionModel().getSelectedItem();
    String presentacionins =(String) comboPresentacion.getSelectionModel().getSelectedItem();
    String clasificacionins =(String) comboClasificacion.getSelectionModel().getSelectedItem();
    Estado =(String) estadoCB.getSelectionModel().getSelectedItem();
   
      persona.medida.set(medidains);
      persona.telefono.set(marcains);
      persona.presentacion.set(presentacionins);
      persona.clasificaion.set(clasificacionins);
      persona.estado.set(Estado);
  
      
        
      
        
        
     
        
        String  nom=apellidoTF.getText();
        Pattern pat2 = Pattern.compile("[a-z]");
        Matcher mat2 = pat2.matcher(nom); 
         if (nom.length()<=20){
              nombreTamaño.setVisible(false);
           if (mat2.find()){
                
               val2="2";
            nomval.setVisible(false); 
            persona.apellido.set(apellidoTF.getText());
           }
           else{
                val2="";
           nomval.setVisible(true);  
           }
         }
         else {
         nombreTamaño.setVisible(true);
          nomval.setVisible(false); 
         }
           persona.nombre.set(nombreTF.getText());
           String  iva=edadTF.getText();
        Pattern pat3 = Pattern.compile("^[0-9]+(\\.[0-9]+)?$");
        Matcher mat3 = pat3.matcher(iva); 
        if (iva.length()<=20){
            tamañoIva.setVisible(false);
           if (mat3.find()){
               val3="3";
              ival.setVisible(false); 
              persona.edad.set(edadTF.getText());  
           }
           else{
                val3="";
                ival.setVisible(true);         
           }
        }
        else{
        tamañoIva.setVisible(true);
        ival.setVisible(false); 
        }
           
           
          int pocisionEstado= estadoCB.getSelectionModel().getSelectedIndex();
          int pocisionPresentacion= comboPresentacion.getSelectionModel().getSelectedIndex();
          int pocisionMarca= comboMarca.getSelectionModel().getSelectedIndex();
          int pocisionMedida= comoMedida.getSelectionModel().getSelectedIndex();
          int pocisionclasificacion= comboClasificacion.getSelectionModel().getSelectedIndex();
          
          if(pocisionEstado==-1){
          laberEstado.setVisible(true);
          }
          else{
          laberEstado.setVisible(false);
          }
          
          if(pocisionPresentacion==-1){
          labelPresentacion.setVisible(true);
          }
          else{
          laberEstado.setVisible(false);
          }
          
          if(pocisionMarca==-1){
          labelMarca.setVisible(true);
          }
          else{
          labelMarca.setVisible(false);
          }
          
          if(pocisionMedida==-1){
          labelMedida.setVisible(true);
          }
          else{
          labelMedida.setVisible(false);
          }
          
          if(pocisionclasificacion==-1){
          labelClasificacion.setVisible(true);
          }
          else{
          labelClasificacion.setVisible(false);
          }
          
          
            
         String  stock_m=telefono1TF.getText();
        Pattern pat5 = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat5 = pat5.matcher(stock_m);   
        if (stock_m.length()<=20){
            tamañoStock_m.setVisible(false);
         if (mat5.find()){
             val5="5";
              stock_mval.setVisible(false);   
              persona.telefono1.set(telefono1TF.getText());
           }
           else{
              val5="";
                stock_mval.setVisible(true); 
           }
        }
        else {
        tamañoStock_m.setVisible(false);
        stock_mval.setVisible(false); 
        }
         
         String  stock_max=telefono2TF.getText();
        Pattern pat6 = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat6 = pat6.matcher(stock_max);
        if (stock_m.length()<=5){
            tamañoStock_m.setVisible(false);
         if (mat6.find()){
             val6="6";
              stock_maxval.setVisible(false); 
              persona.telefono2.set(telefono2TF.getText());
           }
           else{
              val6="";
                stock_maxval.setVisible(true);          
           }
        }
        else{
        tamañoStock_m.setVisible(true);
          stock_maxval.setVisible(false);   
        }
        
        
            Confirmacion= Dialogs.showConfirmDialog(null, "Desea guardar los cambios?", "insertar producto", "Informacion", Dialogs.DialogOptions.YES_NO);
        
       if(Dialogs.DialogResponse.YES==Confirmacion){
        if (val2.equals("2")&&val3.equals("3")&&val5.equals("5")&&val6.equals("6")){
        
        
          Conexion cons = new Conexion(); 
        try {
          
            cons.conectar();
         String nombrePro=apellidoTF.getText();
            
            cons.getConexion().setAutoCommit(false);
            cons.procedimiento("{ CALL insertarProducto(?,?,?,?,?,?,?,?,?,?) }");
            cons.getProcedimiento().setDouble("idprod",Double.parseDouble(nombreTF.getText()));
            cons.getProcedimiento().setDouble("valEx",Double.parseDouble(edadTF.getText()));
            cons.getProcedimiento().setInt("stockMin", Integer.parseInt(telefono1TF.getText()));         
            cons.getProcedimiento().setInt("stockMax", Integer.parseInt(telefono2TF.getText()));
            cons.getProcedimiento().setString("nombreProd", nombrePro);
            cons.getProcedimiento().setString("parammed",medidains);
            cons.getProcedimiento().setString("parammar", marcains);
            cons.getProcedimiento().setString("paramcla", clasificacionins);
            cons.getProcedimiento().setString("parampre", presentacionins);
            cons.getProcedimiento().setString("paramestado",estadoCB.getSelectionModel().getSelectedItem().toString());
            cons.getProcedimiento().registerOutParameter("prueba",Types.VARCHAR);
            cons.getProcedimiento().execute();            
         personas.add(persona);											  
            cons.getConexion().commit();
         
            
             
        
               
        } catch (SQLException e) {
            cons.getConexion().rollback();
          
            Dialogs.showErrorDialog(null, "Error al insertar el producto", "","error", Dialogs.DialogOptions.OK);
            
          
        } finally {
            cons.desconectar();
        }
        }
         
         
        
    }
    }
    /**
     * Método que realiza las acciones tras pulsar el boton "Modificar"
     *
     * @param event
     */
    
    @FXML private void modificar(ActionEvent event) throws SQLException {
      
         Persona persona = new Persona();
         String marcains =(String) comboMarca.getSelectionModel().getSelectedItem();
    String medidains =(String) comoMedida.getSelectionModel().getSelectedItem();
    String presentacionins =(String) comboPresentacion.getSelectionModel().getSelectedItem();
    String clasificacionins =(String) comboClasificacion.getSelectionModel().getSelectedItem();
    String estadoTemp =(String) estadoCB.getSelectionModel().getSelectedItem();
    
         persona.medida.set(medidains);
      persona.telefono.set(marcains);
      persona.presentacion.set(presentacionins);
      persona.clasificaion.set(clasificacionins);
      persona.estado.set(estadoTemp);
       String Estado="habilitado";  
        int selectedPerson =estadoCB.getSelectionModel().getSelectedIndex();
      if(selectedPerson==0){
Estado="deshabilitado";
  }
      
      if (Estado.equals("habilitado")){
      persona.estado.set("habilitado");
      }
      else{persona.estado.set("deshabilitado");
      Estado="habilitado";}
      
      
      
      
        int pocisionEstado= estadoCB.getSelectionModel().getSelectedIndex();
          int pocisionPresentacion= comboPresentacion.getSelectionModel().getSelectedIndex();
          int pocisionMarca= comboMarca.getSelectionModel().getSelectedIndex();
          int pocisionMedida= comoMedida.getSelectionModel().getSelectedIndex();
          int pocisionclasificacion= comboClasificacion.getSelectionModel().getSelectedIndex();
          
          if(pocisionEstado==-1){
          laberEstado.setVisible(true);
          }
          else{
          laberEstado.setVisible(false);
          }
          
          if(pocisionPresentacion==-1){
          labelPresentacion.setVisible(true);
          }
          else{
          laberEstado.setVisible(false);
          }
          
          if(pocisionMarca==-1){
          labelMarca.setVisible(true);
          }
          else{
          labelMarca.setVisible(false);
          }
          
          if(pocisionMedida==-1){
          labelMedida.setVisible(true);
          }
          else{
          labelMedida.setVisible(false);
          }
          
          if(pocisionclasificacion==-1){
          labelClasificacion.setVisible(true);
          }
          else{
          labelClasificacion.setVisible(false);
          }
          
      
      
        
         String  id=nombreTF.getText();
        Pattern pat = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat = pat.matcher(id);     
        if (mat.find()){
            val1="1";
        valid.setVisible(false);
         persona.nombre.set(nombreTF.getText());
          }
          else {
         
          valid.setVisible(true);
          }
        
        
     
        
        String  nom=apellidoTF.getText();
        Pattern pat2 = Pattern.compile("[a-z]");
        Matcher mat2 = pat2.matcher(nom);   
           if (mat2.find()){
               val2="2";
            nomval.setVisible(false); 
            persona.apellido.set(apellidoTF.getText());
           }
           else{
           nomval.setVisible(true);  
           }
           
           
           String  iva=edadTF.getText();
        Pattern pat3 = Pattern.compile("^[0-9]+(\\.[0-9]+)?$");
        Matcher mat3 = pat3.matcher(iva);   
           if (mat3.find()){
               val3="3";
              ival.setVisible(false); 
              persona.edad.set(edadTF.getText());  
           }
           else{
                ival.setVisible(true);         
           }
           
           
           
            
            
         String  stock_m=telefono1TF.getText();
        Pattern pat5 = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat5 = pat5.matcher(stock_m);     
         if (mat5.find()){
             val5="5";
              stock_mval.setVisible(false);   
              persona.telefono1.set(telefono1TF.getText());
           }
           else{
                stock_mval.setVisible(true); 
           }
         
         
         String  stock_max=telefono2TF.getText();
        Pattern pat6 = Pattern.compile("^(?:\\+)?\\d+$");
        Matcher mat6 = pat6.matcher(stock_max);
         if (mat6.find()){
             val6="6";
              stock_maxval.setVisible(false); 
              persona.telefono2.set(telefono2TF.getText());
           }
           else{
                stock_maxval.setVisible(true);          
           }
         
       
 
      if (val1.equals("1")&&val2.equals("2")&&val3.equals("3")&&val5.equals("5")&&val6.equals("6")){
        personas.set(posicionPersonaEnTabla, persona);
         Conexion cons = new Conexion(); 
        try {
          
            cons.conectar();
         String nombrePro=apellidoTF.getText();
        
            cons.getConexion().setAutoCommit(false);
            cons.procedimiento("{ CALL modificarProducto(?,?,?,?,?,?,?,?,?) }");
            cons.getProcedimiento().setInt("idprod",Integer.parseInt(nombreTF.getText()));
            cons.getProcedimiento().setDouble("valEx",Double.parseDouble(edadTF.getText()));
            cons.getProcedimiento().setInt("stockMin", Integer.parseInt(telefono1TF.getText()));         
            cons.getProcedimiento().setInt("stockMax", Integer.parseInt(telefono2TF.getText()));
            cons.getProcedimiento().setString("nombreProd", nombrePro);
            cons.getProcedimiento().setString("parammed",medidains);
            cons.getProcedimiento().setString("parammar", marcains);
            cons.getProcedimiento().setString("paramcla", clasificacionins);
            cons.getProcedimiento().setString("parampre", presentacionins);
            cons.getProcedimiento().setString("paramestado", estadoTemp);

            cons.getProcedimiento().execute();            
        												  
            cons.getConexion().commit();
            System.out.print("funciona");
               
        } catch (SQLException e) {
            cons.getConexion().rollback();
          
        } finally {
            cons.desconectar();
        }
        
      
      
        
        
        }
    }

    /**
     * Método que realiza las acciones tras pulsar el boton "Eliminar"
     *
     * @param event
     */
    @FXML private void eliminar(ActionEvent event) {
         valid.setVisible(false);
          nomval.setVisible(false);  
          ival.setVisible(false);
          unval.setVisible(false);
          stock_mval.setVisible(false);
          stock_maxval.setVisible(false); 
        personas.remove(posicionPersonaEnTabla);
    }
    /**
     * Listener de la tabla personas
     */
    private final ListChangeListener<Persona> selectorTablaPersonas =
            new ListChangeListener<Persona>() {
                @Override
                public void onChanged(ListChangeListener.Change<? extends Persona> c) {
                    ponerPersonaSeleccionada();
                }
            };

    /**
     * PARA SELECCIONAR UNA CELDA DE LA TABLA "tablaPersonas"
     */
    public Persona getTablaPersonasSeleccionada() {
        String marcaColum="",marcaCombo="", medidaColum="",medidaCombo="",clasificacionColum="",clasificacionCombo="",presentacionColum="",presentacionCombo="",estados="",estadoCombo="";
         valid.setVisible(false);
          nomval.setVisible(false);  
          ival.setVisible(false);
          unval.setVisible(false);
          stock_mval.setVisible(false);
          stock_maxval.setVisible(false); 

      
        
        if (tablaPersonas != null) {
            List<Persona> tabla = tablaPersonas.getSelectionModel().getSelectedItems();

            if (tabla.size() == 1) {
                         for (Persona p: tabla){
 estados=p.getEstado();
 for (Object e: EstadoObservable){
 estadoCombo=e.toString();
  if (estados.equals(estadoCombo)){
            seleccionIndice5=EstadoObservable.indexOf(e);
                            }
 }
                            }
                
                            for (Persona p: tabla){
 marcaColum=p.getTelefono();
 for (Object e: marca){
 marcaCombo=e.toString();
  if (marcaColum.equals(marcaCombo)){
             seleccionIndice = marca.indexOf(e);
                            }
 }
                            }
                             for (Persona p: tabla){
 medidaColum=p.getMedida();
  for (Object me: medida){
 medidaCombo=me.toString();
  if (medidaColum.equals(medidaCombo)){
             seleccionIndice2 = medida.indexOf(me);
  }                     }
 }
                              for (Persona p: tabla){
presentacionColum= p.getPresentacion();
   for (Object pr: presentacion){
 presentacionCombo=pr.toString();
  if (presentacionColum.equals(presentacionCombo)){
             seleccionIndice3 = presentacion.indexOf(pr);
                            }
 }
          }
                               for (Persona p: tabla){
 clasificacionColum=p.getClasificaion();
  for (Object cl: clasificacion){
 clasificacionCombo=cl.toString();
  if (clasificacionColum.equals(clasificacionCombo)){
             seleccionIndice4 = clasificacion.indexOf(cl);
  }                     }
 }
  
                         
                final Persona competicionSeleccionada = tabla.get(0);
                return competicionSeleccionada;
            }
        }
        return null;
    }

    /**
     * Método para poner en los textFields la tupla que selccionemos
     */
    private void ponerPersonaSeleccionada() {
        final Persona persona = getTablaPersonasSeleccionada();
        posicionPersonaEnTabla = personas.indexOf(persona);

        if (persona != null) {

            // Pongo los textFields con los datos correspondientes
            nombreTF.setText(persona.getNombre());
            nombreProd=persona.getNombre();
            apellidoTF.setText(persona.getApellido());
            edadTF.setText(persona.getEdad().toString());
            comboMarca.getSelectionModel().select(seleccionIndice);
            comoMedida.getSelectionModel().select(seleccionIndice2);
            comboPresentacion.getSelectionModel().select(seleccionIndice3);
            comboClasificacion.getSelectionModel().select(seleccionIndice4);
            estadoCB.getSelectionModel().select(seleccionIndice5);
            telefono1TF.setText(persona.getTelefono1());
            telefono2TF.setText(persona.getTelefono2());
           
            // Pongo los botones en su estado correspondiente
            modificarBT.setDisable(false);
          
            aniadirBT.setDisable(true);

        }
    }

    /**
     * Método para inicializar la tabla
     */
    private void inicializarTablaPersonas() {
        nombreCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
        apellidoCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellido"));
        edadCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("edad"));
        telefonoCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("telefono"));
        telefono1CL.setCellValueFactory(new PropertyValueFactory<Persona, String>("telefono1"));
        telefono2CL.setCellValueFactory(new PropertyValueFactory<Persona, String>("telefono2"));
        EstadoCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("estado"));
        Colmedida.setCellValueFactory(new PropertyValueFactory<Persona, String>("medida"));
        colPresentacion.setCellValueFactory(new PropertyValueFactory<Persona, String>("presentacion"));
        colClasificacion.setCellValueFactory(new PropertyValueFactory<Persona, String>("clasificaion"));
        


        personas = FXCollections.observableArrayList();
        tablaPersonas.setItems(personas);
    }

    public void cargarClasificacion() {
          this.clasificacion = FXCollections.observableArrayList();  
        try {    
         
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("select distinct nombre from clasificacion"));

            while (con.getResultado().next()) {
                
                clasificacion.add(con.getResultado().getObject("nombre"));
                
            }
            con.desconectar(); 
            comboClasificacion.setItems(clasificacion);
        }
        catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarPresentacion() {
          this.presentacion = FXCollections.observableArrayList();  
        try {    
         
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("select distinct nombre from presentacion"));

            while (con.getResultado().next()) {
                
                presentacion.add(con.getResultado().getObject("nombre"));
                
            }
            con.desconectar(); 
            comboPresentacion.setItems(presentacion);
        }
        catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void cargarMedida() {
          this.medida = FXCollections.observableArrayList();  
        try {    
         
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("select nombre from medida"));

            while (con.getResultado().next()) {
                
                medida.add(con.getResultado().getObject("nombre"));
                
            }
            con.desconectar(); 
            comoMedida.setItems(medida);
        }
        catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void cargarCuenta() {
          this.observableCuenta = FXCollections.observableArrayList();  
        try {    
         
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("SELECT nombre_cuenta FROM mydb.cuenta"));

            while (con.getResultado().next()) {
                
                observableCuenta.add(con.getResultado().getObject("nombre_cuenta"));
                
            }
            con.desconectar(); 
            nomCH.setItems(observableCuenta);
        }
        catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cargarMarca() {
          this.marca = FXCollections.observableArrayList();  
        try {    
         
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("select nombre from marca"));

            while (con.getResultado().next()) {
                
                marca.add(con.getResultado().getObject("nombre"));
                
            }
            con.desconectar(); 
            comboMarca.setItems(marca);
        }
        catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarCuenta();
busquedaRecibo.setPrefHeight(25);
busquedaRecibo.setPrefWidth(35);
        gridFactura.add(busquedaRecibo, 1, 1);
       
        
        box.setPrefHeight(25);
box.setPrefWidth(35);
        grid1.add(box, 1, 1);
        compra.setPrefHeight(1300);
venta.setPrefHeight(1300);


box1.setPrefHeight(25);
box1.setPrefWidth(35);
        prod1.add(box1, 1, 1);
        
        
box2.setPrefHeight(25);
box2.setPrefWidth(35);
        prod2.add(box2, 1, 1);
        
box3.setPrefHeight(25);
box3.setPrefWidth(35);
        prod3.add(box3, 1, 1);       
        
box4.setPrefHeight(25);
box4.setPrefWidth(35);
        prod4.add(box4, 1, 1);
        
        
box5.setPrefHeight(25);
box5.setPrefWidth(35);
        prod5.add(box5, 1, 1);       
        
        // Inicializamos la tabla
        this.inicializarTablaPersonas();

        // Ponemos estos dos botones para que no se puedan seleccionar
    
        modificarBT.setDisable(true);


        // Seleccionar las tuplas de la tabla de las personas
        final ObservableList<Persona> tablaPersonaSel = tablaPersonas.getSelectionModel().getSelectedItems();
        tablaPersonaSel.addListener(selectorTablaPersonas);

        // Inicializamos la tabla con algunos datos aleatorios
       
          try {   
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("SELECT idproducto+1 FROM producto\n" +
"order by idproducto desc\n" +
"limit 1;"));

            
             
            while (con.getResultado().next()) {
             
            nombreTF.setText(con.getResultado().getString("idproducto+1"));
            }
                  
            con.desconectar();
      
        }
            catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        
        try {   
            Conexion con = new Conexion();
            con.conectar();
            con.setResultado(con.getStatement().executeQuery("SELECT p.idproducto,p.nombre_producto,m.nombre,k.val_exitstencias,\n" +
"k.stock_minimo,k.stock_maximo,pr.nombre,me.nombre,cl.nombre,k.estado\n" +
"FROM mydb.producto p\n" +
"join kardex k on k.producto_idproducto=p.idproducto\n" +
"join marca m on p.marca_idmarca=m.idmarca\n" +
"join medida me on k.medida_idmedida=me.idmedida\n" +
"join presentacion pr on k.presentacion_idpresentacion=pr.idpresentacion\n" +
"join clasificacion cl on k.clasificacion_idclasificacion=cl.idclasificacion"));

            
             
            while (con.getResultado().next()) {
              Persona p1 = new Persona();
            p1.nombre.set(con.getResultado().getString("p.idproducto"));
            p1.apellido.set(con.getResultado().getString("p.nombre_producto"));
            p1.edad.set(con.getResultado().getString("k.val_exitstencias"));
            p1.telefono.set(con.getResultado().getString("m.nombre"));
            p1.telefono1.set(con.getResultado().getString("k.stock_minimo"));
            p1.telefono2.set(con.getResultado().getString("k.stock_maximo"));
            p1.medida.set(con.getResultado().getString("me.nombre"));
            p1.clasificaion.set(con.getResultado().getString("cl.nombre"));
            p1.presentacion.set(con.getResultado().getString("pr.nombre"));
            p1.estado.set(con.getResultado().getString("k.estado"));
            personas.add(p1);
            }
                  
            con.desconectar();
      cargarClasificacion();
      cargarMarca();
      cargarMedida();
      cargarPresentacion();
      estadoCB.setItems(EstadoObservable);
        }
            catch (SQLException ex) {
            
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}