/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

import java.util.ArrayList;

/**
 *
 * @author locon
 */
public class registros {
    
    ArrayList<String> Transacciones;
    
    public registros() {
        Transacciones = new ArrayList<>();
    }

    public void registrar(String Operacion) {
        this.Transacciones.add(Operacion);
    }

    public ArrayList<String> getTransacciones() {
        return Transacciones;
    }
    
    
    
}
