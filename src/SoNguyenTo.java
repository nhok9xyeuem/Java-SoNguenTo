import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number+" is not Prime");
        } else {
            int i = 2;
            boolean check = true;
                while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    return;
                }
                i++;
            }
            if (check){
                System.out.println(number+" is Prime");
            }else {
                System.out.println(number+" not is Prime");
            }
        }
    }
}
