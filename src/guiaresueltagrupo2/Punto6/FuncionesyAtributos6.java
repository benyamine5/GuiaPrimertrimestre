package guiaresueltagrupo2.Punto6;

import java.util.Scanner;

public class FuncionesyAtributos6 {

    int a = (int) ((Math.random() * 50) + 1);
    public int b;

    public void funcionCalculoAzar() {
        int nmayor = 50, nmenor = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("El juego consiste en averiguar un número secreto de 50 posibles.");

        System.out.print("Estoy pensando en un numero entre 1 y 50: ");
        this.b = sc.nextInt();
        System.out.println("Intento 1: " + b);

        for (int i = 0; i <= 4; i++) {

            if (this.a == this.b) {
                System.out.println("Felicidades acertaste el numero que pensé era: " + a);
                break;
            } else if (i == 4) {
                System.out.println("Se acabaron los intentos, el número que pensé era " + a);
                break;
            } else if (this.b > this.a) {
                nmayor = this.b;
                System.out.println("El número secreto esta entre " + nmenor + " y " + nmayor);
            } else if (b < a) {
                nmenor = b;
                System.out.println("El número secreto esta entre " + nmenor + " y " + nmayor);
            }

            System.out.print("intento " + (i + 2) + ": ");
            b = sc.nextInt();

        }
    }

}
