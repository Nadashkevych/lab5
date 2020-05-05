public class HalfString {
    public String halfString(String line) {
        String[] strings = line.split("");
        String newLine = "";
        for (int i = 0; i < strings.length / 2; i++) {
            newLine += strings[i];
        }
        return newLine;
    }
}
