
public class Main {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        StackLL s = new StackLL();
        System.out.println("############## QUEUE ############# ");
        queue(q);
        System.out.println("\n\n############## STACK #############");
        stack(s);
    }

    static void queue(QueueLL q){
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
    static void stack(StackLL s){
        System.out.println("push elements: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(i + " ");
            s.push(i);
        }
        System.out.println("\ntop element: " + s.topEl());
        System.out.println("pop elements: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(s.pop() + " ");
        }
    }
}
