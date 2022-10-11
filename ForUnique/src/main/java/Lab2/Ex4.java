package Lab2;


import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int qwe = 1; qwe<=n; qwe++){

        sum+=qwe;
        System.out.println(sum);
        }

    }
}