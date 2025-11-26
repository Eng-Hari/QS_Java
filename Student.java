
import java.util.*;

public class Student {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean menu = true;
        do {
            System.out.println("\n----- Teacher Data Base -----");
            System.out.println("1. Std 10th\n2. Std 11th\n3. Std 12th\n4. Exit");
            System.out.print("Enter your Class : ");
            int n = sc.nextInt();
            System.out.println("\nProcessing....");
            Thread.sleep(2000);
            boolean school = true;
            if (n > 0 && n < 5) {

                do {

                    switch (n) {
                        case 1 -> {
                            System.out.println("\n--- 1oth Std ---");
                            System.out.println("1. Maths\n2. Physics\n3. Chemistry\n4. English\n5. Exit");
                            System.out.print("Enter the Subject : ");
                            int num = sc.nextInt();
                            Thread.sleep(2000);

                            switch (num) {
                                case 1 ->
                                    System.out.println("Malar");
                                case 2 ->
                                    System.out.println("Bala");
                                case 3 ->
                                    System.out.println("Lalitha");
                                case 4 ->
                                    System.out.println("James");
                                case 5 -> {
                                    school = false;
                                    System.out.println("Exiting....");
                                    Thread.sleep(2000);
                                }
                            }
                        }

                        case 2 -> {
                            System.out.println("--- 11th Std ---");
                            System.out.println("1. Maths\n2. Physics\n3. Chemistry\n4. English\n5. Exit");
                            System.out.print("Enter the Subject : ");
                            int num = sc.nextInt();
                            Thread.sleep(2000);

                            switch (num) {
                                case 1 ->
                                    System.out.println("Kanna");
                                case 2 ->
                                    System.out.println("Kumar");
                                case 3 ->
                                    System.out.println("Monica");
                                case 4 ->
                                    System.out.println("Jessica");
                                case 5 -> {
                                    school = false;
                                    System.out.println("Exiting....");
                                    Thread.sleep(2000);

                                }
                            }
                        }

                        case 3 -> {
                            System.out.println("--- 12th Std ---");
                            System.out.println("1. Maths\n2. Physics\n3. Chemistry\n4. English\n5. Exit");
                            System.out.print("Enter the Subject : ");
                            int num = sc.nextInt();
                            Thread.sleep(2000);

                            switch (num) {
                                case 1 ->
                                    System.out.println("Priya");
                                case 2 ->
                                    System.out.println("Selvi");
                                case 3 ->
                                    System.out.println("Sathish");
                                case 4 ->
                                    System.out.println("Vasugi");
                                case 5 -> {
                                    school = false;
                                    System.out.println("Exiting....");
                                    Thread.sleep(2000);

                                }
                            }
                        }

                        case 4 -> {
                            Thread.sleep(2000);

                            school = false;
                            menu = false;
                            System.out.println("Exiting....\n");
                            Thread.sleep(2000);

                            System.out.println("Thank you ...:)");
                        }
                    }

                } while (school);

            } else {
                System.out.println("\nInvalid Opption, Please select Valid one..!");
            }

        } while (menu);

    }

}
