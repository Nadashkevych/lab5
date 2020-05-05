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
}
