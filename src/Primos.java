import java.util.Scanner;

/**
 * Un número primo, es aquel que solo se puede dividir de forma exacta, por si mismo, y por 1.
 * 7 es primo, solo se puede dividir de forma exacta por 1 y 7.
 *
 * Requerimiento:
 * Elabora un algoritmo, que genere los n primeros números primos, donde n, lo ingresa el usuario
 */
public class Primos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de números primos que quieres ver:");
    int cantidad = sc.nextInt();

    int controlador = 0;
    int n = 2;
    while (controlador < cantidad){
      int contador = 0;
      for (int i = 1; i <= n ; i++) {
        if (n%i == 0) {
          contador++;
        }
      }

      if (contador==2) {
        System.out.printf("%d.- %d es primo\n", controlador+1, n);
        controlador++;
      }
      n++;
    }
  }
}
