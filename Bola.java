package bangun.ruang;

public class Bola extends BangunRuang {

    double r;

    @Override
    double volume() {
        double volume = 4 / 3 * (double) (Math.PI * r * r * r);
        System.out.println("Volume Bola : " + volume);
        return volume;
    }

    @Override
    double luaspermukaan() {
        double luaspermukaan = 4 * (double) (Math.PI * r * r);
        System.out.println("Luas Permukaan : " + luaspermukaan);
        return luaspermukaan;
    }
}
