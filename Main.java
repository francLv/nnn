import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int sum = x + y + z;
        if((sum % 2) != 0) {
            System.out.println(sum / 2 + 1);
        } else {
          System.out.println(sum / 2);
          }  
    }
}