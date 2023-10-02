import java.util.Scanner;

public class UseDLList {
    public static void main(String[] args) {
        IntDLList list = new IntDLList();
        Scanner console = new Scanner(System.in);

        while(true){
            int input = Integer.parseInt(console.nextLine());
            if(input == 0){
                break;
            }else if(input % 2 == 0){
                list.addToTail(input);
            }else{
                list.addtohead(input);
            }
        }
        list.display();
    }
}
