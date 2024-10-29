import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // Создаем массив строк для символов ASCII
        String[] asciiChars = new String[95];
        // Заполняем массив символами ASCII
        for (int i = 33; i < 128; i++) {
            asciiChars[i-33] = String.valueOf((char) i);
        }
        // Выводим массив символов ASCII
        Scanner length = new Scanner(System.in);
        int password_length;
        System.out.println("Введите длину пароля от 8 до 12: ");
        for (;;) {
            password_length = length.nextInt();
        if(password_length<=12&&password_length>=8)break;
            System.out.println("Введите корректный пароль: ");}
        String[] password = new String[password_length];
        int[] asciiIndex = new int[password_length];
        int j,accuracy=0;
        for(;;){
            accuracy=0;
            // Создаём пароль
        for (int i = 0; i < password_length; i++) {
            j = new Random().nextInt(95);
            password[i]= asciiChars[j];
            asciiIndex[i]=j;
        }
            // Проверяем пароль
            accuracy = task_3.chekcing(asciiIndex,password_length,accuracy,15,24);
            accuracy = task_3.chekcing(asciiIndex,password_length,accuracy,32,57);
            accuracy = task_3.chekcing(asciiIndex,password_length,accuracy,64,89);
            for (int i = 0; i < password_length; i++) {
                if(asciiIndex[i]>=0&&asciiIndex[i]<=14||asciiIndex[i]>=25&&asciiIndex[i]<=31||asciiIndex[i]>=58&&asciiIndex[i]<=63||asciiIndex[i]>=90&&asciiIndex[i]<=94){
                    accuracy++;
                    break;}}
            if(accuracy==4)
                break;
        }
        System.out.print("Вот ваш пароль: ");
        for (int i = 0; i < password_length; i++) {
            System.out.print(password[i]);
        }
            System.out.print("\n");}
    }