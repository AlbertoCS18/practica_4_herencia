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
public class Animal {
    //Variables de Clase
    private Integer numero_de_patas;
    private String familia;
    private String pais;
    private String alimentacion;

    //Constructor vacio
    public Animal(){
        this.numero_de_patas = 0;
        this.familia = "";
        this.pais = "";
        this.alimentacion = "";
    }//end constructor
    public Animal(Integer numero_de_patas,String familia,String pais,String alimentacion){
        this.numero_de_patas = numero_de_patas;
        this.familia = familia;
        this.pais = pais;
        this.alimentacion = alimentacion;
    }
    public Integer getNumero_de_patas(){
        return numero_de_patas;
    }

    public void setNumero_de_patas(Integer numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
}
