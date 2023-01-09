package Task2;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //��� ������ �������� ������(������ ����� �����������) �����
        //1- �������� ��� ������
        //2- �������� ��� ������ ������� ����� ��������
        //3- ��������� ������� ��� ����������� �����, ������� ���� ������������
        //4- �������� ��� ������ ������� ����������� �� �������� �����

        //������������ ��������� ������ ����������� �����.
        // �������� -
        // .collect(Collectors.toList());
        // .count();
        //.forEach(); � ��

        List<String> cities = new ArrayList<>(List.of(
                    "���������",
                    "������",
                    "������ ��������",
                    "������",
                    "�����������",
                    "������ ��������",
                    "�������"
        ));
    /*    List<String>uniqueCities = cities.stream()
                        .sorted()       //���������� �� ����� ��������
                        .distinct()     //���������� ������
                        .collect(Collectors.toList());   //����������� ����� � ���������
                       // .collect(Collectors.toSet());  //����������� ����� � ��������� set
        System.out.println("��� ������ :");
        System.out.println(uniqueCities);
*/
        //int [] arr = {1,2,4,8}
      //  Arrays.stream(arr).     ��� ����� �������� ������ � �����
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �������� ������ ");
        String target = scanner.nextLine();

 //2- �������� ��� ������ ������� ����� ��������
        List<String> longNameCities = cities
                .stream()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
        System.out.println("������,�������� ������� ������ 6 ��������");
        System.out.println(longNameCities);

  //3- ��������� ������� ��� ����������� �����, ������� ���� ������������
        long citiesEqualToTarget = cities
                .stream()                 //��������� �����
                .filter(city -> city.toLowerCase(Locale.ROOT).equals(target.toLowerCase()))
                .count();    //���������� ��������� ������ ������,������� �������� ����� ����������
        System.out.printf("����� %s ����������� %d ���\n",target,citiesEqualToTarget);

 //4- �������� ��� ������ ������� ����������� �� �������� �����

        System.out.println("������� ������� ");
        String prefix = scanner.nextLine();

   List<String> citiesByPrefix = cities
           .stream()
           .filter(city -> city.toLowerCase().startsWith(prefix.toLowerCase()))  //startsWith - �������� ������ ������
           .distinct()        //���������� ������, ������� �������
           .collect(Collectors.toList());
        System.out.printf("������,������������ �� '%s':\n%s\n ",prefix,citiesByPrefix);


    }
}
