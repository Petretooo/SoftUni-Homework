package ClassesAndObjects;
import com.sun.jdi.IntegerValue;

import java.util.Scanner;
import java.util.regex.Matcher;

public class randomArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberPentagons = Integer.parseInt(in.nextLine());
        int numberSides = Integer.parseInt(in.nextLine());

        int[] pentagons = new int[numberPentagons]; // Масив от три елемента, който да пълни пентагоните
        int[] arr = new int[numberSides]; // Създаваме масив от тип интиджър с дължина на масива пет елемента

        for (int i = 0; i < pentagons.length; i++) { // цикъл за запълняне стойностите на пентагоните
            int sum = 0; // сума, която ще е равна на периметъра на всеки пентагон
        for (int j = 0; j < arr.length; j++) { // Създаваме цикъл FOR, който ще се върти по дължината на масива, от 0 до дулжината на мсива (arr.length), която е 5 елемента

            while (true) { // създавам безкраен цикъл WHILE, за да може да ме кара да въвеждам наново числото, ако го сгреша с нула или напиша отрицателно.
                int number = in.nextInt(); // въвеждам целочислено число от клавиатурата
                if (number > 0) { // if конструкция, която проверява - ако числото е по-голямо от 0, то да влезе в блока
                    arr[j] = number; // числото е било проверено и вече е в блока на IF-а, тоест това число е вярно и казваме елемнта i на масива да е равен на това число
                    sum+=number;
                    break;// прекъсваме цикъл WHILE, ако не прекъснем, никога няма да излезем от него. Трябва да излезем тогава, когато числото е вярно, след което ще достъпим следващия елемент на масива
                } else {// всички други случай, тоест отрицателни числа и нула
                    System.out.println("Invalid number"); // Ако числото е невалидно да извежда това съобщение (Invalid number)
                    // До тук е задачата, долните ифове са за украса :P:D
                    if (number == 0) { // прваим проверка, ако числото е нула, влиза в този блок
                        System.out.println("The number is 0, plese enter positive number"); // извежда следното съобщения ако е нула, за да покаже на потребителя какво е въвел и защо е невалидно
                    } else { // отрицателни числа
                        System.out.println("The number is negative, you should enter positive number"); // извежда следното съобщение ако е отрицателно и покава на потребителя какво трябва да въведе
                    }
                }
            }
        }
        System.out.println(); // нов ред след всеки пентагон
        pentagons[i] = sum; // запълвам масива със периметрите на пентагоните
        }
        //System.out.println(Math.max(Math.max(pentagons[0], pentagons[1]), pentagons[2]));
        int count = 0; // променлива, която да намира номера на най-големия пентагон
        int max = -99999999; // за да намеря най-големия пентагон, го сравнявам с тази променлива
        for (int i = 0; i < pentagons.length; i++) { // цикъл, който да обхожда всеки елемент на масива
            if(max < pentagons[i]){ // проверка дали е пентагона е по-голям от променливата
                count = i; // променливата присвоява номера на пентагона
                max = pentagons[i]; // променливата МАХ
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
