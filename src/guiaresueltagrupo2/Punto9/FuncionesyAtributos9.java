package guiaresueltagrupo2.Punto9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncionesyAtributos9 {

    public void calcularSalarioEmpleados() {
        Scanner datos = new Scanner(System.in);
        DecimalFormat formateardouble = new DecimalFormat();
        formateardouble.setDecimalSeparatorAlwaysShown(false);
        int nvendedores;
        double ventas, cventas, sbase;
        System.out.print("Digite la cantidad de vendedores: ");
        nvendedores = Integer.parseInt(datos.nextLine());
        for (int j = 0; j < nvendedores; j++) {
            double sventas =0;
            System.out.println("   ");
            System.out.print("Digite salario base de vendedor No." + (j + 1) + ": ");
            sbase = Double.parseDouble(datos.nextLine());
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite la venta No." + (i + 1) + ": ");
                ventas = Double.parseDouble(datos.nextLine());
                sventas += ventas;
            }
            cventas = sventas * 0.1;
            System.out.println("las 3 ventas del vendedor No." + (j + 1) + " suman " + formateardouble.format(sventas) + " por lo que su comision de 10% es de: " + formateardouble.format(cventas));
            System.out.println("salario base + comisión de vendedor No." + (j + 1) + " es: " + formateardouble.format(sbase + cventas));

        }

    }
}
