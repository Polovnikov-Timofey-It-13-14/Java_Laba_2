import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Valid valid = new Valid();

        System.out.println("Привет, это 2 лаба по Java");
        String number;
        while (true) {
            System.out.println("Введи номер задания(1-6):");
            System.out.println("7 - Выход");
            number = scanner.nextLine();

            if (!valid.isNumber(number)) {
                System.out.println("Ошибка");
                continue;
            }

            int TaskNum = Integer.parseInt(number);
            if (TaskNum < 1 || TaskNum > 7) {
                System.out.println("Номер задания должен быть от 1 до 7");
                continue;
            }

            switch (TaskNum) {
                case 1:
                    System.out.println("Задание 1");
                    System.out.println("Люди по умолчанию в задании");
                    Human cleopatra = new Human("Клеопатра", 152);
                    Human pushkin = new Human("Пушкин", 167);
                    Human vladimir = new Human("Владимир", 189);
                    System.out.println(cleopatra);
                    System.out.println(pushkin);
                    System.out.println(vladimir);
                    break;

                case 2:
                    System.out.println("Задание 2");
                    System.out.println("Люди по умолчанию в задании");
                    Name name1 = new Name(null, "Клеопатра", null);
                    Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                    Name name3 = new Name ("Маяковский", "Владимир", null);
                    System.out.println(name1);
                    System.out.println(name2);
                    System.out.println(name3);

                    break;

                case 3:
                    System.out.println("Задание 3");
                    Name name4 = new Name(null, "Клеопатра", null);
                    Name name5 = new Name("Пушкин", "Александр", "Сергеевич");
                    Name name6 = new Name ("Маяковский", "Владимир", null);

                    HumanWithName cleopatra1 = new HumanWithName(name4, 152);
                    HumanWithName pushkin1 = new HumanWithName(name5, 167);
                    HumanWithName vladimir1 = new HumanWithName(name6, 189);

                    System.out.println(cleopatra1);
                    System.out.println(pushkin1);
                    System.out.println(vladimir1);
                    break;

                case 4:
                    System.out.println("Задание 4");
                    City A = new City("A");
                    City B = new City("B");
                    City C = new City("C");
                    City D = new City("D");
                    City E = new City("E");
                    City F = new City("F");

                    A.addWays(B, 5);
                    A.addWays(D, 6);
                    A.addWays(F, 1);

                    B.addWays(A, 5);
                    B.addWays(C, 3);

                    C.addWays(B, 3);
                    C.addWays(D, 4);

                    D.addWays(A, 6);
                    D.addWays(C, 4);
                    D.addWays(E, 2);

                    E.addWays(F, 2);

                    F.addWays(B, 1);
                    F.addWays(E, 2);

                    System.out.println(A);
                    System.out.println(B);
                    System.out.println(C);
                    System.out.println(D);
                    System.out.println(E);
                    System.out.println(F);
                    break;

                case 5:
                    System.out.println("5 Задание");
                    City number1 = new City("number1");
                    City number2 = new City("number2");
                    //City number3 = new City("number3");
                    City number4 = new City("number4");
                    //City number5 = new City("number5");
                    City number6 = new City("number6");

                    Map<City, Integer> ways3 = new HashMap<>();
                    ways3.put(number2, 3);
                    ways3.put(number4, 4);
                    City number3 = new City("number3", ways3);

                    Map<City, Integer> ways5 = new HashMap<>();
                    ways5.put(number6, 2);
                    City number5 = new City("number5", ways5);

                    System.out.println("Города 3 и 5 созданы по требованиям задания");
                    System.out.println(number1);
                    System.out.println(number2);
                    System.out.println(number3);
                    System.out.println(number4);
                    System.out.println(number5);
                    System.out.println(number6);

                    System.out.println();
                    System.out.println("Полная карта:");
                    number1.addWays(number2, 5);
                    number1.addWays(number4, 6);
                    number1.addWays(number6, 1);

                    number2.addWays(number1, 5);
                    number2.addWays(number3, 3);

                    number4.addWays(number1, 6);
                    number4.addWays(number3, 4);
                    number4.addWays(number6, 2);

                    number6.addWays(number2, 1);
                    number6.addWays(number5, 2);

                    System.out.println(number1);
                    System.out.println(number2);
                    System.out.println(number3);
                    System.out.println(number4);
                    System.out.println(number5);
                    System.out.println(number6);
                    break;

                case 6:
                    System.out.println("Задание 6");
                    Fraction num1 = new Fraction(5, 2);
                    Fraction num2 = new Fraction(2, 5);
                    Fraction num3 = new Fraction(6, 7);
                    Fraction num4 = new Fraction(1, 3);
                    Fraction num5 = new Fraction(7, 8);
                    Fraction num6 = new Fraction(3, 1);
                    Fraction num7 = new Fraction(5, 3);
                    Fraction num8 = new Fraction(3, 5);

                    System.out.println("Создано:");
                    System.out.println("1) " + num1);
                    System.out.println("2) " + num2);
                    System.out.println("3) " + num3);
                    System.out.println("4) " + num4);
                    System.out.println("5) " + num5);
                    System.out.println("6) " + num6);
                    System.out.println("7) " + num7);
                    System.out.println("8) " + num8);

                    Fraction sumRes = num1.sum(num2);
                    System.out.println(num1 + " + " + num2 + " = " + sumRes);

                    Fraction minRes = num3.minus(num4);
                    System.out.println(num3 + " - " + num4 + " = " + minRes);

                    Fraction mulRes = num5.multiply(num6);
                    System.out.println(num5 + " * " + num6 + " = " + mulRes);

                    Fraction divRes = num7.divide(num8);
                    System.out.println(num7 + " / " + num8 + " = " + divRes);

                    System.out.println("Решение примера под цифрой 4");
                    Fraction result = num1.sum(num2).divide(num3).minus(5);
                    System.out.println(result);
                    break;

                case 7:
                    System.out.println("Выход");
                    System.exit(0);
            }
        }
    }
}
