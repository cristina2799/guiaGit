package practicaguia;

import java.util.Scanner;

public class suma {

    static Scanner sc = new Scanner(System.in);

    static int suma(int[] vec1, int[] vec2, int n) {
        if (n == 0) {
            return vec1[n] + vec2[n];
        } else {
            return vec1[n] + vec2[n] + suma(vec1, vec2, n - 1);
        }
    }
}
