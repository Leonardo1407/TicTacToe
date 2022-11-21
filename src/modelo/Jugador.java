package modelo;

import javax.swing.JOptionPane;

public class Jugador {
    private String nombre;
    private char ficha;
    
    public Jugador(){
        nombre ="";
        ficha = '\000';
    }
    public Jugador(String pNombre, char pFicha){
        nombre = pNombre;
        ficha = pFicha;
    }
    public String getNombre(){
        return nombre;
    }
    public char getFicha(){
        return ficha;
    }
    
}
    
    

