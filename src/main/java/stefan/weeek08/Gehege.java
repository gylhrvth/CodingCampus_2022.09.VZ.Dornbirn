package stefan.weeek08;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
    private String nameGehege;
    private List<Tier> tiere = new ArrayList<>();

    public Gehege(String nameGehege) {
        this.nameGehege = nameGehege;

    }

    public String getNameGehege() {
        return nameGehege;
    }

    public void setNameGehege(String nameGehege) {
        this.nameGehege = nameGehege;
    }

    public void addTier(Tier tier) {
        tiere.add(tier);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
      // builder.append(nameGehege).append("|--\n");
        for(Tier t : tiere) {
            builder.append("|\t \t|--").append(t.getName()).append(",").append(t.getGattung()).append("\n");
        }
        return builder.toString();
    }
}

