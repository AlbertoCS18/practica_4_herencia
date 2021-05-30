/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_4_herencia;

/**
 *
 * @author Alberto Corona
 */
public class Practica_4_herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro = new Perro("Pastor Aleman","02-01-2021",5,4);
        System.out.println("La raza del perro es: "+perro.getRaza());
        System.out.println("El numero de patas del animal es: "+perro.getNumero_de_patas());
        System.out.println("La fecha de vacunacion del perro es: "+perro.getFecha());
        System.out.println("La edad del perro es: "+perro.getEdad());

        Perro niperro = new Perro("Labrador","01-01-2021",2,4);
        System.out.println("La raza del perro es: "+niperro.getRaza());
        System.out.println("El numero de patas del animal es: "+niperro.getNumero_de_patas());
        System.out.println("La fecha de vacunacion del perro es: "+niperro.getFecha());
        System.out.println("La edad del perro es: "+niperro.getEdad());
        
        Gato gato = new Gato("Oscuro","Wiskas",4,"Mexico");
        System.out.println("El pelaje del gato es: "+gato.getPelaje());
        System.out.println("Las croquetas del gato son: "+gato.getCroquetas());
        System.out.println("El numero de patas del gato es: "+gato.getNumero_de_patas());
        System.out.println("El país del gato es: "+gato.getPais());
        
        Gato gato2 = new Gato("Blanco","Gatina",4,"Mexico");
        System.out.println("El pelaje del gato es: "+gato2.getPelaje());
        System.out.println("Las croquetas del gato son: "+gato2.getCroquetas());
        System.out.println("El numero de patas del gato es: "+gato2.getNumero_de_patas());
        System.out.println("El país del gato es: "+gato2.getPais());
    }

}
