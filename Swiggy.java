
import java.util.*;

public class Swiggy {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Enter Your Name : \n ");
        String name = sc.nextLine();
        System.out.println("\nWellcome to swiggy, " + name);
        System.out.println("----------------------------------");
        System.out.println("1. Bhugari\n2. Thalapakatti\n3. A2B");
        System.out.print("\nChoose your Restaurant : \n");
        int opp = sc.nextInt();
        System.out.println("\nProcessing....");
        Thread.sleep(2000);

        switch (opp) {
            case 1: {

                System.out.println("\nWellcome to Bhugari, " + name);
                System.out.println("----------------------------------");
                System.out.println("--- Menu --- \n");
                System.out.println("1. Chicken Briyani\n2. Mutton Briyani\n3. Hyderabadi chicken Briyani");
            }
            case 2: {

                System.out.println("\nWellcome to Thalapakatti, " + name);
                System.out.println("----------------------------------");
                System.out.println("--- Menu --- \n");
                System.out.println("1. Thalapakatti Chicken 65 Briyani\n2. Thalapakatti Special Mutton Briyani\n3. Thalapakatti Mutton Kola Urundai Briyani");
            }

            case 3: {

                System.out.println("\nWellcome to A2B, " + name);
                System.out.println("----------------------------------");
                System.out.println("--- Menu --- \n");
                System.out.println("1. Masala Dosa  \n2. Butter Naan\n3. Panner Butter Masala");
            }

            System.out.print("\nOrder Here : ");
            int order = sc.nextInt();
            System.out.print("\nEnter the quantity : ");
            int qan = sc.nextInt();
            // System.out.println("\nThank you for your Order..! ");
            Thread.sleep(1000);

            double price = 0.0;
            if (order > 3) {
                System.out.println("\nInvalid menu");
            } else if (order == 1) {
                price = 280;
            } else if (order == 2) {
                price = 380;
            } else if (order == 3) {
                price = 450;
            }
            double bill = price * qan;
            System.out.println("\nYou Bill : " + bill);
            System.out.println("\nMay I confirm you order, " + name + " ->  yes/no");
            char ans = sc.next().charAt(0);
            ans = Character.toLowerCase(ans);
            if (ans == 'y') {
                System.out.println("\nPraparing your order..! \n");
                Thread.sleep(2000);

                System.out.println("Choose your's Payment Method");
                System.out.println("1.G.pay\n2.PhonePe\n3.Super Money\n");
                int pay = sc.nextInt();
                Thread.sleep(2000);

                switch (pay) {
                    case 1: {
                        System.out.println("\n***** G.Pay Pament Page *****\n");
                        break;
                    }

                    case 2: {
                        System.out.println("\n****** PhonePe Pament Page *****\n");
                        break;
                    }
                    case 3:
                        System.out.println("\n****** Super Money Pament Page *****\n");
                        break;
                }
                System.out.println("Your Bill amount : " + bill);
                System.out.print("Re-enter your bill amount : ");
                double cash = sc.nextDouble();
                System.out.println("\nProcessing...\n");
                Thread.sleep(2000);
                if (cash == bill) {
                    int otp = (int) (Math.random() * 9999 + 9999);
                    System.out.println("Here your OTP : " + otp);
                    Thread.sleep(3000);
                    System.out.print("Enter your OTP here : ");
                    int user = sc.nextInt();

                    if (otp == user) {
                        System.out.println("\nYour Order is on the way, " + name);
                        Thread.sleep(4000);
                        System.out.println("\n" + name + ", you order deliverd..! "
                        );
                        Thread.sleep(1000);
                        System.out.println("\nThank you, visit again...!");

                    } else {
                        System.out.println("\nOrder Cancelled... Sorry..!");
                    }

                    break;

                }

            } else if (ans == 'n') {
                Thread.sleep(2000);
                System.out.println("Thank you, visit again, " + name);
            }

            System.out.println("");

        }

    }

}
