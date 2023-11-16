import java.util.Scanner;

public class Soal01Dan03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int total = 0;

        for (i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
            total += i;
        }

        System.out.println("\nTotal = " + total);
    }
}
