package bangun.ruang;

public class Balok extends BangunRuang {

    double panjang;
    double lebar;
    double tinggi;

    @Override
    double volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok : " + volume);
        return volume;
    }

    @Override
    double luaspermukaan() {
        double luaspermukaan = 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
        System.out.println("luas permukaan balok : " + luaspermukaan);
        return luaspermukaan;
    }

}
