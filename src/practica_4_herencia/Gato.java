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
public class Gato extends Animal{
    //Variables de clase
    private String pelaje;
    private String croquetas;

    public Gato(String pelaje, String croquetas, Integer numero_de_patas, String pais){
        super(numero_de_patas,"",pais,"");
        this.pelaje = pelaje;
        this.croquetas = croquetas;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getCroquetas() {
        return croquetas;
    }

    public void setCroquetas(String croquetas) {
        this.croquetas = croquetas;
    }
    
}
