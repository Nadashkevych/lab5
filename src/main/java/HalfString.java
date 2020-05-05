public class HalfString {
    public String halfString(String line) {
        String[] strings = line.split("");
        String newLine = "";
        for (int i = 0; i < strings.length / 2; i++) {
            newLine += strings[i];
        }
        return newLine;
    }
    //zmiany w kodzie:
    //1) usunieto metode main
    //2) caly kod klasy zapisano do metody, ktora bedzie testowana
    //3) usunieto Scaner i wprowadzenie String'a przez uzytkownika, bo w tescie nie jest to potrzebne
}
