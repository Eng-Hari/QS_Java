
import java.util.*;

public class MagicNum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean home_page = true;
        int attempt = 5;
        int sys = (int) (Math.random() * 100);

        do {
            System.out.println("Vannakam to Magic Number");
            System.out.println("------------------------");
            boolean game = true;
            do {
                if (attempt >= 1) {
                    System.out.print("Enter your choice : ");
                    int n = sc.nextInt();
                    attempt--;
                    if (n > sys) {
                        System.out.println("Its High");
                    } else if (n < sys) {
                        System.out.println("Its Low");
                    } else if (sys == n) {
                        System.out.println("\nYou got it Buddy...!\n");
                        game = false;
                        Thread.sleep(2000);

                        System.out.println("\n1. Re-Start\n2. Exit");
                        int opp = sc.nextInt();

                        if (opp == 1) {
                            System.out.println("Processing....\n");
                            Thread.sleep(3000);
                            attempt = 5;
                            sys = (int) (Math.random() * 100);

                        } else if (opp == 2) {
                            game = false;
                            System.out.println("Game over, Visit Again..!\n");
                            home_page = false;
                        }

                    }

                } else if (attempt == 0) {

                    game = false;
                    home_page = false;
                    System.out.println("\nCross the limit, Try again..! \n   Thank you ..:)");

                }

            } while (game);
        } while (home_page);
    }
}
