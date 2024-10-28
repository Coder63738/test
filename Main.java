import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String word;
    char letter;
        Scanner scanner = new Scanner(System.in);
    int health=0,i=6,j=0;
    word = random.random_word();
    random.completionWor();
        for (;;) {
            switch (health) {
                case 0:
                    System.out.println("  0  \n /|\\\n / \\");
                break;
                case 1:
                    System.out.println("  0  \n /|\\\n / \\\n|----|");
                    break;
                case 2:
                    System.out.println("   ____\n 0|  \n /|\\\n / \\\n|----|");
                    break;
                case 3:
                    System.out.println("   ____\n 0|   |\n /|\\  |\n / \\ /|\\\n|----|");
                    break;
                case 4:
                    System.out.println("   ____\n !|   |\n /|\\  |\n / \\ /|\\\n|----|");
                    break;
                default:
                    break;
            }
            random.output_word();
            System.out.println(" ");
            random.output();
            letter = scanner.next().charAt(0);
            j = random.check(letter);
            if(j==0)
                health++;
            if(health==5)
                i=5;
            if(j==1){
                i=6;
            break;}
            j=2;
            if(health==5){
                System.out.println("Вы програли!");
                System.out.println("   ____\n X|   |\n /|\\  |\n / \\  |\n     /|\\");
                break;}
        }
        if(i==6)
            System.out.println("Вы победили!!!\n\\ 0 / \n  | \n / \\");
    }
}