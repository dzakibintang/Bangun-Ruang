package bangun.ruang;

public class LimasSegitiga extends BangunRuang {

    double a;
    double ts;
    double tl;
    double tst;

    @Override
    double volume() {
        double volume = 1 / 3 * (1 / 2 * a * ts) * tl;
        System.out.println("Volume Limas Segitiga : " + volume);
        return volume;
    }

    @Override
    double luaspermukaan() {
        double luaspermukaan = (1 / 2 * a * ts) + (3 * (1 / 2 * a * tst));
        System.out.println("Luas Permukaan Limas Segitiga : " + luaspermukaan);
        return luaspermukaan;
    }
}
