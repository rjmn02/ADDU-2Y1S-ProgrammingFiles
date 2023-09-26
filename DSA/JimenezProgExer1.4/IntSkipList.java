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
        powers[maxLevel-1] = (2 << (maxLevel-1)) - 1;   //2^maxlevel - 1
        for(int i = maxLevel -2, j = 0; i >= 0; i--, j++) {
            powers[i] = powers[i+1] - (2 << j);         //2^(j+1)
        }
    }

    public int chooseLevels(){
        int i;
        int r = Math.abs(rd.nextInt()) % powers[maxLevel - 1] + 1;
        for(i = 1; i < maxLevel; i++){
            if(r < powers[i]){
                return i - 1;
            }
        }
        return i - 1;
    }

    public int skipListSearch(int key){
        int lvl;
        int counter = 0;
        IntSkipListNode prev, curr;
        for(lvl = maxLevel - 1; lvl >= 0 && root[lvl] == null; lvl--);
        prev = curr = root[lvl];
        while(true) {
            counter++;
            if(key == curr.key){
                return counter;
            }else if(key < curr.key){
                if(lvl == 0){
                    return 0;
                }else if(curr == root[lvl]){
                    curr = root[--lvl];
                }else {
                    curr = prev.next[--lvl];
                }
            }else{
                prev = curr;
                if(curr.next[lvl] != null){
                    curr = curr.next[lvl];
                }else{
                    for(lvl--;lvl >= 0 && curr.next[lvl] == null; lvl--);
                    if(lvl >= 0){
                        curr = curr.next[lvl];
                    }else {
                        return 0;
                    }
                }
            }
        }

    }

    public void skipListInsert(int key){
        IntSkipListNode[] curr = new IntSkipListNode[maxLevel];
        IntSkipListNode[] prev = new IntSkipListNode[maxLevel];
        IntSkipListNode newNode;

        int lvl, i;
        curr[maxLevel-1] = root[maxLevel-1];
        prev[maxLevel-1] = null;
        for(lvl = maxLevel - 1; lvl >= 0; lvl--){
            while (curr[lvl] != null && curr[lvl].key < key) { // go to the next
                prev[lvl] = curr[lvl]; // if smaller;
                curr[lvl] = curr[lvl].next[lvl];
            }
            if (curr[lvl] != null && curr[lvl].key == key) // don't include
                return; // duplicates;
            if (lvl > 0) // go one level down
                if (prev[lvl] == null) { // if not the lowest
                    curr[lvl-1] = root[lvl-1]; // level, using a link
                    prev[lvl-1] = null; // either from the root
                }
                else { // or from the predecessor;
                    curr[lvl-1] = prev[lvl].next[lvl-1];
                    prev[lvl-1] = prev[lvl];
                }
        }
        lvl = chooseLevels();

        newNode = new IntSkipListNode(key, lvl + 1);
        for(i = 0;i <= lvl; i++){
            newNode.next[i] = curr[i];
            if(prev[i] == null){
                root[i] = newNode;
            }
            else{
                prev[i].next[i] = newNode;
            }
        }

    }


    
}