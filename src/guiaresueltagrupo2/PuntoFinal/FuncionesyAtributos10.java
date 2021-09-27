package guiaresueltagrupo2.PuntoFinal;

public class FuncionesyAtributos10 {

    public int balota;
    public double precio, total, descuento1, descuento2;

    public void funcionBalota() {
        switch (balota) {
            case 1:
                System.out.println(" Su total es de:" + precio);
                break;

            case 2:
                descuento1 = (precio * 0.4);
                total = (precio - descuento1);
                System.out.println(" Su total con el descuento de 40% es: " + total);
                break;

            case 3:
                descuento2 = (precio * 0.25);
                total = (precio - descuento2);
                System.out.println(" Su total con descuento del 25% es: " + total);
                break;

        }
    }
}
