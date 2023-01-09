package Task2;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //Для набора названий города(города могут повторяться) нужно
        //1- Показать все города
        //2- Показать все города длиннее шести символов
        //3- Посчитать сколько раз встречается город, который ввел пользователь
        //4- Показать все города которые встречаются на заданную букву

        //ТЕРМИНАЛЬНЫЕ ОПЕРАТОРЫ ДОЛЖНЫ ЗАКАНЧИВАТЬ ПОТОК.
        // НАПРИМЕР -
        // .collect(Collectors.toList());
        // .count();
        //.forEach(); и тд

        List<String> cities = new ArrayList<>(List.of(
                    "Челябинск",
                    "Москва",
                    "Нижний Новгород",
                    "Казань",
                    "Калининград",
                    "Нижний Новгород",
                    "Саратов"
        ));
    /*    List<String>uniqueCities = cities.stream()
                        .sorted()       //сортировка по букве алфавита
                        .distinct()     //уникальные строки
                        .collect(Collectors.toList());   //преобразует поток в коллекцию
                       // .collect(Collectors.toSet());  //преобразует поток в коллекцию set
        System.out.println("Все города :");
        System.out.println(uniqueCities);
*/
        //int [] arr = {1,2,4,8}
      //  Arrays.stream(arr).     так можно передать массив в стрим
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города ");
        String target = scanner.nextLine();

 //2- Показать все города длиннее шести символов
        List<String> longNameCities = cities
                .stream()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
        System.out.println("Города,название которых больше 6 символов");
        System.out.println(longNameCities);

  //3- Посчитать сколько раз встречается город, который ввел пользователь
        long citiesEqualToTarget = cities
                .stream()                 //открывает поток
                .filter(city -> city.toLowerCase(Locale.ROOT).equals(target.toLowerCase()))
                .count();    //количество элементов внутри потока,которые остались после фильтрации
        System.out.printf("Город %s встречается %d раз\n",target,citiesEqualToTarget);

 //4- Показать все города которые встречаются на заданную букву

        System.out.println("Введите префикс ");
        String prefix = scanner.nextLine();

   List<String> citiesByPrefix = cities
           .stream()
           .filter(city -> city.toLowerCase().startsWith(prefix.toLowerCase()))  //startsWith - проверка начала строки
           .distinct()        //уникальные строки, убирает повторы
           .collect(Collectors.toList());
        System.out.printf("Города,начинающиеся на '%s':\n%s\n ",prefix,citiesByPrefix);


    }
}
