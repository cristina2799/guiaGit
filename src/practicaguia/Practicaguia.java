package practicaguia;

import java.util.Scanner;
import static practicaguia.suma.suma;

public class Practicaguia {

    public static void main(String[] args) throws Exception {

        System.out.println("Ejercicios: \n 1. Suma de potencias. \n 2. Suma Vectorial. ");
        Scanner sc = new Scanner(System.in);
        int ejercicio = sc.nextInt();
        float[] sumas = new float[10];

        if (ejercicio == 1) {
            System.out.println("SUMA POTENCIAL");
            entrada entrada = new entrada();
            entrada.validacion();
            procesamiento procesamiento = new procesamiento(sumas);
            procesamiento.proceso();
        } else {

            if (ejercicio == 1) {
                System.out.println("SUMA VECTORIAL");
                int n;
                System.out.println("Ingresar el valor de n");
                n = sc.nextInt();
                int[] vec1 = new int[n];
                int[] vec2 = new int[n];

                for (int i = 0; i < n; i++) {
                    vec1[i] = (int) (Math.random() * 1001);
                    vec2[i] = (int) (Math.random() * 1001);

                }
                for (int i = 0; i < n; i++) {
                    System.out.print(vec1[i] + "\t");
                    System.out.println();
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(vec2[i] + "\t");
                }
                System.out.print("\t" + suma(vec1, vec2, n - 1));
            }
        }

    }

}
