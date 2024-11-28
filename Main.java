import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("名前>");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("こんにちは、"+name+"さん");
    }
}