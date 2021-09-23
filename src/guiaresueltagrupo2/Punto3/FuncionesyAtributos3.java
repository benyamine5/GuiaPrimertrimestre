/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaresueltagrupo2.Punto3;

/**
 *
 * @author Benjamin
 */
public class FuncionesyAtributos3 {
    public int nv,nmultiplo;
    
    public void funcionMultiplo(){
        if (nv %nmultiplo==0) {
            System.out.println("El número "+nv+" es multiplo de "+nmultiplo);        
        }
        else{
            System.out.println("El numero "+nv+" no es multiplo de "+nmultiplo);
        }
    }
}
