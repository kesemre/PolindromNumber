import java.util.Scanner;

public class PolindromNumber {
    static void Polndrom(int number) {
        int tempNumber = number, modNumber, resultNumber = 0;
        while (tempNumber != 0) {
            modNumber = tempNumber % 10;
            resultNumber *= 10;
            resultNumber += modNumber;
            tempNumber /=10;
        }
        if (resultNumber==number) System.out.println(number+" bir Polindrom sayıdır");
        else System.out.println(number+" Polindrom sayı değildir");
    }
    public static void main(String[] args) {
        System.out.print("Lütfen sayı giriniz");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Polndrom(number);

    }
}

