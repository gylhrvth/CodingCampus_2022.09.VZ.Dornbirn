package berna.week04;

public class TableOfData {
    //exercise: present given data in a nice table

    public static void main(String[] args) {

        //given input data:

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        //find out how much space you need for your table entries
        //--> size of the largest entry?
        System.out.println("max length of entry: ");
        System.out.println("maxlength1 = " + findLargestEntry(firstName));
        System.out.println("maxlength2 = " + findLargestEntry(lastName));
        System.out.println("maxlength3 = " + findLargestEntry(age));
        System.out.println("maxlength4 = " + findLargestEntry(place));
        System.out.println("maxlength5 = " + findLargestEntry(distanceFromCapital));

        String[] header = {"First name", "Last name", "Age", "Place", "Distance from capital"};
        System.out.println("maxlength6 = " + findLargestEntry(header));

        // for a nice format maxlength of entry + 2;

        int nrCols = firstName.length;
        int nrRows = firstName.length + 1; // because of the header
        System.out.println("\n");
        System.out.println("Here´s your nicely formatted table: ");
        System.out.println("\n");

        createTableOfData(nrCols, nrRows, header, firstName, lastName, age, place, distanceFromCapital);

    }

    public static int findLargestEntry(String[] stringInput) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < stringInput.length; i++) {
            for (int j = 0; j < stringInput.length; j++) {
                if (stringInput[i].length() > max) {
                    max = stringInput[i].length();
                }
            }
        }
        return max;
    }

    public static int findLargestEntry(int[] input) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (String.valueOf(input[i]).length() > max) {
                max = String.valueOf(input[i]).length();
            }
        }
        return max;
    }

    public static int findLargestEntry(float[] input) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (String.valueOf(input[i]).length() > max) {
                max = String.valueOf(input[i]).length();
            }
        }
        return max;
    }

    public static void createTableOfData(int nrCols, int nrRows, String[] col1, String[] col2, String[] col3, int[] col4, String[] col5, float[] col6) {

        //print the header
        for (int i = 0; i < nrCols; i++) {
            System.out.printf("%-17s  ", col1[i]);
        }
        System.out.println();
        System.out.println("__________________________________________________________________________________________________");

        //print the table body
        for (int i = 0; i < nrRows - 1; i++) {

            System.out.printf("%-17s  %-17s  %2d                 %-17s   %17.2f  %n", col2[i], col3[i], col4[i], col5[i], col6[i]);
        }
        System.out.println();
    }

}

