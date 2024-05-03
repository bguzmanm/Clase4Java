import java.util.Scanner;

public class Proyecto {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el % de avance del proyecto:");
    int avance = sc.nextInt();

    if (avance == 0) {
      System.out.println("El proyecto está pendiente.");
    } else if (avance > 0 && avance <= 99) {
      System.out.println("El proyecto está en proceso.");
    } else if (avance == 100){
      System.out.println("El proyecto está terminado.");
    } else {
      System.out.println("Avance ingresado incorrecto!");
    }

  }
}
