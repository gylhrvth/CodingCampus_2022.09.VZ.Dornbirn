package berna.week08.ZooExample;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {
    public String nameKeeper;
    public List<String> skillsOfKeeper;
    public String favoriteAnimalSort;

    public ZooKeeper(String nameKeeper, String favoriteAnimalSort, String... skills) {
        this.nameKeeper = nameKeeper;
        this.favoriteAnimalSort = favoriteAnimalSort;
        skillsOfKeeper = new ArrayList<>();
        skillsOfKeeper.addAll(List.of(skills));
    }

    public String printDataOfKeeper() {
        StringBuilder text = new StringBuilder("    Zookeeper: " + nameKeeper + "\n");
        text.append("       skills: ");
        if (!skillsOfKeeper.isEmpty()) {
            text.append(skillsOfKeeper);
            text.append("\n");
        } else {
            text.append("       no skills known \n");
        }
        text.append("       Favorite animal sort: " + favoriteAnimalSort + "\n");
        return text.toString();
    }
}
