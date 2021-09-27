package guiaresueltagrupo2.Punto4;

public class FuncionesyAtributos4 {

    public int nfilas;

    public void funcionnfilas() {

        int impar = 1;
        for (int i = 1; i <= this.nfilas; i++) {
            for (int j = 1; j <= (i + (i - 1)); j++) {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
