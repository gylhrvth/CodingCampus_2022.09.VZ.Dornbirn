package lukas.week07.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowToUseAHashMap {
    public static void main(String[] args) {
        System.out.println("---------------------------------\n---Ich bin ein Obstgeschäft!!!---\n---------------------------------");
        Fruit apple = new Fruit("Apple");
        Fruit birne = new Fruit("Birne");
        Fruit walnuss = new Fruit("Walnuss");
        Fruit melone = new Fruit("Melone");

        System.out.println("\n---In meinem Sortiment gibt es:---");
        System.out.println(apple.getName());
        System.out.println(birne.getName());
        System.out.println(walnuss.getName());
        System.out.println(melone.getName());

        System.out.println("\n---Heute gab es folgende Einkäufe:---");

        List<FruitBuy> fruitBuyList = new ArrayList<>();
        fruitBuyList.add(new FruitBuy(apple, 300));
        fruitBuyList.add(new FruitBuy(birne, 30));
        fruitBuyList.add(new FruitBuy(walnuss, 10));
        fruitBuyList.add(new FruitBuy(melone, 10));
        fruitBuyList.add(new FruitBuy(melone, 2));
        fruitBuyList.add(new FruitBuy(melone, 1));
        fruitBuyList.add(new FruitBuy(birne, 60));
        fruitBuyList.add(new FruitBuy(walnuss, 80));
        fruitBuyList.add(new FruitBuy(walnuss, 210));
        fruitBuyList.add(new FruitBuy(apple, 3));
        fruitBuyList.add(new FruitBuy(apple, 35));
        fruitBuyList.add(new FruitBuy(walnuss, 10));
        fruitBuyList.add(new FruitBuy(melone, 30));
        fruitBuyList.add(new FruitBuy(melone, 2));
        fruitBuyList.add(new FruitBuy(apple, 8));
        fruitBuyList.add(new FruitBuy(melone, 6));
        fruitBuyList.add(new FruitBuy(birne, 2));
        fruitBuyList.add(new FruitBuy(walnuss, 45));
        fruitBuyList.add(new FruitBuy(walnuss, 26));
        fruitBuyList.add(new FruitBuy(apple, 2));

        int i = 1;
        for (FruitBuy fruitBuy : fruitBuyList) {
            System.out.printf("Einkauf %2d.: %-10s %10d Stück\n", i, fruitBuy.getFruit().getName(), fruitBuy.getAmount());
            i++;
        }

        System.out.println("\n---Wieviel von jeder Frucht habe ich denn verkauft?---");
        Map<Fruit, Integer> fruitAmount = new HashMap<>();

        for (FruitBuy fruitBuy : fruitBuyList) {
            Fruit currentFruit = fruitBuy.getFruit();
            Integer menge = fruitAmount.get(currentFruit);
            //Wenn noch kein Wert für die Aktuelle Frucht hinterlegt wird, ist die Menge null
            if (menge == null) {
                menge = 0;
            }
            menge += fruitBuy.getAmount();
            fruitAmount.put(currentFruit, menge);
        }

        for (Map.Entry<Fruit, Integer> entry : fruitAmount.entrySet()) {
            System.out.printf("%-10s %10d Stück\n", entry.getKey().getName(), entry.getValue());
        }
    }
}
