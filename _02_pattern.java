package pattern_revision;

import java.util.Scanner;

public class _02_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5

        int i,j=5;
        for ( i = 1; i <=5; i++) {
            for ( j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <i ;j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        * * * * *
        * * * *
        * * *
        * *
        *

        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        *
      * *
    * * *
  * * * *
* * * * *
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         * * * * *
           * * * *
             * * *
               * *
                 *

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=5  ; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    1
    2 3
    3 4 5
    4 5 6 7
    5 6 7 8 9



        for (int i = 1; i <=5 ; i++) {
            int a=i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
//        palindrone triangle
         1
       1 2 1
     1 2 3 2 1
   1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1


        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i ; j++) { // for spaces
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        star bridge

        * * * * * * *
        * * *   * * *
        * *       * *
        *           *


        for(int i=1; i<=2*n-1; i++){ // for 1st row
            System.out.print("* ");
        }
        System.out.println();
        n--;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n+1 - i; j++) {// first triangle
                System.out.print("* ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {// for middle spaces
                System.out.print("  ");
            }
            for (int j = 1; j <=n+1-i ; j++) {// 2nd triangle
                System.out.print("* ");
            }
            System.out.println();
        }
//        number bridge
        1 2 3 4 5 6 7
        1 2 3   5 6 7
        1 2       6 7
        1           7


        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <=n ; i++) {
            int a=1;
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(a++ +" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
                 *
               * *
             * * *
           * * * *
             * * *
               * *
                 *


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i+j > n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
