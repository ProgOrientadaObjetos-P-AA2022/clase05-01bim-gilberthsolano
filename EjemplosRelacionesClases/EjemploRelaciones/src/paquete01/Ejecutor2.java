/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        double costo= 1200;
        UnidadDVD unidad = new UnidadDVD(marca, costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";

        Computadora computadora = new Computadora(procesador, unidad);
        String variable_marca=computadora.obtenerTipoProcesador();
        UnidadDVD varialbe_unidad= computadora.obtenerUnidadDvd();
        
        

        computadora.establecerUnidadDvd(unidad);
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                variable_marca, varialbe_unidad.obtenerMarca());
    }

}
