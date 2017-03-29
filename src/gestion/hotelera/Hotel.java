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
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Habitacion> Habitaciones;
    
    Hotel(){
        for(int i=0;i<10;i++){
            Habitacion hab = new Habitacion();
        }
    }
    
}
