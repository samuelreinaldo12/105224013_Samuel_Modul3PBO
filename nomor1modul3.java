import java.util.Scanner;

public class nomor1modul3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(   "Program Kalkulator Sederhana"  );

        System.out.print("Masukkan angka pertama:  ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua:  ");
        double angka2 = input.nextDouble();
        System.out.print("Masukkan operator yang ingin digunakan (+,-,*,/):  ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Hasilnya segini mpruy: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasilnya segini mpruy: " + (angka1 - angka2));
                break; 
            case '*':
                System.out.println("Hasilnya segini mpruy: " + (angka1 * angka2));
                break;
            case '/':
            if (angka2 !=0)
                System.out.println("Hasilnya segini mpruy: " + (angka1 / angka2));
            else {
                System.out.println("Hasilnya error mpruy gaboleh pake 0");
            }
            break;
        default:
            System.out.println("Operator ga valid mpruy.");
        }
        input.close();
    }
}