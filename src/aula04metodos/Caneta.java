/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04metodos;

/**
 *
 * @author davil
 */
public class Caneta {
    public String modelo;
    private float ponta;

    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    
    
    
    public void Status(){
     
        System.out.println("Caneta de modelo " + this.modelo + " e ponta " + this.ponta);
    }

}
