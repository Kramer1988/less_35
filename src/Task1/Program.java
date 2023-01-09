package Task1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        //��� ������ �������� ��������������� ����� �����
        //���������� ������
        //���������� �� ������
        //���������� ������ 0
        //���������� ������ �������� ��������� ������������

        Random random = new Random();       //��������� ��������� �����
       List<Integer> numbers = IntStream.generate(() -> random.nextInt(101))
               .limit(30)   //IntStream - ����������� ����� ����� �����
               .boxed()        //�� IntStream � Stream<Integer>. ����� �������� �������.��� ��������
               .toList(); // ��� ��� - collect(Collectors.toList())  ��������� ������ � ���������

        System.out.println("��������� �����");
        System.out.println(numbers);
        //numbers.forEach(num->System.out.print(num+" "));
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 100");
        int target = scanner.nextInt();
//numbers.forEach(System.out::println);
        long evenCount = numbers.stream()
               // .mapToInt() �������������� ������ � ���
                .filter(n -> n%2 == 0)
                .count();  //������������ ��������, ������� ���������� ���������� ���������

//���������� ��������

    long oddCount = numbers.stream()
            .filter(n -> n%2 != 0)         //n -> (n & 1) !=0 - ����� ��� �������� ��������
            .count();
//���������� ������ 0
    long zeroesCount = numbers.stream()
            .filter(n -> n%2 == 0)
            .count();
//���������� ������ �������� ��������� ������������
    long targetCount = numbers.stream()
            .filter(n ->  n == target)
            .count();

        System.out.printf("���������� ������: %d\n ���������� �������� : %d\n," +
                evenCount,oddCount);
        System.out.printf("���������� �����: %d\n ���������� �����,������ ����������������� �������� : %d\n," +
                zeroesCount,targetCount);

    }

}
