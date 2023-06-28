/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete2.Persona;
public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<PasajeUrbano> pasajes = new ArrayList<>();
        String[] nombres = {"Austin", "Monique", "Glen", "Richard", "Patrick"};
        String[] cedula = {"Martinez", "Lyons", "Kim", "Tate", "Lee"};
        int[] edad = {9, 70, 35, 23, 10};
        double pasajeFijo = 0.4;
        
        /*
        Generar un proceso que permita iterar los arreglos; el objetivo es 
        crear objetos de tipo Pasaje Menor de edad, Pasaje Normal, Pasaje 
        Universitario y Pasaje Tercera Edad. Los arreglos tienen una 
        característica, las posiciones se corresponden; por ejemplo, todas las 
        posiciones 0, crearán un objeto de cualquiera de los tipos nombrados de
        Pasajes.
        Cada objeto creado será agregado a la lista pasajes.
        
        ¿Cómo saber a que tipo de Pasaje pertenece cada objeto? Usar la edad 
        como discriminatoria.
        
        menor de edad: mayor o igual a 0 y menor o igual a 18
        universitario: mayor a 18 y menor o igual a 25
        normal: mayor a 25 y menor 65
        tercera edad: mayor o igual a 65
        
        */
        // inicio de solución
        
        for (int i = 0 ; i < nombres.length; i++) {
            if (edad[i] >= 0 && edad[i]<= 18) {
                PasajeMenorEdad pasajeE = new PasajeMenorEdad(pasajeFijo);
                Persona persona = new Persona(nombres[i],cedula[i], edad[i]);
                pasajeE.establecerPersona(persona); 
                pasajes.add(pasajeE);
                
            }
            if (edad[i] > 18 && edad[i]<= 25) {
                PasajeMenorEdad pasajeE = new PasajeMenorEdad(pasajeFijo);
                Persona persona = new Persona(nombres[i],cedula[i], edad[i]);
                pasajeE.establecerPersona(persona); 
                pasajes.add(pasajeE);
            }
            if (edad[i] > 25 && edad[i]<= 65) {
                PasajeMenorEdad pasajeE = new PasajeMenorEdad(pasajeFijo);
                Persona persona = new Persona(nombres[i],cedula[i], edad[i]);
                pasajeE.establecerPersona(persona); 
                pasajes.add(pasajeE);
            }
            if (edad[i] > 65) {
                PasajeMenorEdad pasajeE = new PasajeMenorEdad(pasajeFijo);
                Persona persona = new Persona(nombres[i],cedula[i], edad[i]);
                pasajeE.establecerPersona(persona); 
                pasajes.add(pasajeE);
            }
        }
        
        // fin  de solución
        
        // no incrementar líneas de código desde aquí
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValorPasaje();
        }
        
        for (int i = 0; i < pasajes.size(); i++) {
            System.out.printf("%s\n",
                    pasajes.get(i));
        }

    }
}
