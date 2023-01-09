package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
/*������� ����� ����������. �� ������ �������
���������� � �������� ����������, ��� �������, ����
����,����� ���������. ����� ������� ����� �����������
� ��������� ��������� ��������
1- �������� ��� ����������
2- �������� ��� ���������� ��������� �����
3- �������� ��� ���������� ��������� ������
4- �������� ��� ���������� ������ �������� ����
5- �������� ��� ���������� ��� ��� ������� ��������� � ��������� ���������
 */


        List<Car> auto = new ArrayList<>(List.of(
                new Car("Mazda",2007,2000,"red",1.8),
                new Car("Kia",2008,2100,"white",2.0),
                new Car("Opel",2012,3000,"black",1.6),
                new Car("Toyota",2009,3000,"orange",5.7)
        ));
        Scanner s = new Scanner(System.in);
        System.out.println("��� ����������");
        auto.forEach(System.out::println);

        System.out.println("������� ����");
        String color = s.nextLine();
        System.out.println("��� ���������� � ������ " + color + ":");
        auto.stream()             //����� �������� ������ car
                .filter(car -> car.getColor().equals(color))
                .forEach(System.out::println);

        System.out.println("������� �����");
        double volume = s.nextDouble();
        System.out.println("��� ���������� � ������� "+volume+ ":");
        auto.stream()
                .filter(car -> car.getEngineVolume()==volume)
                .forEach(System.out::println);

        System.out.println("������� ����");
        int price = s.nextInt();
        System.out.println("��� ���������� � ����� ������ " +price+ ":");
        auto.stream()
                .filter(car -> car.getPrice() > price)
                .forEach(System.out::println);


        System.out.println("������� 2 ���� - ��������� � ��������");
        int yearStart = s.nextInt();
        int yearEnd = s.nextInt();
        System.out.printf("��� ���� � ����� ������� � ��������� (%d,%d)\n",yearStart,yearEnd);
        auto.stream()
                .filter(car -> car.getYear() >= yearStart && car.getYear() <=yearEnd)
                .forEach(System.out::println);


    }
   //     Integer a = 5;
 //       foo(a);
 //       System.out.println(a);



//    private static void foo(Integer a){  ���� �������� Integer a, � ����� ������� �++, � ����� ����� 6
 //       a++;                             � ���� �������� (int a) �� � ����� �++ ��� � ���� 5
//    }


}
