/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author natyv
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Ingresa la distancia recorrida: ");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro: ");
        double veocidad = sc.nextDouble();
        
        //generamos una instania de la clase carro 
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2021);
        bmw.setKilometraje(10000);
            // Invocamos al metodo contenico en la clase carro 
        double tiempo = bmw.calcularTiempo(distancia, veocidad);
        System.out.println("El tiempo que le tomara al carro "+ bmw.getMarca() + " de color " + bmw.getColor() + " y el anio sera " + bmw.getAnio() + " sera " + tiempo + " y ahora su kilometraje es de " + bmw.getKilometraje());
    }
}
