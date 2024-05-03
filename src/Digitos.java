import java.util.Scanner;

/**
 * Escribe un programa que lea un número entero positivo
 * y calcule la suma de sus dígitos.
 * Por ejemplo, si el número es 123,
 * la suma de sus dígitos sería 1 + 2 + 3 = 6.
 */
public class Digitos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa un número entero positivo:");
    int numero = sc.nextInt();
    int original = numero;
    int acumulador = 0;
    int digito;

    while (numero > 0) {
      // 123 / 10 = 12.3
      // 123 % 10 => 3
      digito = numero % 10;
      acumulador += digito;
      numero = numero / 10;
    }

    System.out.printf("La suma de los digitos de %d es %d",
            original, acumulador);

  }

}
