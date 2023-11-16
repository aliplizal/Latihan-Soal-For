public class Soal02Dan04 {
    public static void main(String[] args) {
        int i;
        int total = 1;

        for (i = 1; i <= 64; i *= 2) {
            System.out.print(i + " ");
            total *= i;
        }
            System.out.println("\nTotal = " + total);
    }
}
