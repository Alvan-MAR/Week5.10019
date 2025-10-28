import java.util.Scanner;

public class PreTask1Revisi {
    public static void main(String[] args) {
        System.out.println("Selamat datang di program perhitungan segitiga!");
        System.out.println("Program ini akan membantu Anda menghitung keliling dan luas segitiga berdasarkan input yang Anda berikan.");
        System.out.println("Silahkan pilih jenis segitiga yang ingin Anda hitung:");
        System.out.println("1. Segitiga Sembarang");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Segitiga Sama Sisi");
        System.out.println("Mohon masukkan pilihan Anda (1/2/3): ");

        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            double sisi1, sisi2, sisi3, keliling, luas, semiPerimeter;
            
            System.out.print("Tolong masukkan nilai sisi 1 segitiga (cm): ");
            sisi1 = input.nextDouble();

            System.out.print("Tolong masukkan nilai sisi 2 segitiga (cm): ");
            sisi2 = input.nextDouble();

            System.out.print("Tolong masukkan nilai sisi 3 segitiga (cm): ");
            sisi3 = input.nextDouble();
            input.close();

            keliling = sisi1 + sisi2 + sisi3;
            semiPerimeter = keliling / 2;
            luas = Math.sqrt(semiPerimeter * (semiPerimeter - sisi1) * (semiPerimeter - sisi2) * (semiPerimeter - sisi3));

            
            System.out.println("Keliling segitiga adalah: " + keliling + " cm");
            System.out.println("Luas segitiga adalah: " + luas + " cm^2");

        }
        else if (pilihan == 2) {
            double alas, kaki, keliling, luas, semiPerimeter;
            
            System.out.print("Tolong masukkan nilai alas segitiga (cm): ");
            alas = input.nextDouble();

            System.out.print("Tolong masukkan nilai kaki segitiga (cm): ");
            kaki = input.nextDouble();
            input.close();

            keliling = alas + (2 * kaki);
            semiPerimeter = keliling / 2;
            luas = Math.sqrt(semiPerimeter * (semiPerimeter - alas) * (semiPerimeter - kaki) * (semiPerimeter - kaki));


            System.out.println("Keliling segitiga adalah: " + keliling + " cm");
            System.out.println("Luas segitiga adalah: " + luas + " cm^2");
        } 
        else if (pilihan == 3) {
            double sisi, keliling, luas, semiPerimeter;
            
            System.out.print("Tolong masukkan nilai sisi segitiga (cm): ");
            sisi = input.nextDouble();
            input.close();

            keliling = 3 * sisi;
            semiPerimeter = keliling / 2;
            luas = Math.sqrt(semiPerimeter * (semiPerimeter - sisi) * (semiPerimeter - sisi) * (semiPerimeter - sisi));


            System.out.println("Keliling segitiga adalah: " + keliling + " cm");
            System.out.println("Luas segitiga adalah: " + luas + " cm^2");
        } 
        else {
            System.out.println("Pilihan tidak valid. Silahkan jalankan program kembali dan pilih 1, 2, atau 3.");
        }
    }
    
}
