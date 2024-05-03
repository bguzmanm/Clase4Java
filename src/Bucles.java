public class Bucles {
  public static void main(String[] args) {

   /**
   * Diseña una aplicación que muestre las tablas de
   * multiplicar del 1 al 10.
   */

    /**
     * 1 x 1 = 1
     * 1 x 2 = 2
     * 1 x 3 = 3
     */

    for (int i = 1; i <= 10; i++) {
      System.out.printf("Tabla del %d\n--------------\n", i);
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, i * j);
      }
    }
  }
}
