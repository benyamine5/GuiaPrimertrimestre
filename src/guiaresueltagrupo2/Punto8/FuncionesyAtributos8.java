package guiaresueltagrupo2.Punto8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncionesyAtributos8 {

    public void Funcionej8() {
        DecimalFormat formateardouble = new DecimalFormat();
        formateardouble.setDecimalSeparatorAlwaysShown(false);
        int vunidadpro = 60, vunipre = 36, v, mrepro;
        double vdesc, prom;
        Scanner datos = new Scanner(System.in);
        System.out.println("""
                           Bienvenido digite de donde es el alumno:
                           1. Preparatoria.
                           2. Profesional                        
                           """);
        System.out.print("Digite su eleccion: ");
        v = Integer.parseInt(datos.nextLine());

        if (v == 1) {
            System.out.print("Digite su promedio: ");
            prom = Double.parseDouble(datos.nextLine());
            if (prom >= 9.5) {
                vdesc = (55 * vunipre) * 0.75;
                System.out.println("""
                                   Por ser alumno de preparatoria y tener promedio mayor o igual  a 9.5 usted goza de los siguientes estimulos:
                                   -25% descuento por unidades.
                                   -Acceso a 55 unidades.
                                   """);
                System.out.println("El valor de 55 unidades sin descuento es: " + (55 * vunipre) + " con 25% el valor es: " + formateardouble.format(vdesc));

            } else if ((prom >= 9) && (prom < 9.5)) {
                vdesc = (50 * vunipre) * 0.90;
                System.out.println("""
                                   Por ser alumno de preparatoria y tener promedio mayor o igual  a 9 y menor a 9.5 usted goza de los siguientes estimulos:
                                   -10% descuento por unidades.
                                   -Acceso a 50 unidades.
                                   """);
                System.out.println("El valor de 50 unidades sin descuento es: " + (50 * vunipre) + " con 10% el valor es: " + formateardouble.format(vdesc));
            } else if ((prom > 7) && (prom < 9)) {
                vdesc = (50 * vunipre);
                System.out.println("""
                                   Por ser alumno de preparatoria y tener promedio mayor a 7 y menor a 9 usted goza de los siguientes estimulos:
                                   - Acceso a 50 unidades.
                                   """);
                System.out.println("El valor de 50 unidades sin descuento es: " + formateardouble.format(vdesc));
            } else if (prom <= 7) {
                System.out.print("Digite el número de materias reprobadas: ");
                mrepro = Integer.parseInt(datos.nextLine());
                if ((mrepro >= 0) && (mrepro <= 3)) {

                    vdesc = vunipre * 45;
                    System.out.println("""
                                   Usted es un alumno de preparatoria que reprobó 0 a 3 materias por lo que tiene acceso a:
                                   -45 unidades.
                                   """);
                    System.out.println("El valor de 45 unidades sin descuento es: " + formateardouble.format(vdesc));
                } else if (mrepro >= 4) {
                    vdesc = vunipre * 40;
                    System.out.println("""
                                   Usted es un alumno de preparatoria que reprobó 4 o mas materias por lo que tiene acceso a:
                                   -40 unidades.
                                   """);
                    System.out.println("El valor de 40 unidades sin descuento es: " + formateardouble.format(vdesc));
                }

            }

        } else if (v == 2) {
            System.out.print("Digite su promedio: ");
            prom = Double.parseDouble(datos.nextLine());
            if (prom >= 9.5) {
                vdesc = (55 * vunidadpro) * 0.75;
                System.out.println("""
                                   Por ser alumno profesional y tener promedio mayor o igual  a 9.5 usted goza de los siguientes estimulos:
                                   -25% descuento por unidades.
                                   -Acceso a 55 unidades.
                                   """);
                System.out.println("El valor de 55 unidades sin descuento es: " + (55 * vunidadpro) + " con 25% el valor es: " + formateardouble.format(vdesc));
            } else if (prom < 9.5) {
                vdesc = (55 * vunidadpro);
                System.out.println("""
                                   Por ser alumno profesional y tener promedio menor a 9.5 usted goza de los siguientes estimulos:
                                   -Acceso a 55 unidades.
                                   """);
                System.out.println("El valor de 55 unidades sin descuento es: " + formateardouble.format(vdesc));
            }
        }

    }
}
