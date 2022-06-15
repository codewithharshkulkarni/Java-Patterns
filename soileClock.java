package Patterns;
/*
 *********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/

public class soileClock {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
