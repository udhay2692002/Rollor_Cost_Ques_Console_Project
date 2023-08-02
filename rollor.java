import java.util.Scanner;

public class rollor {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 4;
        a[1] = 2;
        a[2] = 1;
        a[3] = 3;

        Scanner obj=new Scanner(System.in);
        int rounds;
        int seats;
        int count = 1;
        int profit =0;
        int ticket=1;

        System.out.println("***********************WELCOME TO ROLORCOST UDHAYAKUMAR*******************************");
        System.out.println("ENTER THE NUMBER OF ROUND OF THE DAY:");
        rounds=obj.nextInt();
        System.out.println("ENTER THE NUMBER OF SEATS IN ROLLOR COST:");
        seats=obj.nextInt();


        for (int j = 0; j < rounds; j++) {

            int logic = a[0] + a[1];
            if (logic <= seats) {

                System.out.println(a[0] + "," + a[1] + "  IS TRAVELING " + count + " ROUND");
                profit+=ticket*a[0];
                profit+=ticket*a[1];

                for (int i = 0; i < a.length - 1; i++) {
                    if (i == 0) {
                        a[4] = a[0];
                    }
                    a[i] = a[i + 1];
                }

                for (int i = 0; i < a.length - 1; i++) {
                    if (i == 0) {
                        a[4] = a[0];
                    }
                    a[i] = a[i + 1];
                }

            } else
            {
                System.out.println(a[0] + "  IS TRAVELING " + count + " ROUND");
                profit+=ticket*a[0];
                for (int i = 0; i < a.length - 1; i++) {
                    if (i == 0) {
                        a[4] = a[0];
                    }
                    a[i] = a[i + 1];
                }


            }

            count++;

        }
        System.out.println("THE TOTAL REVENUE IS="+profit);

    }
}
