public class SequenceSearch {
    public boolean findSequence(int[] array) {
        boolean sequenceFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                if (array[i + 1] == 2) {
                    if (array[i + 2] == 3) {
                        sequenceFound = true;
                    }
                }
            }
        }
        return sequenceFound;
    }
    //zmiany w kodzie:
    //1) usunieto metode main
    //2) caly kod klasy zapisano do metody, ktora bedzie testowana
    //3) usunieto Scaner i wprowadzenie liczb do tabeli przez uzytkownika,
    // bo w tescie nie jest to potrzebne
}
