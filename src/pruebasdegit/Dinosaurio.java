/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasdegit;

/**
 *
 * @author edwin
 */
public class Dinosaurio {
    private String color;
    private String epoca;
    private String tipo;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dinosaurio() {
    }

    public Dinosaurio(String color, String epoca, String tipo) {
        this.color = color;
        this.epoca = epoca;
        this.tipo = tipo;
    }
    
    
    
}
