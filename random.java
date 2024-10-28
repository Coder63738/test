import java.util.Random;

public class random {
    static String[] words = {"яблоко", "банан", "вишня", "арбуз", "апельсин", "свекла", "радуга"};
    static String word;
    static String[] wor;
    static int count=0;
    static String[] letters = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ","ь","ъ", "ы", "э", "ю", "я"};

    public static String random_word() {
        int random = new Random().nextInt(words.length);
        word = words[random];
        return word;
    }

    public static void completionWor() {
        wor = new String[word.length()];
        for (int i=0; i < word.length(); i++) {
            wor[i] = "_";
        }
    }

    public static void output() {
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void output_word() {
        for (String letter : wor) {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static int check(char letter) {
        int j=0,i=0;

        // Проверка, является ли введенный символ буквой из алфавита
        for (String l : letters) {
            if (l.charAt(0) == letter) {
                j++;
                letters[i]="_";
                break;
            }
            i++;
        }
        if (j!=1) return 2;

        j = 0;
        for  (i=0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                j++;
                count++;
                wor[i] = String.valueOf(letter); // Заполняем массив wor
            }
        }
        if(count==word.length())return 1;
        if (j == 0) return 0; // Буквы нет в слове
        return 2; // Буква есть в слове
    }
}