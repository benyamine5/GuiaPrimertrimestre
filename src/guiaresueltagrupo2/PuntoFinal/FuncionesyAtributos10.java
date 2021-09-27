package guiaresueltagrupo2.PuntoFinal;

import java.text.DecimalFormat;

public class FuncionesyAtributos10 {

    public int balota;
    public double precio, total, descuento1, descuento2;

    public void funcionBalota() {
        DecimalFormat formateardouble = new DecimalFormat();
        formateardouble.setDecimalSeparatorAlwaysShown(false);
        switch (balota) {
            case 1:
                System.out.println(" Su total es de:" + formateardouble.format(precio));
                break;

            case 2:
                descuento1 = (precio * 0.4);
                total = (precio - descuento1);
                System.out.println(" Su total con el descuento de 40% es: " + formateardouble.format(total));
                break;

            case 3:
                descuento2 = (precio * 0.25);
                total = (precio - descuento2);
                System.out.println(" Su total con descuento del 25% es: " + formateardouble.format(total));
                break;
            default:
                System.out.println("Error intente de nuevo escogiendo una de las opciones.");

        }
    }
}
