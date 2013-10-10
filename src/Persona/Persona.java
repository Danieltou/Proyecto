package Persona;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Persona {
    
    public SimpleStringProperty nombre = new SimpleStringProperty();
    public SimpleStringProperty apellido = new SimpleStringProperty();
    public SimpleStringProperty edad = new SimpleStringProperty();
    public SimpleStringProperty telefono = new SimpleStringProperty();
    public SimpleStringProperty telefono1 = new SimpleStringProperty();
    public SimpleStringProperty telefono2 = new SimpleStringProperty();
    public SimpleStringProperty telefono3 = new SimpleStringProperty();
    public SimpleStringProperty estado = new SimpleStringProperty();
    public SimpleStringProperty medida = new SimpleStringProperty();
    public SimpleStringProperty presentacion = new SimpleStringProperty();
    public SimpleStringProperty clasificaion = new SimpleStringProperty();

    public String getMedida() {
        return medida.get();
    }

    public String getPresentacion() {
        return presentacion.get();
    }

    public String getClasificaion() {
        return clasificaion.get();
    }
    
    
    public String getNombre(){
        return nombre.get();
    }
    
    
    public String getApellido(){
        return apellido.get();
    }
    
    public String getEdad (){
        return edad.get();
    }
    
    public String getTelefono(){
        return telefono.get();
    }
     public String getTelefono1(){
        return telefono1.get();
    }
      public String getTelefono2(){
        return telefono2.get();
    }
      
     public String getTelefono3(){
        return telefono3.get();
    }
       public String getEstado(){
        return estado.get();
    }
    
}