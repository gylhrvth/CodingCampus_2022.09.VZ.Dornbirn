package lukas.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

@SuppressWarnings("unused")
public class Texts {
    public static String HESSE = """
            Zur Zeit des Zweiten Weltkriegs waren seine großen Werke Siddhartha und Der Steppenwolf noch verboten. Heute gehört Hermann Hesse zu den bekanntesten deutschen Schriftstellern. Mehr über den Weltveränderer lest ihr hier
            Hermann Hesse

            Hermann Hesse erhielt den Nobelpreis für Literatur
            Hermann Hesse: Kurz-Steckbrief

                Vollständiger Name: Hermann Karl Hesse
                Lebensdaten: 2. Juli 1877 bis 9. August 1962
                Nationalität: deutsch, später schweizerisch
                Zitat: "Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es auf jeden Fall tun, mag er uns darum bitten oder nicht."

            Als Schriftsteller, Dichter und Maler prägte Hermann Hesse die Literatur und Kunst des 19. Jahrhunderts.
            Wie Hermann Hesse lebte

            Hermann Hesse wurde am 2. Juli 1877 in Calw, einer Stadt in Württemberg geboren. Seine Familie war sehr religiös, der Vater Johannes sogar Missionar, also so genannter "Gesandter", der seinen Glauben weiterverbreiten wollte.

            So sollten auch die Kinder in die Fußstapfen der religiösen Eltern treten. Hesse war davon aber gar nicht begeistert und soll einmal gesagt haben, dass er "entweder Dichter oder gar nichts werden" wolle.

            1893 verließ der junge Hesse das Gymnasium mit dem Abschluss der Mittleren Reife. Danach schloss er zwei Lehren ab: eine als Turmuhrenmechaniker und eine als Buchhändler.

            Gegen den Willen seiner Eltern ließ er sich in der Schweizer Stadt Basel nieder, um seinem Traum vom Dichter-Dasein näher zu kommen. 1899 veröffentlichte er seine erste Lyriksammlung. In dieser Zeit heiratete er auch seine erste Frau Maria Bernoulli, von der er sich aber 15 Jahre später wieder trennte. Aus der Ehe gingen drei Söhne hervor.

            Zwölf Jahre lang ist Adolf Hitler Deutschlands Reichskanzler. Viele Menschen sind damals von ihm begeistert, doch es wird eine Schreckensherrschaft. Wir haben die Geschichte des Nationalsozialismus auf dieser Themenseite für euch zusammengefasst


            Wie Hermann Hesse die Welt veränderte

            Um das Jahr 1904 gelang ihm der Durchbruch. Der Roman "Peter Camenzind" stimmt an vielen Stellen mit Hesses Leben überein. Literatur-Experten handeln das Werk als "Beginn des modernen Bildungsromans". Auf den ersten großen Erfolg folgten weitere beeindruckende Erzählungen und Romane.

            1914, als der erste Weltkrieg begann, meldete sich der Schriftsteller zum Militärdienst für das Deutsche Reich. Aufgrund seiner Kurzsichtigkeit wurde er aber ausgemustert und der deutschen Kriegsgefangenenfürsorge zugeteilt. Seine Aufgabe war es, für die Gefangenen Bücher zu sammeln. Außerdem leitete er die "Bücherei für deutsche Kriegsgefangene".

            Diese Erfahrungen prägten Hesse sehr. In vielen seiner folgenden Texte sprach er sich deutlich gegen Krieg und Patriotismus ("Vaterlandsliebe") aus. Zusätzlich belasteten ihn familiäre Schicksalsschläge: 1916 starb sein Vater, sein Sohn litt an einer schweren Erkrankung und seine Ehe mit Bernoulli ging in die Brüche. Das ging Hesse so nahe, dass er eine Therapie machte. In dieser Phase seines Lebens widmete er sich auch erstmals der Malerei.

            Innerhalb kurzer Zeit heiratete er daraufhin zweimal: 1924 Ruth Wenger, die Tochter einer bekannten Schriftstellerin, 1931 die Kunsthistorikerin Ninon Dolbin. Gleichzeitig begann der Zweite Weltkrieg. Die Nationalsozialisten erklärten seine Werke als volksfeindlich und verbaten beispielsweise "Unterm Rad", "Der Steppenwolf" und "Betrachtungen". Hesses Verleger Peter Suhrkamp wurde 1944 sogar verhaftet.

            Hermann Hesse ließ sich den Mund aber nicht verbieten: Weiterhin schrieb er Regime-kritische Texte, also Texte, die die nationalsozialistische Herrschaft unter Adolf Hitler angriffen. Nach dem Zweiten Weltkrieg wurden diese dann auch veröffentlicht.

            Er hasste den Krieg. In seinem Testament widmete der Physiker und Chemiker Alfred Nobel sein Vermögen unter anderem der Vergabe des jährlichen Friedenspreises
            Hermann Hesses Tod in der Schweiz

            1946 zog sich Hesse zurück, da sein Gesundheitszustand immer schlechter wurde. "Das Glasperlenspiel" und "Krieg und Frieden" waren Anlass dafür, dass er am 14. November desselben Jahres mit dem Nobelpreis für Literatur ausgezeichnet wurde. Für sein Lebenswerk wurde er ein Jahr später zum Ehrendoktor sowie Ehrenbürger von Calw, seiner Geburtsstadt, ernannt. 1955 folgte der Friedenspreis des Deutschen Buchhandels.

            Am 9. August 1962 starb Hermann Hesse an einem Gehirnschlag in seinem Haus in der Schweiz. Heute gehört Hermann Hesse zu denbekanntesten deutschsprachigenr Schriftstellern. Seine Werke wurden in 55 Sprachen übersetzt.
            Zitate von Hermann Hesse

            "Man muß das Unmögliche versuchen, um das Mögliche zu erreichen."
            Hermann Hesse
            \s

            "Man braucht vor niemand Angst zu haben. Wenn man jemanden fürchtet, dann kommt es daher, daß man diesem Jemand Macht über sich eingeräumt hat."
            Hermann Hesse, Demian
            \s

            "Man hat nur Angst, wenn man mit sich selber nicht einig ist."
            Hermann Hesse, Demian
            \s

            "Recht als wolle es ihn mit der Nase darauf stoßen, hatte sein Glück ihm diese prächtige Figur in seinen Weg gestellt, daß er sich an sie halte. Aber der Mensch ist zu nichts schwerer zu bringen als zu seinem Glück."
            Hermann Hesse, Der Weltverbesserer
            \s

            "Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es in jedem Fall tun, mag er uns darum bitten oder nicht."
            Hermann Hesse, Das Glasperlenspiel
            \s

            "Die Welt zu durchschauen, sie zu verachten, mag großer Denker Sache sein. Mir aber liegt einzig daran, die Welt lieben zu können, sie und mich und alle Wesen mit Liebe und Bewunderung und Ehrfurcht betrachten zu können."
            Hermann Hesse
            """;

    public static String getSimpleText() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"))));
            StringBuilder builder = new StringBuilder();
            String input;
            while ((input = reader.readLine()) != null) {
                builder.append(input);
                builder.append(System.lineSeparator());
            }
            return builder.toString();
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
