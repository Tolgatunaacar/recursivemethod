import java.util.Scanner;

public class C {

    static void pow(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tabanı girin:");
        int base = input.nextInt();
        System.out.println("Üssü girin:");
        int power = input.nextInt();
        int result = 1;
        for (int i = 1; i<=power;i++){
            result *= base;
        }
        System.out.println(result);
        pow();
    }

    public static void main(String[] args) {
        pow();
    }
}
