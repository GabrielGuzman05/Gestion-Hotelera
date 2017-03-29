/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.hotelera;

/**
 *
 * @author Gabriel
 */
public class Habitacion {
    private int noches;
    private String estado;
    
    Habitacion(){
        noches=0;
        estado="Desocupada";
    }
    
    public int getNoches(){
        return noches;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(int n){
        switch(n){
            case 1:
                estado="Ocupada";
                break;
            
            case 2:
                estado="Desocupada";
                break;
                
            case 3:
                estado="Reservada";
                break;
        }
    }
    
    public void setNoches(int n){
        noches=n;
    }
}
