/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaresueltagrupo2.PuntoFinal;

/**
 *
 * @author Benjamin
 */
public class FuncionesyAtributos10 {
    public int balota;
    public double precio, total, descuento1, descuento2;
    
    public void funcionBalota(){
        switch (balota) {
            case 1:
                System.out.println(" SU TOTAL ES DE :" + precio);
                break;

            case 2:
                descuento1 = (precio * 0.4);
                total = (precio - descuento1);
                System.out.println(" SU TOTAL CON DESCUENTO DEL 40% ES DE : " + total);
                break;

            case 3:
                descuento2 = (precio * 0.25);
                total = (precio - descuento2);
                System.out.println(" SU TOTAL CON DESCUENTO DEL 25% ES DE : " + total);
                break;

        }
    }
}
