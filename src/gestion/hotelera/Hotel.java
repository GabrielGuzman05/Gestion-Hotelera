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
    private ArrayList<Habitacion> Habitaciones= new ArrayList();
    
    Hotel(){
        for(int i=0;i<10;i++){
            Habitacion hab = new Habitacion();
            Habitaciones.add(hab);
        }
    }
    
    public void reservarHabitacion(int n,int m){
        Habitaciones.get(n).setEstado(3);
        Habitaciones.get(n).setNoches(m);
    }
    
    public void resetHotel(){
        for(int i=0;i<Habitaciones.size();i++){
            desocuparHabitacion(i);
        }
    }
    
    public void consultarEstado(int n){
        System.out.println("La habitacion "+n+" esta "+Habitaciones.get(n-1).getEstado());
    }
    
    public void boleta(int n){
        int total;
        total=Habitaciones.get(n).getNoches()*40000;
        System.out.println("El total por su habitacion es "+total);
        desocuparHabitacion(n);
    }
    
    public void desocuparHabitacion(int n){
        Habitaciones.get(n).setEstado(2);
        Habitaciones.get(n).setNoches(0);
    }
    
    public void ingresoHuespedNuevo(int n,int m){
        if("Ocupada".equals(Habitaciones.get(n).getEstado())||"Reservada".equals(Habitaciones.get(n).getEstado())){
            System.out.println("Error - Habitacion no disponible");
        }else{
            Habitaciones.get(n).setEstado(1);
            Habitaciones.get(n).setNoches(m);
        }
    }
    
    public void ingresoHuespedReserva(int n){
        if("Reservada".equals(Habitaciones.get(n).getEstado())){
            Habitaciones.get(n).setEstado(1);
        }else{
            System.out.println("Error esta no es una habitacion reservada");
        }
    }
}
