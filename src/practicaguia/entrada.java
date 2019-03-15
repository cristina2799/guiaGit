package practicaguia;

import java.util.Scanner;

public class entrada {

    Scanner sc = new Scanner(System.in);
    float num1;
    int num2;
    int A = 1;
    float resultado = 1;
    float[] sumas;

    public void validacion() throws Exception {

        for (int C = 1; C <= 10; C++) {

            System.out.println("introduzca la base en numero decimal" + "\t" + C);
            num1 = sc.nextFloat();
            System.out.println("introduzca el exponente en numero entero" + "\t" + C);
            num2 = sc.nextInt();

            try {
                if (num1 == 0 && num2 == 0) {
                    sumas[C] = A;
                    System.out.println(sumas[C]);
                }
                if (num1 == 0 && num2 <= 0) {
                    System.out.println("si la base es 0 su exponente puede que ser cualqquier numero natural");
                }
                if (num1 == 0 && num2 >= 0) {
                    sumas[C] = 0;
                    System.out.println(sumas[C]);

                }
                if (num1 != 0 && num2 == 0) {
                    sumas[C] = A;
                    System.out.println(sumas[C]);
                }
                if (num1 != 0 && num2 != 0) {

                    for (int cont = 1; cont <= num2; cont++) {
                        resultado = resultado * num1;
                    }

                    System.out.println("Resultado: " + resultado);
                    float resul = (float) (Math.round(resultado * 100) / 100.0);
                    resultado = 1;
                    System.out.println("Redondeado a dos digitos es:" + resul);
                    sumas[C] = resul;
                    System.out.println(sumas[C]);
                }
            } catch (NumberFormatException e) {
                System.out.println("no valido");
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

}
