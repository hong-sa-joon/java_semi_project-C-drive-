package plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nextLine() 입력: ");
        String inputnextLine= scanner.nextLine();
        System.out.println(inputnextLine);


        System.out.print("next()입력: ");
        String inputnext= scanner.next();
        System.out.println(inputnext);

        System.out.print("int형 입력: ");
        int inputint = scanner.nextInt();//int타입으로 값을 입력 받음
        System.out.println(inputint);

        System.out.print("double형 입력: ");
        double inputdouble = scanner.nextDouble();//double타입으로 값을 입력받음
        System.out.println(inputdouble);

        System.out.println("int + double="+(inputint+ inputdouble));

        System.out.print("boolean형 입력: ");
        Boolean inputBoolean=scanner.nextBoolean();
        System.out.println(inputBoolean);
    }
}
