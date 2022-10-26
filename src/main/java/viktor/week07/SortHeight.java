package viktor.week07;
import java.util.Comparator;

public class SortHeight implements Comparator<PersonTwoPointNull>{
    @Override
    public int compare(PersonTwoPointNull a, PersonTwoPointNull b){
        return a.getHeight() - b.getHeight();
    }
}
