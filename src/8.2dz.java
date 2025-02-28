import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество элементов в массиве:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] array = new int [k];
        System.out.println("Введите элементы массива:");
        for (int i = 0;i <k;i++){
            System.out.print("Элемент" + (i+1) + ":");
            array[i] = sc.nextInt();
        }
        int middle = (array.length+1)/2;
        System.out.print(middle);
        sc.close();

    }

}
