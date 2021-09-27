package guiaresueltagrupo2.Punto3;

public class FuncionesyAtributos3 {

    public int nv, nmultiplo;

    public void funcionMultiplo() {
        if (nv % nmultiplo == 0) {
            System.out.println("El número " + nv + " es multiplo de " + nmultiplo);
        } else {
            System.out.println("El numero " + nv + " no es multiplo de " + nmultiplo);
        }
    }
}
