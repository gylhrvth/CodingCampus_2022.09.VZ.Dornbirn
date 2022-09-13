package martin.week01;

public class MethodenUndSchleifen {
    public static void main(String[] args) {
        head("#","Print Characters");
        printChars("x",8);
        System.out.println();
        head("#","Print Square");
        printSquare("x",6);
        head("#","Print Rectangle");
        printRect("x",10,3);
        head("#","Print Triangle (1)");
        printTriangleBottomLeft("x",4);
        head("#","Print Triangle (2)");
        printTriangleTopLeft("x",5);
        head("#","Print Triangle (3)");
        printTriangleTopRight("x",5);
        head("#","Print Triangle (4)");
        printTriangleBottomRight("x",5);
    }



    public static int diff(int from, int to){
        return to - from;}
    public static void filler (String symbol, int fueLae){
        //fueLae Abk. für Füller Länge
        for (int ih = fueLae; ih> 0 ; ih=ih-1) {
            System.out.print(symbol);}
        System.out.println();}
    public static void head(String symbol, String aufgTit) {
        int head = aufgTit.length() + 4;
        filler(symbol,head);
        //Alternativ
        //System.out.println("#".repeat(4 + aufgTit.length()));
        System.out.println(symbol + " " + aufgTit + " " + symbol);
        filler(symbol,head);
        System.out.println();}
    public static void printChars(String symbol, int length){
        while (length > 0){
            System.out.print(symbol);
        length=length-1;}
        System.out.println();}
    public static void printSquare(String symbol, int length) {
        for (int bll = length; bll > 0; bll = bll - 1) {
            printChars(symbol, length);}
        System.out.println();}
    public static void printRect(String symbol, int width, int length){
        for (int bll = length; bll > 0; bll = bll - 1) {
            printChars(symbol, width);}
        System.out.println();}
    public static void printTriangleBottomLeft(String symbol, int length){
        for (int tbl = 0; tbl <= length; ++tbl) {
            printChars(symbol, tbl);}
        System.out.println();}
    public static void printTriangleTopLeft(String symbol, int length){
        for (int ttl = length; ttl > 0; ttl=ttl-1) {
            printChars(symbol, ttl);}
        System.out.println();}
    public static void printTriangleTopRight(String symbol, int length){
        for (int ttr = length; ttr > 0; ttr=ttr-1) {
            for (int trld = diff(ttr,length); trld > 0; trld=trld-1) {
                System.out.print(" ");}
            printChars(symbol, ttr);}
        System.out.println();}
    public static void printTriangleBottomRight(String symbol, int length){
        for (int tbr = 0; tbr <= length; ++tbr) {
            for (int trld = diff(tbr,length); trld > 0; trld=trld-1) {
                //Needs work, first line is wrong
                //if (trld != length){
                System.out.print(" ");}
            printChars(symbol, tbr);}
        System.out.println();}
    public static void printEmptySquare(String symbol, int length) {

    }
}
