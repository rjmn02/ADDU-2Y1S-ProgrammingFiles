import java.util.Comparator;

public class CompareSoftware implements Comparator<Software> {
    
    @Override
    public int compare(Software a, Software b) {
        if(!(a.getName().equalsIgnoreCase(b.getName()))){
            return a.getName().compareTo(b.getName());
        }else {
            return a.getVersion().compareTo(b.getVersion());
        }
    }
}
