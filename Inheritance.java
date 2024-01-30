package bangun.ruang;

import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BangunRuang bangunRuang = new BangunRuang();

        Kubus kubus = new Kubus();
        System.out.println("masukan sisi kubus :");
        kubus.sisi = input.nextInt();

        Balok balok = new Balok();
        System.out.println("masukkan panjang balok :");
        balok.panjang = input.nextInt();
        System.out.println("masukkan lebar balok :");
        balok.lebar = input.nextInt();
        System.out.println("masukkan tinggi balok :");
        balok.tinggi = input.nextInt();

        Bola bola = new Bola();
        System.out.println("masukan jari-jari bola :");
        bola.r = input.nextInt();

        LimasSegitiga limasSegitiga = new LimasSegitiga();
        System.out.println("masukan  alas limassegitiga :");
        limasSegitiga.a = input.nextInt();
        System.out.println("masukan ts limas segitiga :");
        limasSegitiga.ts = input.nextInt();
        System.out.println("masukan tl limas segitiga :");
        limasSegitiga.tl = input.nextInt();
        System.out.println("masukan sisi tegak limas segitiga :");
        limasSegitiga.tst = input.nextInt();

        bangunRuang.volume();
        bangunRuang.luaspermukaan();

        kubus.volume();
        kubus.luaspermukaan();

        bola.volume();
        bola.luaspermukaan();

        balok.volume();
        balok.luaspermukaan();

        limasSegitiga.volume();
        limasSegitiga.luaspermukaan();

    }

}
