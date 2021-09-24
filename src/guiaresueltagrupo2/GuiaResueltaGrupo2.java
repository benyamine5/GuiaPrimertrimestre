/*
 Grupo 2 Tecnico en programación de software:
1. Benjamin Guardo Barrios.
2. Carlos Alvarez Quintero.
3. Daneisy Martinez Freile.
4. Jorge Castaño Julio.
5. Langel Sanchez.

Instrucciones:
1. Esta es la clase principal la cual corre las demás clases.
2. Las demás clases son funciones y atributos correspondientes al ejercicio realizado.
3. Licencia libre de uso.
 */
package guiaresueltagrupo2;

import guiaresueltagrupo2.Punto1.FuncionesyAtributos;
import guiaresueltagrupo2.Punto2.FuncionesyAtributos2;
import guiaresueltagrupo2.Punto3.FuncionesyAtributos3;
import guiaresueltagrupo2.Punto4.FuncionesyAtributos4;
import guiaresueltagrupo2.Punto5.FuncionesyAtributos5;
import guiaresueltagrupo2.PuntoFinal.FuncionesyAtributos10;
import java.util.Scanner;

public class GuiaResueltaGrupo2 {

    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);
        FuncionesyAtributos obp1 = new FuncionesyAtributos();
        FuncionesyAtributos2 obp2 = new FuncionesyAtributos2();
        FuncionesyAtributos3 obp3 = new FuncionesyAtributos3();
        FuncionesyAtributos4 obp4 = new FuncionesyAtributos4();
        FuncionesyAtributos5 obp5 = new FuncionesyAtributos5();
        FuncionesyAtributos10 obp10 = new FuncionesyAtributos10();

        do {
            System.err.println("MENU PRINCIPAL");
            System.out.println("Por favor escoger uno de los 10 ejercicios");
            System.out.println("1.  Ejercicio 1");
            System.out.println("2.  Ejercicio 2");
            System.out.println("3.  Ejercicio 3");
            System.out.println("4.  Ejercicio 4");
            System.out.println("5.  Ejercicio 5");
            System.out.println("6.  Ejercicio 6");
            System.out.println("7.  Ejercicio 7");
            System.out.println("8.  Ejercicio 8");
            System.out.println("9.  Ejercicio 9");
            System.out.println("10. Ejercicio 10");

            System.out.println("11. Salir");
            System.err.print("Digite la opcion a ejecutar: ");
            op = Integer.parseInt(entrada.nextLine());
            switch (op) {
                case 1:
                    System.err.println("""
                                       Enunciado 1:
                                       Dado un número entero y positivo que se introduce por teclado, determinar si es par o
                                       impar.
                                       """);
                    do {
                        System.err.println("Bienvenido al ejecutor de numero par e impar ");
                        System.err.println("""
                                           1. Ejecutar algoritmo.
                                           2. Terminar programa.
                                           0. Volver al menu anterior.
                                           """);
                        System.err.print("Digitar opción a ejecutar: ");
                        op = Integer.parseInt(entrada.nextLine());
                        switch (op) {
                            case 1:
                                System.out.print("Digite un número: ");
                                obp1.n = Integer.parseInt(entrada.nextLine());
                                obp1.Funcionpareimpar();
                                break;

                            case 2:
                                System.err.println("Finalizando software");
                                System.err.println("----------------------------------");

                                System.err.println("""
                                       Equipo desarrollador
                                       1. Benjamin Guardo.
                                       2. Carlos Alvarez.
                                       3. Daneisy Martinez.
                                       4. Jorge Castaño.
                                       5. Langel Sanchez.
                                        """);
                                System.err.println("Gracias por utilizar nuestros servicios");
                                System.err.println("***************************************");
                                System.exit(0);
                                break;

                            case 0:
                                op = 0;
                                break;

                            default:
                                System.err.println("Error intente de nuevo escogiendo una de las opciones.");
                        }

                    } while (op != 0);

                    break;
                case 2:
                    System.err.println("""
                                       Enunciado 2:
                                       Escribir un programa que pida una hora en segundos y la saque en el formato “hh:mm:ss”,
                                       es decir horas, minutos y segundos.
                                       """);
                    do {
                        System.err.println("Convertidor de segundos a HH:MM:SS");
                        System.err.println("""
                                           1. Ejecutar algoritmo.
                                           2. Terminar programa.
                                           0. Volver al menu anterior.
                                           """);
                        System.err.print("Digitar opción a ejecutar: ");
                        op = Integer.parseInt(entrada.nextLine());
                        switch (op) {
                            case 1:
                                System.out.print("Digite el valor en segundos: ");
                                obp2.seg = Integer.parseInt(entrada.nextLine());
                                obp2.funcionhhmmss();
                                System.out.println(obp2.funcionhhmmss());
                                break;

                            case 2:
                                System.err.println("Finalizando software");
                                System.err.println("----------------------------------");

                                System.err.println("""
                                       Equipo desarrollador
                                       1. Benjamin Guardo.
                                       2. Carlos Alvarez.
                                       3. Daneisy Martinez.
                                       4. Jorge Castaño.
                                       5. Langel Sanchez.
                                        """);
                                System.err.println("Gracias por utilizar nuestros servicios");
                                System.err.println("***************************************");
                                System.exit(0);
                                break;

                            case 0:
                                op = 0;
                                break;

                            default:
                                System.err.println("Error intente de nuevo escogiendo una de las opciones.");
                        }

                    } while (op != 0);

                    break;
                case 3:
                    System.err.println("""
                                       Enunciado 3:
                                       Dado un número x determinar si es múltiplo de otro número y.
                                       """);
                    do {
                        System.err.println("Determinador de multiplos");
                        System.err.println("""
                                           1. Ejecutar algoritmo.
                                           2. Terminar programa.
                                           0. Volver al menu anterior.
                                           """);
                        System.err.print("Digitar opción a ejecutar: ");
                        op = Integer.parseInt(entrada.nextLine());
                        switch (op) {
                            case 1:
                                System.out.print("Digite el numero a determinar si es multiplo: ");
                                obp3.nv = Integer.parseInt(entrada.nextLine());
                                System.out.print("Digite el numero que desea saber si es multiplo: ");
                                obp3.nmultiplo = Integer.parseInt(entrada.nextLine());
                                obp3.funcionMultiplo();
                                break;

                            case 2:
                                System.err.println("Finalizando software");
                                System.err.println("----------------------------------");

                                System.err.println("""
                                       Equipo desarrollador
                                       1. Benjamin Guardo.
                                       2. Carlos Alvarez.
                                       3. Daneisy Martinez.
                                       4. Jorge Castaño.
                                       5. Langel Sanchez.
                                        """);
                                System.err.println("Gracias por utilizar nuestros servicios");
                                System.err.println("***************************************");
                                System.exit(0);
                                break;

                            case 0:
                                op = 0;
                                break;

                            default:
                                System.err.println("Error intente de nuevo escogiendo una de las opciones.");
                        }

                    } while (op != 0);

                    break;
                case 4:
                    System.err.println("""
                                       Enunciado 4:
                                       Desarrollar un programa que, utilizando una función muestre en pantalla N filas de
                                       números naturales impares, de los siguientes números y en la forma siguiente:
                                       1
                                       13
                                       135
                                       ……….
                                       N (número de filas) se debe indicar por teclado.
                                       """);
                    do {
                        System.err.println("Funcion numeros de filas impares");
                        System.err.println("""
                                           1. Ejecutar algoritmo.
                                           2. Terminar programa.
                                           0. Volver al menu anterior.
                                           """);
                        System.err.print("Digitar opción a ejecutar: ");
                        op = Integer.parseInt(entrada.nextLine());
                        switch (op) {
                            case 1:
                                System.out.print("Digite el número de filas que desea: ");
                                obp4.nfilas = Integer.parseInt(entrada.nextLine());
                                obp4.funcionnfilas();
                                break;

                            case 2:
                                System.err.println("Finalizando software");
                                System.err.println("----------------------------------");

                                System.err.println("""
                                       Equipo desarrollador
                                       1. Benjamin Guardo.
                                       2. Carlos Alvarez.
                                       3. Daneisy Martinez.
                                       4. Jorge Castaño.
                                       5. Langel Sanchez.
                                        """);
                                System.err.println("Gracias por utilizar nuestros servicios");
                                System.err.println("***************************************");
                                System.exit(0);
                                break;

                            case 0:
                                op = 0;
                                break;

                            default:
                                System.err.println("Error intente de nuevo escogiendo una de las opciones.");
                        }

                    } while (op != 0);

                    break;
                case 5:
                    System.err.println("""
                                       Enunciado 5:
                                       Dada la siguiente sucesión de números: 2, 4, 8, 6, 36, 72, 70, 4900, 9800… mediante el
                                       uso de funciones, mostrar en pantalla los términos de esta serie y calcular la suma de N
                                       (N se indica por teclado), elementos, es decir, SUMA=2+4+8+6+……
                                       """);

                    do {
                        System.err.println("Calculador de suma de sucesiones");
                        System.err.println("""
                                           1. Ejecutar algoritmo.
                                           2. Terminar programa.
                                           0. Volver al menu anterior.
                                           """);
                        System.err.print("Digitar opción a ejecutar: ");
                        op = Integer.parseInt(entrada.nextLine());
                        switch (op) {
                            case 1:
                                System.out.print("Introduzca el limite de numeros: ");
                                obp5.n = Integer.parseInt(entrada.nextLine());
                                obp5.funcionCalculoSuma();
                                break;

                            case 2:
                                System.err.println("Finalizando software");
                                System.err.println("----------------------------------");

                                System.err.println("""
                                       Equipo desarrollador
                                       1. Benjamin Guardo.
                                       2. Carlos Alvarez.
                                       3. Daneisy Martinez.
                                       4. Jorge Castaño.
                                       5. Langel Sanchez.
                                        """);
                                System.err.println("Gracias por utilizar nuestros servicios");
                                System.err.println("***************************************");
                                System.exit(0);
                                break;

                            case 0:
                                op = 0;
                                break;

                            default:
                                System.err.println("Error intente de nuevo escogiendo una de las opciones.");
                        }

                        
                    } while (op != 0);
                    break;
                case 6:
                    System.out.println("""
                                       Enunciado 6:
                                       Escribir un programa que permita adivinar un número que se genere internamente al azar,
                                       el cual está en el rango de 1 a 50. El usuario debe adivinar este número en base a
                                       aproximaciones, para lo cual se dispone de 5 intentos. Ejemplo:
                                       Salida:
                                       Estoy pensando en número entre 1 y 50
                                       Intento 1: 25
                                       El número esta entre 25 y 50
                                       Intento 2: 34
                                       El número esta entre 34 y 50
                                       Intento 3: 45
                                       El número esta entre 34 y 45
                                       Intento 4: 40
                                       El número esta entre 40 y 45
                                       Intento 5: 42
                                       Si es correcto, que muestre: “Felicidades, adivinaste el número”
                                       De lo contrario: “Se acabaron los intentos, el número que pensé era 42”
                                       """);
                    break;
                case 7:
                    System.out.println("""
                                       Enunciado 7:
                                       Leer dos enteros A y B y calcular F de acuerdo a las siguientes reglas:
                                       a) F = 2 * A + B Si A2 – B2 < 0
                                       b) F = A2 – 2* B Si A2 – B2 = 0
                                       c) A + B Si A2 – B2 > 0
                                       """);
                    break;
                case 8:
                    System.out.println("""
                                       Enunciado 8:
                                       Una institución estableció éste programa de estímulo a alumnos con buen rendimiento
                                       académico: Si el promedio es de 9.5 o más y el alumno es de preparatoria, entonces este
                                       podrá cursar 55 unidades y se le hará un 25% de descuento. Si el promedio es mayor o
                                       igual a 9 pero menor que 9.5 y el alumno es de preparatoria, entonces este podrá cursar
                                       50 unidades y se le hará un 10% de descuento. Si el promedio es mayor que 7 y menor
                                       que 9 y el alumno es de preparatoria, este podrá cursar 50 unidades y no tendrá ningún
                                       descuento. Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a
                                       3 y el alumno es de preparatoria, entonces podrá cursar 45 unidades y no tendrá
                                       descuento. Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o
                                       más y el alumno es de preparatoria, entonces podrá cursar 40 unidades y no tendrá
                                       ningún descuento. Si el promedio es mayor o igual a 9.5 y el alumno es de profesional,
                                       entonces podrá cursar 55 unidades y se le hará un 20% de descuento. Si el promedio es
                                       menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 unidades y no
                                       tendrá descuento. Obtener el total que tendrá que pagar un alumno si la colegiatura para
                                       alumnos de profesional es de $300 por cada cinco unidades y para alumnos de
                                       preparatoria es de $180 por cada cinco unidades.
                                       """);
                    break;
                case 9:
                    System.out.println("""
                                       Enunciado 9:
                                       Una compañía de seguros tiene contratados a N vendedores. Cada uno hace tres ventas
                                       a la semana. Su política de pagos es que un vendedor recibe un sueldo base y un 10%
                                       extra por comisiones de sus ventas. El gerente de la compañía desea saber cuánto dinero
                                       obtendrá en la semana cada vendedor, por concepto de comisiones por las tres ventas
                                       realizadas, y cuánto, tomando en cuenta su sueldo base y sus comisiones.
                                       """);
                    break;
                case 10:
                    System.err.println("""
                                       Enunciado 10:
                                       En una tienda de descuento, las personas que van a pagar el total de su compra llegan a
                                       la caja y sacan una bolita de color, que les dirá cuanto descuento tendrán sobre el total
                                       de su compra. Determinar la cantidad que pagará cada cliente desde que la tienda abre
                                       hasta que cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de
                                       descuento, si es amarilla un 25% y si es blanca no obtendrá descuento.
                                       """);
                    do {
                        System.err.print("""
                                         Bienvenido al sistema de Facturación:
                                         Ingrese el Precio de su Compra :
                                         """);
                        obp10.precio = Double.parseDouble(entrada.nextLine());
                        System.out.println("""
                                          Escoja el color de su Balota:
                                         1.Blanco.
                                         2.Rojo.
                                         3.Amarillo 
                                         """);
                        obp10.balota = Integer.parseInt(entrada.nextLine());
                        obp10.funcionBalota();

                        System.err.print("Si desea salir al anterior menu digite 0 de lo contrario digite otro numero: ");
                        op = Integer.parseInt(entrada.nextLine());
                    } while (op != 0);
                    break;

                case 11:
                    finalizar:
                    System.err.println("Finalizando software");
                    System.err.println("----------------------------------");

                    System.err.println("""
                                       Equipo desarrollador
                                       1. Benjamin Guardo.
                                       2. Carlos Alvarez.
                                       3. Daneisy Martinez.
                                       4. Jorge Castaño.
                                       5. Langel Sanchez.
                                        """);
                    System.err.println("Gracias por utilizar nuestros servicios");
                    System.err.println("***************************************");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error intente de nuevo escogiendo una de las opciones.");
            }

        } while (op != 11);
        entrada.close();
    }
}
