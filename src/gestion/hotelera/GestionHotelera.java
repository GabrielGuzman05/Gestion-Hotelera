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
public class GestionHotelera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("¿Que desea hacer?");
        System.out.println("1 Cobro de habitacion - 2 Reserva de habitacion - 3 Consultar estado");
        System.out.println("4 Ingreso de huesped nuevo - 5 Ingreso de huesped con reserva - 6 Reiniciar el sistema");
        int opcion=0;
        int habitacion=0;
        switch(opcion){
            case 1:
                hotel.boleta(habitacion);
                break;
                
            case 2:
                hotel.reservarHabitacion(habitacion);
                break;
                
            case 3:
                hotel.consultarEstado(habitacion);
                break;
                
            case 4:
                break;
            
            case 5:
                break;
                
            case 6:
                hotel.resetHotel();
                break;
        }
    }
    
}
