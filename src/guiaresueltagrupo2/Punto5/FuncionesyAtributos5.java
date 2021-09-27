package guiaresueltagrupo2.Punto5;

import java.text.DecimalFormat;

public class FuncionesyAtributos5 {

    public int n;

    public void funcionCalculoSuma() {

        DecimalFormat formateardouble = new DecimalFormat();
        formateardouble.setDecimalSeparatorAlwaysShown(false);
        double s = 0, a = 2;
        double datos[];
        datos = new double[500];

        for (int i = 0; i <= this.n; i += 3) {

            datos[i] = a;
            a = sucesion1(a);
            datos[i + 1] = a;
            a = sucesion2(a);
            datos[i + 2] = a;
            a = sucesion3(a);
            datos[i + 3] = a;
        }
        for (int i = 0; i < this.n; i++) {
            System.out.print(formateardouble.format(datos[i]) + " - ");
            s += datos[i];

        }

        System.out.println(" ");
        System.out.println("La suma de la serie para el limite establecido de " + this.n + " es: " + formateardouble.format(s));
    }

    public static double sucesion1(double valor) {
        return valor * valor;
    }

    public static double sucesion2(double valor) {
        return valor * 2;
    }

    public static double sucesion3(double valor) {
        return valor - 2;
    }
}
