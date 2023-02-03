import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to latePass by LATESOFT");
        System.out.print("Enter password size: ");
        int passwordSize = scanner.nextInt();
        String[] password = new String[passwordSize];
        int numOrSym, num, sym, sizeSym;
        char[] symArr = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd',
                         'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for(int i = 0; i<passwordSize; i++){
            numOrSym = random.nextInt(2);
            if(numOrSym == 0){
                num = random.nextInt(10);
                password[i] = String.valueOf(num);
            } else {
                sizeSym = random.nextInt(2);
                if (sizeSym == 0){
                    sym = random.nextInt(symArr.length);
                    password[i] = String.valueOf(symArr[sym]);
                } else {
                    sym = random.nextInt(symArr.length);
                    password[i] = String.valueOf(symArr[sym]).toUpperCase();
                }

            }
            System.out.print(password[i]);
        }
        System.out.println();
    }
}