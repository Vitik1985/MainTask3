import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MainTask3 {
    public static void main(String[] args) throws Exception {  //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        Random random = new Random(); // выводим только int числа!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        int a;
        System.out.print("Введите количество выводимых случаных чисел: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("С переходом на новую строку? Да/Нет: ");
        str2 = br.readLine();
        if (str2.equals("да")|| str2.equals("нет") || str2.equals("Да")|| str2.equals("Нет")) {
            for (int i = 0; i <= a; i++) {
                if (str2.equals("да") || str2.equals("Да")) {
                    System.out.println("Случайное число " + i + ": " + random.nextInt() + ";");
                }
                if (str2.equals("нет") || str2.equals("Нет")) {
                    System.out.print("Случайное число " + i + ": " + random.nextInt() + "; ");
                }
            }
        }
        else {
            System.out.println("С переходом на новую строку: введено неверное значение!!!");
        }
    }
}
