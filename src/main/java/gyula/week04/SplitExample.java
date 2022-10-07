package gyula.week04;

public class SplitExample {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        String[] lines = text.split("Tag");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            sb
                .append(lines[i])
                .append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
