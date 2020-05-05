
public class Temperature {

    public boolean lowerThan100(double t1, double t2) {
        boolean ifLower = false;
        if (t1 < 100 || t2 < 100) {
            ifLower = true;
        }
        return ifLower;
    }
    //zmiany w kodzie:
    //1) usunieto metode main
    //2) caly kod klasy zapisano do metody, ktora bedzie testowana
    //3) w tym przypadku - zmieniono nazwe klasy z TemperatureTest na Temperature, bo w tej klasie juz nic nie sprawdzamy
}

