import java.util.Scanner;

public class PreTask1 {
    public static void main(String[] args) {
        double alas, tinggi, sisi2, sisi3, keliling, luas;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tolong masukkan nilai alas segitiga: ");
        alas = input.nextDouble();

        System.out.print("Tolong masukkan nilai tinggi segitiga: ");
        tinggi = input.nextDouble();

        System.out.print("Tolong masukkan nilai sisi 2 segitiga: ");
        sisi2 = input.nextDouble();

        System.out.print("Tolong masukkan nilai sisi 3 segitiga: ");
        sisi3 = input.nextDouble();
        input.close();


        keliling = alas + sisi2 + sisi3;
        luas = 0.5 * alas * tinggi;

        System.out.println("Keliling segitiga adalah: " + keliling);
        System.out.println("Luas segitiga adalah: " + luas);





    }
    
}
