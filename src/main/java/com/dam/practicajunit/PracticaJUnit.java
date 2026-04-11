package com.dam.practicajunit;

/**
 *
 * @author DANA
 */
public class PracticaJUnit {

    public static void main(String[] args) {
        /**
         * Se crea un objeto de la clase Circulo, se le asigna un radio y se
         * muestra su area y perimetro
         */

        Circulo circulo1 = new Circulo();
        circulo1.setRadio(10);
        System.out.println("\tArea --> " + circulo1.calcularArea());
        System.out.println("\tLongitud --> " + circulo1.calcularPerimetro());

        /**
         * Se crea otro objeto de la clase Circulo, se le asigna un radio y se
         * muestra su area y perimetro
         */
        Circulo circulo2 = new Circulo(13);
        System.out.println("\tArea --> " + circulo2.calcularArea());
        System.out.println("\tLongitud --> " + circulo2.calcularPerimetro());

        /**
         * Ejecutamos el metodo de clase que devuelve el radio
         */
        System.out.println("\nMostramos los radio de los objetos mediante los metodos de clase");
        System.out.println("\tRadio del primer objeto es: " + circulo1.getRadio());
        System.out.println("\tRadio del segundo objeto es: " + circulo2.getRadio());

    }
}
