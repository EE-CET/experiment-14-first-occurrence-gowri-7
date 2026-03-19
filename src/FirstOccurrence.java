
import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int position = -1;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == k && position == -1) {
                position = i + 1;
            }
        }

        System.out.println(position);
    }
}
