import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        char[] table = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        displayTable(table);
        for (int i = 0; i < 9; i++) {
            System.out.print("position: ");
            int position;
            while(true){
                position=scanner.nextInt();
            }




            if(i%2==0){
            table[position-1]='x';
            }
            else {
                table[position-1]='O';
            }
            displayTable(table);
        }
    }
    static void displayTable(char[] table){
        for (int i = 0; i < 9; i++) {
            System.out.print(table[i]);
            System.out.print("|");
            if((i+1)%3==0) {
                System.out.println();
                System.out.print("-----");
                System.out.println();
            }
        }
    }
}