/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaresueltagrupo2.Punto4;

/**
 *
 * @author Benjamin
 */
public class FuncionesyAtributos4 {

    public int nfilas;

    public void funcionnfilas() {
        
      
        int impar = 1;
        for(int i = 1; i <= this.nfilas; i++) {
          for(int j = 1; j <= (i+(i-1)); j++) {
              if(j%2 !=0){
              System.out.print(j + " ");
              }
        }
            System.out.print("\n");
        }
    }
}
