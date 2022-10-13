import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int prefix = 5550000;
        int limit = 5560000;
        if ((num >= prefix) && (num < limit)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        }
    }
