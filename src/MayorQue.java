import java.util.Scanner;

public class MayorQue {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa un número");
    int numeroA = sc.nextInt();

    System.out.println("Ingresa otro número");
    int numeroB = sc.nextInt();

    // alternativa recomendadad: facilita la lectura de los condicionales
    /*
    if (numeroA > numeroB) {
      System.out.printf("%d es mayor a %d", numeroA, numeroB);
    }

    if (numeroA < numeroB) {
      System.out.printf("%d es mayor a %d", numeroB, numeroA);
    }

    if (numeroA == numeroB) {
      System.out.printf("%d es igual a %d", numeroA, numeroB);
    }*/

    // alternativa, anidando los if.
    /*
    if (numeroA > numeroB) {
      System.out.printf("%d es mayor a %d", numeroA, numeroB);
    } else {
      if (numeroB > numeroA) {
        System.out.printf("%d es mayor a %d", numeroB, numeroA);
      } else {
        System.out.printf("%d es igual a %d", numeroA, numeroB);
      }
    }*/

    // alternativa, sin anidar los if.
    if (numeroA > numeroB) {
      System.out.printf("%d es mayor a %d", numeroA, numeroB);
    } else if(numeroB > numeroA) {
        System.out.printf("%d es mayor a %d", numeroB, numeroA);
    } else {
        System.out.printf("%d es igual a %d", numeroA, numeroB);
    }

  }
}




























