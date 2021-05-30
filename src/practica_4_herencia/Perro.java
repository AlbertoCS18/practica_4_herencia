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
public class Perro extends Animal {
   private String raza;
    private String fecha_vacunacion;
    private Integer edad;
   
   public Perro(String raza, String fecha_vacunacion, Integer edad, Integer numero_de_patas){
    super(numero_de_patas,"","","");
    this.raza = raza;
    this.fecha_vacunacion = fecha_vacunacion;
    this.edad = edad;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getFecha(){
        return fecha_vacunacion;
    }
    
    public void setFecha(String fecha_vacunacion){
        this.fecha_vacunacion = fecha_vacunacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
