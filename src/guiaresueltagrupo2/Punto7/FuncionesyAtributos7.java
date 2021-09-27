package guiaresueltagrupo2.Punto7;

import java.text.DecimalFormat;

public class FuncionesyAtributos7 {

    public double a, b;

    public void funcionCalculoF() {
        double F;
        double op1;
        DecimalFormat formateardouble = new DecimalFormat();
        formateardouble.setDecimalSeparatorAlwaysShown(false);
        op1 = Math.pow(this.a, 2) - Math.pow(this.b, 2);

        if (op1 < 0) {
            F = (2 * this.a) + this.b;
            System.out.println("Debido a que (A^2 - B^2) es menor a 0 el resultado es: " + formateardouble.format(F));
        } else if (op1 == 0) {
            F = Math.pow(this.a, 2) - (2 * this.b);
            System.out.println("Debido a que (A^2 - B^2) es igual a 0 el resultado es: " + formateardouble.format(F));
        } else if (op1 > 0) {
            F = this.a + this.b;
            System.out.println("Debido a que (A^2 - B^2) es mayor a 0 el resultado es: " + formateardouble.format(F));
        }
    }
}
