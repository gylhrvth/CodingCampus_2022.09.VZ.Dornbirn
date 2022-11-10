package berna.week08.ZooExample;

public class Animal {
    private String nameAnimal;
    private String sortOfAnimal;

    private int health;
    private int maxHealth;
    private int biteStrength;

    public Animal(String nameAnimal, String sortOfAnimal, int maxHealth, int biteStrength) {
        this.nameAnimal = nameAnimal;
        this.sortOfAnimal = sortOfAnimal;
        this.maxHealth = maxHealth;
        this.biteStrength=biteStrength;
        this.health = maxHealth;
    }

    public String printAnimal() {
        return nameAnimal + ", " + sortOfAnimal;
    }

    public int getHealth() {
        return health;
    }

    public void gotBitten(Animal aggressor){
        if (aggressor.health > 0 && health > 0 && !this.equals(aggressor) && this.health != 0) {
            health -= aggressor.biteStrength;
            System.out.println("           >> " +aggressor.nameAnimal + " has bitten " + this.nameAnimal + "! Health of "+this.nameAnimal +" remains: " + (health>0 ? health : 0));
            if (health <= 0){
                System.out.println("            ==== \uD83D\uDC80 " + nameAnimal + " \uD83D\uDC80 R.I.P. ====");
            }
        }
    }
}


