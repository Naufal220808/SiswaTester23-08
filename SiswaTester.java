//Driver Class
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();

        Siswa erwan = new Siswa(id, nama, ipk);
        erwan.print();
        //object
        //Class object = new Constructor
        Siswa tegar = new Siswa(16,"Tegar",100);
        Siswa naufal = new Siswa(28,"Naufal",0);
        Siswa ryuichi = new Siswa(32,"Ryuichi",100);
        Siswa bima = new Siswa(2,"Bima",100);
        Siswa moreno = new Siswa(24,"Moreno",100);

        naufal.id = 28;
        naufal.nama = "Naufal";
        naufal.ipk = 0;
        ryuichi.id = 32;
        ryuichi.nama = "Ryuichi";
        ryuichi.ipk = 100;
        tegar.id = 16;
        tegar.nama = "Tegar";
        tegar.ipk = 100;
        bima.id = 2;
        bima.nama = "Bima";
        bima.ipk = 100;
        moreno.id = 24;
        moreno.nama = "Moreno";
        moreno.ipk = 100;

        System.out.println("Nama : " + naufal.nama);
        System.out.println("Absen : " + naufal.id);
        System.out.println("Nilai : " + naufal.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + ryuichi.nama);
        System.out.println("Absen : " + ryuichi.id);
        System.out.println("Nilai : " + ryuichi.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + tegar.nama);
        System.out.println("Absen : " + tegar.id);
        System.out.println("Nilai : " + tegar.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + bima.nama);
        System.out.println("Absen : " + bima.id);
        System.out.println("Nilai : " + bima.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + moreno.nama);
        System.out.println("Absen : " + moreno.id);
        System.out.println("Nilai : " + moreno.ipk);

        naufal.print();
        ryuichi.print();
        tegar.print();
        bima.print();
        moreno.print();
        input.close();
    }
}