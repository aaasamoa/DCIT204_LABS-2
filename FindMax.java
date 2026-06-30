import java.util.Scanner;
public class FindMax {
    public static int findmax(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number elements ");

        int num = scanner.nextInt();
        int[] a = new int[num];

        System.out.println("Input numbers of your choice");

        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }

            int maxindex = findmax(a);

            int max = a[maxindex];

            System.out.println("The max value is: " + max + " at index: " + maxindex);
        }
    }

