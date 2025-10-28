import java.util.Scanner;

public class PreTask1 {
    public static void main(String[] args) {
        double alas, tinggi, sisi2, sisi3, keliling, luas;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tolong masukkan nilai alas segitiga (cm): ");
        alas = input.nextDouble();

        System.out.print("Tolong masukkan nilai tinggi segitiga (cm): ");
        tinggi = input.nextDouble();

        System.out.print("Tolong masukkan nilai sisi 2 segitiga (cm): ");
        sisi2 = input.nextDouble();

        System.out.print("Tolong masukkan nilai sisi 3 segitiga (cm): ");
        sisi3 = input.nextDouble();
        input.close();


        keliling = alas + sisi2 + sisi3;
        luas = 0.5 * alas * tinggi;

        System.out.println("Keliling segitiga adalah: " + keliling + " cm");
        System.out.println("Luas segitiga adalah: " + luas + " cm^2");





    }
    
}
