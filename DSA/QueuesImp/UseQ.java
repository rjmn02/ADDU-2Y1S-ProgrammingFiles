
public class UseQ {
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        System.out.println("enqueue: ");
        for(int i = 0; i < 7; i++){
            System.out.print(q.enqueue(i) + " ");
        }
        System.out.println("\nfirstEl: " + q.firstEl());
        System.out.println("dequeue: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(q.dequeue() + " ");
            
        }
    }
}
