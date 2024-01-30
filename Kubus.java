package bangun.ruang;

public class Kubus extends BangunRuang {

    double sisi;

    @Override
    double volume() {
        double hasil = sisi * sisi * sisi;
        System.out.println("volume kubus : " + hasil);
        return hasil;
    }

    @Override
    double luaspermukaan() {
        double hasil = 6 * sisi * sisi;
        System.out.println("luas permukaan kubus : " + hasil);
        return hasil;
    }

}
