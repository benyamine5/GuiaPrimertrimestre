package guiaresueltagrupo2.Punto1;

public class FuncionesyAtributos {

    public int n;

    public void Funcionpareimpar() {

        if (n < 0) {
            System.out.println("Digite un numero positivo por favor");

        } else if (n % 2 == 0) {
            System.out.println("El número " + n + " es par");
        } else {
            System.out.println("El numero " + n + " es impar");
        }

    }
}
