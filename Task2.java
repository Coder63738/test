import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float[] multiplier = {1,3.2965F,0.4645F,0.0342F,4.2792F};
        float[] br = {1,0.3034F,2.1529F,29.2005F,0.2337F};
        System.out.println("Введите цифру валюты которую вы предостовляете:\n1.Белорусские рубли\n2.Доллары\n3.Юани\n4.Российские рубли\n5.Фунты стерлингов");
        Scanner currency = new Scanner(System.in);
        int num  = currency.nextInt();
        System.out.println("Введите кол-во валюты: ");
        int quantity = currency.nextInt();
            System.out.println("1.Белорусские рубли: "+br[0]*multiplier[num-1]*quantity);
            System.out.println("2.Доллары: "+br[1]*multiplier[num-1]*quantity);
            System.out.println("3.Юани: "+br[2]*multiplier[num-1]*quantity);
            System.out.println("4.Российские рубли: "+br[3]*multiplier[num-1]*quantity);
            System.out.println("5.Фунты стерлингов "+br[4]*multiplier[num-1]*quantity);
    }
}