import java.util.Scanner;

public class Fibonacci07 {
    static int fibonacci(int n){
    if (n <= 1){
        return (n);
    } else {
        return (fibonacci(n-1)+ fibonacci(n-2));
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bulan : ");
    int bul = sc.nextInt();
    System.out.println("Total pasangan marmut bulan ke-" + bul + " adalah " + fibonacci(bul));
    }
}