package Task4;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
         /*Создайте класс ТЕЛЕВИЗОР
         Он должен хранить информацию о названии модели,год выпуска,цена,диагональ, производитель.
         Нужно создать И выполнить следующие действия
         1- показать все телевизоры
         2- показать тв с заданной диагональю
         3- показать все телевизоры одного производителя
         4- показать все тв текущего года.
         5- показать все тв дороже текущей цены
         6- показать все тв отсортированные по цене по возрастанию
         7- показать все тв по цене по убыванию
         ---ЗАДАНИЕ 2---
         1- показать все тв отсортированные по диагонали по возрастанию.
         2- показать все тв отсортированные по диагонали по убыванию.
          */


        //-------  1- показать все телевизоры---------
        ArrayList<TV> tv = new ArrayList<>(List.of(
                new TV("LG", 2019, 35000, 65, "Japan"),
                new TV("Samsung", 2022, 44000, 70, "USA"),
                new TV("Sony", 2009, 9000, 55, "Japan"),
                new TV("Philips", 2016, 28000, 95, "Germany"),
                new TV("Huawei", 2020, 40500, 60, "China")
        ));
        System.out.println("ВСЕ ТЕЛЕВИЗОРЫ");
        tv.forEach(System.out::println);

        System.out.println();
        //------- 2- показать тв с заданной диагональю---------
        System.out.println("Показать телевизоры с заданной диагональю");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нужную диагональ :");
        int diagonal = scanner.nextInt();
        tv.stream()
                .filter(s -> s.getDiagonal() == diagonal)
                .forEach(System.out::println);

        System.out.println();
        //-------   3- показать все телевизоры одного производителя---------
        System.out.println("Показать все телевизоры одного производителя");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите страну производителя :");
        String country = scanner1.nextLine();
        tv.stream()
                .filter(s -> s.getCountryOfManufacture().toLowerCase(Locale.ROOT).equals(country.toLowerCase()))
                .forEach(System.out::println);


        System.out.println();
        //-------   4- Показать все тв текущего года---------
        System.out.println("Показать все тв текущего года");
        System.out.println("Введите год :");
        int year = scanner.nextInt();
        tv.stream()
                .filter(s -> s.getYear() == year)
                .forEach(System.out::println);


        System.out.println();
        //-------  5- показать все тв дороже текущей цены---------
        System.out.println("Показать все тв дороже текущей цены");
        System.out.println("Введите цену :");
        int price = scanner.nextInt();
        tv.stream()
                .filter(s -> s.getPrice() > price)
                .forEach(System.out::println);


        System.out.println();
        //-------  6- показать все тв отсортированные по цене по возрастанию---------
        System.out.println("Показать все тв отсортированные по цене по возрастанию");
        tv.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println();
        //-------  7- показать все тв отсортированные по цене по убыванию---------
        System.out.println("Показать все тв отсортированные по цене по убыванию");
        tv.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);


        //            ---ЗАДАНИЕ 2---
        //            1- показать все тв отсортированные по диагонали по возрастанию.
        System.out.println();
        System.out.println("Показать все тв отсортированные по диагонали по возрастанию");
        tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .forEach(System.out::println);


        //           ---ЗАДАНИЕ 2---
        //            2- показать все тв отсортированные по диагонали по убыванию.
        System.out.println();
        System.out.println("Показать все тв отсортированные по диагонали по убыванию");
        tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .forEach(System.out::println);
    }

}

