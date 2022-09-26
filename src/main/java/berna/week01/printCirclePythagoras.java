package berna.week01;

public class printCirclePythagoras {
    public static void main(String[] args) {
        printCirclePythagoras(10);
    }

    public static void printCirclePythagoras(double radius) {
        System.out.println("B1.exercise: use Pythagoras to draw a filled circle ");


        for (double i = 0; i < 2; i = i + 0.08) {    // number of rows
            for (double j = 0; j < 6; j = j + 0.09) { // number of columns

                float b = (float) ((Math.sqrt(radius) - Math.sqrt(j)) * 0.5);   //j is a! for each column use Pythagoras to calculate b (=in which row is x placed!)
                int rd = (int) b;
                //System.out.print("j is " + j + " and b is " + b + "-");
                //System.out.println();
                //for (float k = 0; k < (radius+1)*2; k=k+j) {

                    if (i > b) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }

                }System.out.println();

            }


        }
    }




