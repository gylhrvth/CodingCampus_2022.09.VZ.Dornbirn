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
        head("#","Print Rhombus");
        printRhombus("x",10);
    }
    public static int diff(int from, int to) {
        return to - from;}

    public static void filler(String symbol, int fueLae) {
        //fueLae Abk. für Füller Länge
        for (int ih = fueLae; ih > 0; ih = ih - 1) {
            System.out.print(symbol);}
        System.out.println();}

    public static void head(String symbol, String aufgTit) {
        int head = aufgTit.length() + 4;
        filler(symbol, head);
        //Alternativ
        //System.out.println("#".repeat(4 + aufgTit.length()));
        System.out.println(symbol + " " + aufgTit + " " + symbol);
        filler(symbol, head);
        System.out.println();}

    public static void printChars(String symbol, int length) {
        while (length > 0) {
            System.out.print(symbol);
            length = length - 1;}
        System.out.println();}

    public static void printSquare(String symbol, int length) {
        for (int bll = length; bll > 0; bll = bll - 1) {
            printChars(symbol, length);}
        System.out.println();}

    public static void printRect(String symbol, int width, int length) {
        for (int bll = length; bll > 0; bll = bll - 1) {
            printChars(symbol, width);}
        System.out.println();}

    public static void printTriangleBottomLeft(String symbol, int length) {
        for (int tbl = 0; tbl <= length; ++tbl) {
            printChars(symbol, tbl);}
        System.out.println();}

    public static void printTriangleTopLeft(String symbol, int length) {
        for (int ttl = length; ttl > 0; ttl = ttl - 1) {
            printChars(symbol, ttl);}
        System.out.println();}

    public static void printTriangleTopRight(String symbol, int length) {
        for (int ttr = length; ttr > 0; ttr = ttr - 1) {
            for (int trld = diff(ttr, length); trld > 0; trld--) {
                System.out.print(" ");}
            printChars(symbol, ttr);}
        System.out.println();}

    public static void printTriangleBottomRight(String symbol, int length) {
        for (int tbr = 0; tbr <= length; ++tbr) {
            for (int trld = diff(tbr, length); trld > 0; trld--) {
                //Needs work, first line is wrong
                //if (trld != length){
                System.out.print(" ");}
            printChars(symbol, tbr);}
        System.out.println();}

    public static void printEmptySquare(String symbol, int length) {
        filler(symbol, length);
        for (int width = length; width > 2; width--) {
            System.out.print(symbol);
            for (int pes = length - 2; pes > 0; pes--) {
                System.out.print(" ");}
            System.out.println(symbol);}
        filler(symbol, length);
        System.out.println();}

    public static void printSlash(String symbol, int length, boolean frontslash) {
        if (frontslash) {
            for (int sllf = length; sllf > 0; sllf = sllf - 1) {
                for (int sllfp = diff(length, sllf); sllfp < 0; sllfp++) {
                    System.out.print(" ");}
                System.out.println(symbol);}
        } else
            for (int sllb = 1; sllb <= length; ++sllb) {
                for (int sllbp = diff(length, sllb); sllbp < 0; sllbp++) {
                    System.out.print(" ");}
                System.out.println(symbol);}
        System.out.println();}
    public static void printTriangle(String symbol, int length) {
        int trih = (length-1)/2;
        for (int tritip = length-1; tritip > 0; tritip--) {
            System.out.print(" ");}
        System.out.println(symbol);
        if (length>1){
        for (int tri = length-1; tri > 1 ; tri--) {
            for (int trie = tri-1; trie > 0; trie--) {
                System.out.print(" ");}
            System.out.print(symbol);
            for (int trif = (length-tri-1)*2; trif >= 0; trif--) {
                System.out.print(" ");}
            System.out.println(symbol);}
            filler(symbol,length+2*trih);}
        System.out.println();}
    public static void printRhombus (String symbol, int length) {
        for (int rhomtip = (length-1)/2; rhomtip > 0; rhomtip--) {
            System.out.print("-");}
        if (length%2==0){System.out.print("x");}
        System.out.println(symbol);
        for (int rhomfall = (length-3)/2; rhomfall >= 0; rhomfall--) {
            for (int rhomfpos = rhomfall; rhomfpos > 0; rhomfpos--) {
                    System.out.print("-");}
            System.out.print("x");
            for (int rhomffil = ((length/2)-1-rhomfall)*2; rhomffil > 0; rhomffil--) {
                System.out.print("-");}
            System.out.println("x");}
        for (int rhomrise = length/2; rhomrise > 0; rhomrise--) {
            for (int rhomrpos = rhomrise; rhomrpos > 0; rhomrpos--) {
                System.out.print("-");}
            System.out.print("x");
            for (int rhomrfil = ((length/2)-1-rhomrise)*2; rhomrfil > 0; rhomrfil--) {
                System.out.print("-");}
            System.out.println("x");}
    }
}