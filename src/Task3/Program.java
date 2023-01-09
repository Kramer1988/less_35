package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
/*Создать класс автомобиля. Он должен хранить
информацию о названии автомобиля, год выпуска, цена
цвет,объем двигателя. Нужно создать набор автомобилей
и выполнить следующие операции
1- Показать все автомобили
2- Показать все автомобили заданного цвета
3- Показать все автомобили заданного объема
4- Показать все автомобили дороже заданной цены
5- Показать все автомобили чей год выпуска находится в указанном диапазоне
 */


        List<Car> auto = new ArrayList<>(List.of(
                new Car("Mazda",2007,2000,"red",1.8),
                new Car("Kia",2008,2100,"white",2.0),
                new Car("Opel",2012,3000,"black",1.6),
                new Car("Toyota",2009,3000,"orange",5.7)
        ));
        Scanner s = new Scanner(System.in);
        System.out.println("Все автомобили");
        auto.forEach(System.out::println);

        System.out.println("Введите цвет");
        String color = s.nextLine();
        System.out.println("Все автомобили с цветом " + color + ":");
        auto.stream()             //поток объектов класса car
                .filter(car -> car.getColor().equals(color))
                .forEach(System.out::println);

        System.out.println("Введите объем");
        double volume = s.nextDouble();
        System.out.println("Все автомобили с объемом "+volume+ ":");
        auto.stream()
                .filter(car -> car.getEngineVolume()==volume)
                .forEach(System.out::println);

        System.out.println("Введите цену");
        int price = s.nextInt();
        System.out.println("Все автомобили с ценой больше " +price+ ":");
        auto.stream()
                .filter(car -> car.getPrice() > price)
                .forEach(System.out::println);


        System.out.println("Введите 2 года - начальный и конечный");
        int yearStart = s.nextInt();
        int yearEnd = s.nextInt();
        System.out.printf("Все авто с годом выпуска в диапозоне (%d,%d)\n",yearStart,yearEnd);
        auto.stream()
                .filter(car -> car.getYear() >= yearStart && car.getYear() <=yearEnd)
                .forEach(System.out::println);


    }
   //     Integer a = 5;
 //       foo(a);
 //       System.out.println(a);



//    private static void foo(Integer a){  если передать Integer a, а потом сделать а++, в итоге будет 6
 //       a++;                             а если передать (int a) то в итоге а++ так и даст 5
//    }


}
