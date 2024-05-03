import java.util.Scanner;
/**
 * Escribe un algoritmo, que dado un número ingresado por el usuario,
 * determine si es par o impar.
 */
public class ParesImpares {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa un número para evaluar:");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.printf("%d es par", numero);
    } else {
      System.out.printf("%d es impar", numero);
    }
  }
}
