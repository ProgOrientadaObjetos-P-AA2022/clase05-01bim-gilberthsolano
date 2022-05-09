/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        //1. crear una persona del barrio el valle de la ciudad de loja
        //2. crear una persona del barrio central ciudad de cuenca
        //3. crear una persona del barrio centenario de la ciudad de guayaquil

        Ciudad ci1 = new Ciudad("Loja");
        Ciudad ci2 = new Ciudad("Cuenca");
        Ciudad ci3 = new Ciudad("Guayaquil");

        Barrio b1 = new Barrio("El valle", ci1);
        Barrio b2 = new Barrio("Centro", ci2);
        Barrio b3 = new Barrio("Centenario", ci3);
        Persona persona1 = new Persona("Gilbert Solano", "1100909909", b1);
        Persona persona2 = new Persona("René Elizalde", "1100909909", b2);
        Persona persona3 = new Persona("Maria Salazar", "1103039493", b3);
        System.out.printf("El barrio de la persona 1  %s  es: %s\n "
                + "Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());

        System.out.printf("El barrio de la persona 2  %s  es: %s\n "
                + "Y pertenece a la "
                + "ciudad: %s\n", persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        persona2.establecerBarrio(b2);

        System.out.printf("El barrio de la persona 3  %s  es: %s\n "
                + "Y pertenece a la "
                + "ciudad: %s\n", persona3.obtenerNombre(), 
                persona3.obtenerBarrio().obtenerNombre(), 
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        persona3.establecerBarrio(b3);

    }

}
