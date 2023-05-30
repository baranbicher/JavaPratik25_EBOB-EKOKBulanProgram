import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Girin: ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayısını Girin: ");
        int n2 = input.nextInt();

        int i = 1, ebob = 1, ekok = 1;

        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);

        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ekok: " + ekok);

        /*
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Girin: ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Girin: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob : " + ebob);
                break;
            }
        }

        ekok = (n1 * n2) / ebob;
        System.out.println("ekok: " + ekok);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int j = 1; j <= (n1 * n2); j++) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                System.out.println("ekok: " + ekok);
                break;
            }
        }

        */
    }
}