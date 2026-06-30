import java.util.Scanner;
public class PairSum {

    public static int[] pairsum(int[] a, int t) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    return new int[]{a[i], i, a[j], j};
                }

            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of elements ");

        int num = scanner.nextInt();
        int[] a = new int[num];

        System.out.println("Input numbers of your choice");

        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Input target sum");
        int t = scanner.nextInt();


        int[] pair = PairSum.pairsum(a, t);
        if (pair == null) {
            System.out.println("Your target element: "+ t);
            System.out.println("Pair not found");
        }
        else{

            System.out.println("The first element is " + pair[0] + " at index " + pair[1]);
            System.out.println("The second element is " + pair[2] + " at index " + pair[3]);
            System.out.println( pair [0]+ " + " + pair[2]+" = "+ t);
        }
    }
}

