/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaresueltagrupo2.Punto1;

/**
 *
 * @author Benjamin
 */
public class FuncionesyAtributos {

    //Ejercicio1
    public int n;

    public void Funcionpareimpar() {
       
        if (n % 2 == 0) {
            System.out.println("El número "+n+" es par");
        } else if (n < 0) {
            System.out.println("Digite un numero positivo por favor");
        } else {
            System.out.println("El numero "+n+" es impar");
        }

    }
}
