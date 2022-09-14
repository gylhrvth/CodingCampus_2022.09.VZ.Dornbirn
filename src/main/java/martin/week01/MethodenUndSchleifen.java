package martin.week01;

public class MethodenUndSchleifen {
    public static void main(String[] args) {
        head("#", "Print Characters");
        printChars("x", 8);
        System.out.println();
        head("#", "Print Square");
        printSquare("x", 6);
        head("#", "Print Rectangle");
        printRect("x", 10, 3);
        head("#", "Print Triangle (1)");
        printTriangleBottomLeft("x", 4);
        head("#", "Print Triangle (2)");
        printTriangleTopLeft("x", 5);
        head("#", "Print Triangle (3)");
        printTriangleTopRight("x", 5);
        head("#", "Print Triangle (4)");
        printTriangleBottomRight("x", 5);
        head("#", "Print Empty Square");
        printEmptySquare("x", 10);
        printEmptySquare("A", 3);
        head("#", "Print Slash");
        printSlash("x", 3, true);
        printSlash("y",4,false);
        head("#","Print Triangle");
        printTriangle("x",3);
        printTriangle("x",5);
        printTriangle("x",1);
        head("#","Print Rhombus1");
        printRhombus1("x",7);
        head("#","Print Rhombus2");
        printRhombus2("x",7);
        head("#","Print X");
        printX("x",7);
        head("#","Print Christmastree");
        printChristmasTree(9);
        head("*","Print circle Pythagoras");

    }

    public static void filler(String symbol, int fueLae) {
        //fueLae Abk. für Füller Länge
        for (int ih = fueLae; ih > 0; ih--) {System.out.print(symbol);}}

    public static void head(String symbol, String aufgTit) {
        int head = aufgTit.length() + 4;
        filler(symbol, head); System.out.println();
        //Alternativ; System.out.println("#".repeat(4 + aufgTit.length()));
        System.out.println(symbol + " " + aufgTit + " " + symbol);
        filler(symbol, head); System.out.println("\n");}

    public static void printChars(String symbol, int length) {
        filler(symbol, length); System.out.println();}

    public static void printSquare(String symbol, int length) {
        for (int i = length; i > 0; i--) {
            printChars(symbol, length);}
        System.out.println();}

    public static void printRect(String symbol, int width, int length) {
        for (int bll = length; bll > 0; bll--) {
            printChars(symbol, width);}
        System.out.println();}

    public static void printTriangleBottomLeft(String symbol, int length) {
        for (int tbl = 0; tbl <= length; tbl++) {
            printChars(symbol, tbl);}
        System.out.println();}

    public static void printTriangleTopLeft(String symbol, int length) {
        for (int ttl = length; ttl > 0; ttl--) {
            printChars(symbol, ttl);}
        System.out.println();}

    public static void printTriangleTopRight(String symbol, int length) {
        for (int ttr = length; ttr > 0; ttr--) {
            filler(" ",length-ttr);
            printChars(symbol, ttr);}
        System.out.println();}

    public static void printTriangleBottomRight(String symbol, int length) {
        for (int tbr = 0; tbr <= length; tbr++) {
            filler(" ",length-tbr);
            printChars(symbol, tbr);}
        System.out.println();}

    public static void printEmptySquare(String symbol, int length) {
        filler(symbol, length); System.out.println();
        for (int width = length; width > 2; width--) {
            System.out.print(symbol); filler(" ",length-2); System.out.println(symbol);}
        filler(symbol, length); System.out.println("\n");}

    public static void printSlash(String symbol, int length, boolean frontslash) {
        if (frontslash) {
            for (int sllf = length-1; sllf >= 0; sllf--) {
                filler(" ",sllf); System.out.println(symbol);}
        } else
            for (int sllb = 0; sllb <= length; sllb++) {
                filler(" ",sllb); System.out.println(symbol);}
        System.out.println();}

    public static void printTriangle(String symbol, int length) {
        filler(" ",length-1);
        System.out.println(symbol);
        if (length>1){
        for (int tri = length-1; tri > 1 ; tri--) {
            filler(" ",tri-1); System.out.print(symbol);
            filler(" ",((length-tri)*2)-1); System.out.println(symbol);}
            filler(symbol,(2*length)-1); System.out.println();}
        System.out.println();}

    public static void printRhombus1 (String symbol, int length) {
        if (length % 2 == 0) {
            filler(" ", (length-1)/2);
            System.out.print(symbol); System.out.println(symbol);
            for (int rhomfall = (length - 3) / 2; rhomfall >= 0; rhomfall--) {
                filler(" ", rhomfall); System.out.print(symbol);
                filler(" ", ((length / 2) - rhomfall) * 2 - 2); System.out.println(symbol);}
            System.out.print(symbol); filler(" ", length - 2); System.out.println(symbol);
            for (int rhomrise = 1; rhomrise < length / 2; rhomrise++) {
                filler(" ", rhomrise); System.out.print(symbol);
                filler(" ", length - rhomrise * 2 - 2); System.out.println(symbol);}}
        else {
            filler(" ", (length - 1) / 2); System.out.println(symbol);
            for (int rhomfall = (length - 3) / 2; rhomfall >= 0; rhomfall--) {
                filler(" ", rhomfall); System.out.print(symbol);
                filler(" ", ((length / 2) - rhomfall) * 2 - 1); System.out.println(symbol);}
            for (int rhomrise = 1; rhomrise < length / 2; rhomrise++) {
                filler(" ", rhomrise); System.out.print(symbol);
                filler(" ", length - rhomrise * 2 - 2); System.out.println(symbol);}
            filler(" ", (length - 1) / 2); System.out.println(symbol);}
        System.out.println();}

    public static void printRhombus2 (String symbol, int length) {
        for (int a = 0; a < length; a++) {
            for (int b = 0; b < length; b++) {
                if      (a == (length+1)/2-b-1)     {System.out.print(symbol);}
                else if (a == b-length/2)           {System.out.print(symbol);}
                else if (a == length+length/2-b-1)  {System.out.print(symbol);}
                else if (a == b+length/2)           {System.out.print(symbol);}
                else                                {System.out.print(" ");}}
            System.out.println();}
        System.out.println();}

    public static void printX (String symbol, int length) {
        for (int a = 0; a < length; a++) {
            for (int b = 0; b < length; b++) {
                if      (a == b)                    {System.out.print(symbol);}
                else if (a == length-b-1)           {System.out.print(symbol);}
                else                                {System.out.print(" ");}}
            System.out.println();}
        System.out.println();}

    public static void calcRoot (double number, double root) {
        double nth = Math.round(Math.pow(number, 1.0 / root)); int iroot = (int)nth; System.out.print(iroot);}

    public static void printChristmasTree (int length) {
        for (int i = 0; i < length-1 ; i++) {
            filler(" ",(length-1)-i);
            filler("*",2*i+1);
            System.out.println();
        }
        filler("*",(2*length)-1);
        System.out.println();
        filler("O ",(length-1)/2);
        if (length%2!=0) {
            System.out.print("O");
        }
        filler(" O",(length-1)/2);
        System.out.println();
        for (int s = 0; s < 2; s++) {
            //Variable Stammposition ausarbeiten
            filler(" ", (length/2)+2);
            filler("+", 5);
            System.out.println();
        }
        //"      +++++"
    }

    public static void printPythagoras (int length) {}
}