import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        GenericStack numero = new GenericStack();

        System.out.print("Introduce el primer numero: ");
        int primerNumero = teclado.nextInt();
        numero.push(primerNumero);
        System.out.print("Introduce el segundo numero: ");
        int segundoNumero = teclado.nextInt();
        numero.push(segundoNumero);

        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Dividir");
        System.out.println("4. Restar");
        int operacion = teclado.nextInt();

        switch (operacion) {

            case 1:
                int primerN = numero.pop();
                int segundoN = numero.pop();
                System.out.println("numeros sumados: " + (primerN + segundoN));
                break;

            case 2:
                int primerN_a_multiplicar = numero.pop();
                int segundoN_a_multiplicar = numero.pop();
                System.out.println("numeros multiplicados: " + (primerN_a_multiplicar*segundoN_a_multiplicar));
                break;
            case 3:
                int primerN_a_dividir = numero.pop();
                int segundoN_a_dividir = numero.pop();
                System.out.println("numeros divididos: " + (primerN_a_dividir/segundoN_a_dividir));
                break;
            case 4:
                int primerN_a_restar = numero.pop();
                int segundoN_a_restar = numero.pop();
                System.out.println("numeros restados: " + (primerN_a_restar-segundoN_a_restar));
                break;
        }
    }
}
