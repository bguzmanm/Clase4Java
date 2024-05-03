import java.util.Scanner;

public class Reprobados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa tu nombre:");
    String nombre = sc.nextLine();

    System.out.println("Ingresa nota 1:");
    float n1 = sc.nextFloat();

    System.out.println("Ingresa nota 2:");
    float n2 = sc.nextFloat();

    System.out.println("Ingresa nota 3:");
    float n3 = sc.nextFloat();

    float promedio = (n1 + n2 + n3)/3;

    String evaluacion;
    if (promedio < 4f) {
      evaluacion = "REPROBADO/A!!";
    } else if (promedio >= 6f){
      evaluacion = "APROBADO/A CON HONORES!!";
    } else {
      evaluacion = "APROBADO/A!!";
    }
      System.out.printf("%s tuvo las siguientes notas:\n" +
              "N1: %.2f | N2: %.2f | N3: %.2f \n" +
              "Promedio: %.2f \n" +
              "%s", nombre, n1, n2, n3, promedio, evaluacion);

  }
}
