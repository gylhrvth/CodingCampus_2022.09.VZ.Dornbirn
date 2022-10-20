package batuhan.week06.DataClass;



public class tests {


    public static void main(String[] args) {
//        int[] arrays = {2,3,4,5,6,7,8,9,11,12};
//
//        MagicIntArray test = new MagicIntArray(arrays);
//        System.out.println(test);
//        System.out.println(test.getMinvalue());


        Identifyperson p1 = new Identifyperson("Batuhan", "Danisment");
        Identifyperson p2 = new Identifyperson("Deni", "Sambiev");
        Identifyperson p3 = new Identifyperson("Jessica", "Schloemmer");
        Identifyperson p4 = new Identifyperson("Goekrem", "Oezdemir");
        p1.setAge(24);
        p2.setAge(23);
        p3.setAge(22);
        p4.setAge(23);
        p1.setPlace("Bludenz");
        p2.setPlace("Bludenz");
        p3.setPlace("Rankweil");
        p4.setPlace("Bludenz");
        p1.setBornofplace("Bludenz");
        p2.setBornofplace("Grozny");
        p3.setBornofplace("Feldkirch");
        p4.setBornofplace("Bludenz");
        p1.setDateofbith("28.02.1998");
        p2.setDateofbith("19.04.1999");
        p3.setDateofbith("30.10.1999");
        p4.setDateofbith("19.10.1999");
        p1.setDistance(608.80);
        p2.setDistance(610.50);
        p3.setDistance(611.30);
        p4.setDistance(626.40);
        System.out.println(p3);


    }
}


