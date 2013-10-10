package agendajarroba;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Cuenta {

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
    private TextField nomMTF;
    @FXML
    private PasswordField contMTF;
    @FXML
    private PasswordField recontMTF;
    @FXML
    private TextField apeMTF;
    @FXML
    private TextField telMTF;
    @FXML
    private TextField dirMTF;
    @FXML
    private ComboBox nomCH;
    @FXML
    private Pane registroCP;
    @FXML
    private Pane modificarP;
    @FXML
    private Pane proveedorCP;
    @FXML
    private Pane modificarPP;
    @FXML
    private Pane clienteCrearP;
    @FXML
    private Pane modificarClienteP;
    @FXML
    private Label valnomM;
    @FXML
    private Label valapeM;
    @FXML
    private Label valdirM;
    @FXML
    private Label valtelM;
     @FXML private Label valnomC;
    @FXML private Label valcontC;
    @FXML private Label valrecontC;
    
     @FXML private TextField nomCTF;
    @FXML private PasswordField contCTF;
    @FXML private PasswordField recontCTF;
    @FXML private Label valcoinC;
    @FXML private TextField nom2CTF;
    @FXML private Label valnom2C;
    @FXML private Label valapeC;
    @FXML private Label valdirC;
    @FXML private Label valtelC;
    @FXML private TextField apeCTF;
    @FXML private TextField telCTF;
    @FXML private TextField dirCTF;
    @FXML private Label validentificacion;

    public void valCrearCuenta() {
        if (nomCTF.getText().equals("")) {
            valnomC.setVisible(true);
        } else {
            valnomC.setVisible(false);
        }
        if (contCTF.getText().equals("")) {
            valcontC.setVisible(true);
        } else {

            valcontC.setVisible(false);
        }
        if (recontCTF.getText().equals("")) {
            valrecontC.setVisible(true);
        } else {
            valrecontC.setVisible(false);
            if (contCTF.getText().equals(recontCTF.getText())) {
                valcoinC.setVisible(false);
            } else {
                valcoinC.setVisible(true);
            }

        }

        if (nom2CTF.getText().equals("")) {
            valnom2C.setVisible(true);
        } else {
            valnom2C.setVisible(false);

        }
        if (apeCTF.getText().equals("")) {
            valapeC.setVisible(true);
        } else {
            valapeC.setVisible(false);

        }
        if (dirCTF.getText().equals("")) {
            valdirC.setVisible(true);
        } else {
            valdirC.setVisible(false);

        }
        if (telCTF.getText().equals("")) {
            valtelC.setVisible(true);
        } else {
            valtelC.setVisible(false);

        }
        if (IDCuentaTF.getText().equals("")) {
            validentificacion.setVisible(true);
        } else {
            validentificacion.setVisible(false);

        }
    }

    public void valModificarCuenta() {
        if (nomMTF.getText().equals("")) {
            valnomM.setVisible(true);
        } else {

            valnomM.setVisible(false);
        }



        if (apeMTF.getText().equals("")) {
            valapeM.setVisible(true);
        } else {
            valapeM.setVisible(false);

        }
        if (dirMTF.getText().equals("")) {
            valdirM.setVisible(true);
        } else {
            valdirM.setVisible(false);

        }
        if (telMTF.getText().equals("")) {
            valtelM.setVisible(true);
        } else {
            valtelM.setVisible(false);

        }
    }

    public void visiblesModificarCuenta() {
        modificarP.setVisible(true);
        registroCP.setVisible(false);
        proveedorCP.setVisible(false);
        modificarPP.setVisible(false);
        clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
    }

    public void visiblesCrearCuenta() {
        registroCP.setVisible(true);
        modificarP.setVisible(false);
        proveedorCP.setVisible(false);
        modificarPP.setVisible(false);
        clienteCrearP.setVisible(false);
        modificarClienteP.setVisible(false);
    }

    public void modificarCuenta() {
        int selectedPerson = nomCH.getSelectionModel().getSelectedIndex();

        if (selectedPerson == 0) {
            nomMTF.setDisable(false);
            contMTF.setDisable(false);
            recontMTF.setDisable(false);
            apeMTF.setDisable(false);
            telMTF.setDisable(false);
            dirMTF.setDisable(false);
            nomMTF.setText("sdaas");
            apeMTF.setText("sdaas");
            telMTF.setText("sdaas");
            dirMTF.setText("sdaas");

        }
        if (selectedPerson == 1) {
            nomMTF.setDisable(false);
            contMTF.setDisable(false);
            recontMTF.setDisable(false);
            apeMTF.setDisable(false);
            telMTF.setDisable(false);
            dirMTF.setDisable(false);
            nomMTF.setText("sdagfhgh");

            apeMTF.setText("sdaassdfdf");
            telMTF.setText("sdaasada");
            dirMTF.setText("sdaasgffg");
        }
        if (selectedPerson == 2) {
            nomMTF.setDisable(false);
            contMTF.setDisable(false);
            recontMTF.setDisable(false);
            apeMTF.setDisable(false);
            telMTF.setDisable(false);
            dirMTF.setDisable(false);
            nomMTF.setText("sdaashjfhgf");
            apeMTF.setText("sdaashgjhj");
            telMTF.setText("sdaassdasd");
            dirMTF.setText("sdaasasdassd");
        }

    }

    public void cuenta() {
        emergenteC.setVisible(true);
        emergenteP.setVisible(false);
        emergenteCli.setVisible(false);
    }

    public void seleccionTipo() {
        int selectedPerson = TipoIDCB.getSelectionModel().getSelectedIndex();

        if (selectedPerson == 0) {
            IDCuentaTF.setDisable(false);
        }
        if (selectedPerson == 1) {
            IDCuentaTF.setDisable(false);
        }
    }
}
