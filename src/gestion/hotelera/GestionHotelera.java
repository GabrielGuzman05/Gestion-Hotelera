/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.hotelera;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class GestionHotelera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        do{
            menu();
            System.out.println("¿Desea realizar otra accion?");
            System.out.println("1 es si - 2 es no");
            do{
            option=ingresarValorNumerico();
            }while(option<1||option>2);
        }while(option==1);
        }
    
    
    public static void menu(){
        Hotel hotel = new Hotel();
        System.out.println("¿Que desea hacer?");
        System.out.println("1 Cobro de habitacion - 2 Reserva de habitacion - 3 Consultar estado");
        System.out.println("4 Ingreso de huesped nuevo - 5 Ingreso de huesped con reserva - 6 Reiniciar el sistema");
        int opcion=0;
        while(opcion<1||opcion>6){
            opcion=ingresarValorNumerico();
        }
        int habitacion=-1;
        if(opcion!=6){
            System.out.println("Ingrese el numero de la habitacion");
            while(habitacion<0||habitacion>9){
                habitacion=ingresarValorNumerico()-1;
            }
        }
        int noches = 0;
        switch(opcion){
            case 1:
                hotel.boleta(habitacion);
                break;

            case 2:
                System.out.println("Ingrese la cantidad de noches en la reserva");
                while(noches<1){
                    noches=ingresarValorNumerico();
                }
                hotel.reservarHabitacion(habitacion,noches);
                break;
                
            case 3:
                hotel.consultarEstado(habitacion);
                break;
                
            case 4:
                System.out.println("Ingrese la cantidad de noches del nuevo huesped");
                while(noches<1){
                    noches=ingresarValorNumerico();
                }
                hotel.ingresoHuespedNuevo(habitacion,noches);
                break;
            
            case 5:
                hotel.ingresoHuespedReserva(habitacion);
                break;
                
            case 6:
                hotel.resetHotel();
                break;
        }
    }
    
    public static int ingresarValorNumerico(){
        int opcion=0;
        boolean error;
        do{
            error=false;
            try{
                Scanner leer = new Scanner(System.in);
                opcion=leer.nextInt();
            }catch(InputMismatchException e){
                error=true;
                System.out.println("Error - Ingrese de nuevo el dato");
            }
        }while(error);
        return opcion;
    }
    
}
