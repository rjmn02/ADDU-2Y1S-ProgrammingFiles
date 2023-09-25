import java.util.Random;
public class IntSkipList {
    private int maxLevel;
    private IntSkipListNode[] root;
    private int[] powers;
    private Random rd = new Random();
    IntSkipList() {
        this(4);
    }
    IntSkipList (int i) {
        maxLevel = i;
        root = new IntSkipListNode[maxLevel];
        powers = new int[maxLevel];
        for (int j = 0; j < maxLevel; j++)
            root[j] = null;
        choosePowers();
    }

    public boolean isEmpty(){
        return root[0] == null;
    }

    public void choosePowers(){
        powers[maxLevel-1] = (2 << (maxLevel-1)) - 1;
        for(int i = maxLevel -2, j = 0; i >= 0; i++, j++) {
            powers[i] = powers[i+1] - (2 << j);
        }
    }
    
}