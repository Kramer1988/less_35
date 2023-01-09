package Task4;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
         /*�������� ����� ���������
         �� ������ ������� ���������� � �������� ������,��� �������,����,���������, �������������.
         ����� ������� � ��������� ��������� ��������
         1- �������� ��� ����������
         2- �������� �� � �������� ����������
         3- �������� ��� ���������� ������ �������������
         4- �������� ��� �� �������� ����.
         5- �������� ��� �� ������ ������� ����
         6- �������� ��� �� ��������������� �� ���� �� �����������
         7- �������� ��� �� �� ���� �� ��������
         ---������� 2---
         1- �������� ��� �� ��������������� �� ��������� �� �����������.
         2- �������� ��� �� ��������������� �� ��������� �� ��������.
          */


        //-------  1- �������� ��� ����������---------
        ArrayList<TV> tv = new ArrayList<>(List.of(
                new TV("LG", 2019, 35000, 65, "Japan"),
                new TV("Samsung", 2022, 44000, 70, "USA"),
                new TV("Sony", 2009, 9000, 55, "Japan"),
                new TV("Philips", 2016, 28000, 95, "Germany"),
                new TV("Huawei", 2020, 40500, 60, "China")
        ));
        System.out.println("��� ����������");
        tv.forEach(System.out::println);

        System.out.println();
        //------- 2- �������� �� � �������� ����������---------
        System.out.println("�������� ���������� � �������� ����������");
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ��������� :");
        int diagonal = scanner.nextInt();
        tv.stream()
                .filter(s -> s.getDiagonal() == diagonal)
                .forEach(System.out::println);

        System.out.println();
        //-------   3- �������� ��� ���������� ������ �������������---------
        System.out.println("�������� ��� ���������� ������ �������������");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("������� ������ ������������� :");
        String country = scanner1.nextLine();
        tv.stream()
                .filter(s -> s.getCountryOfManufacture().toLowerCase(Locale.ROOT).equals(country.toLowerCase()))
                .forEach(System.out::println);


        System.out.println();
        //-------   4- �������� ��� �� �������� ����---------
        System.out.println("�������� ��� �� �������� ����");
        System.out.println("������� ��� :");
        int year = scanner.nextInt();
        tv.stream()
                .filter(s -> s.getYear() == year)
                .forEach(System.out::println);


        System.out.println();
        //-------  5- �������� ��� �� ������ ������� ����---------
        System.out.println("�������� ��� �� ������ ������� ����");
        System.out.println("������� ���� :");
        int price = scanner.nextInt();
        tv.stream()
                .filter(s -> s.getPrice() > price)
                .forEach(System.out::println);


        System.out.println();
        //-------  6- �������� ��� �� ��������������� �� ���� �� �����������---------
        System.out.println("�������� ��� �� ��������������� �� ���� �� �����������");
        tv.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println();
        //-------  7- �������� ��� �� ��������������� �� ���� �� ��������---------
        System.out.println("�������� ��� �� ��������������� �� ���� �� ��������");
        tv.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);


        //            ---������� 2---
        //            1- �������� ��� �� ��������������� �� ��������� �� �����������.
        System.out.println();
        System.out.println("�������� ��� �� ��������������� �� ��������� �� �����������");
        tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .forEach(System.out::println);


        //           ---������� 2---
        //            2- �������� ��� �� ��������������� �� ��������� �� ��������.
        System.out.println();
        System.out.println("�������� ��� �� ��������������� �� ��������� �� ��������");
        tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .forEach(System.out::println);
    }

}

