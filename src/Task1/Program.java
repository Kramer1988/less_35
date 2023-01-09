package Task1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        //Для набора случайно сгенерированных чисел нужно
        //Количество четных
        //Количество не четных
        //Количество равных 0
        //Количество равных значений введенных пользователю

        Random random = new Random();       //генерация случайных чисел
       List<Integer> numbers = IntStream.generate(() -> random.nextInt(101))
               .limit(30)   //IntStream - примитивный поток целых чисел
               .boxed()        //из IntStream в Stream<Integer>. Поток объектов Интегер.Это упаковка
               .toList(); // или так - collect(Collectors.toList())  Переводит данные в коллекцию

        System.out.println("Случайные числа");
        System.out.println(numbers);
        //numbers.forEach(num->System.out.print(num+" "));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100");
        int target = scanner.nextInt();
//numbers.forEach(System.out::println);
        long evenCount = numbers.stream()
               // .mapToInt() преобразование данных в инт
                .filter(n -> n%2 == 0)
                .count();  //терминальный оператор, который возвращает количество элементов

//количество нечетных

    long oddCount = numbers.stream()
            .filter(n -> n%2 != 0)         //n -> (n & 1) !=0 - можно так записать проверку
            .count();
//Количество равных 0
    long zeroesCount = numbers.stream()
            .filter(n -> n%2 == 0)
            .count();
//Количество равных значений введенных пользователю
    long targetCount = numbers.stream()
            .filter(n ->  n == target)
            .count();

        System.out.printf("Количество четных: %d\n Количество нечетных : %d\n," +
                evenCount,oddCount);
        System.out.printf("Количество нулей: %d\n Количество чисел,равных пользовательскому значению : %d\n," +
                zeroesCount,targetCount);

    }

}
