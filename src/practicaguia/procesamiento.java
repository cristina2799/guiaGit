package practicaguia;

public class procesamiento extends entrada {

    procesamiento(float[] sumas) {
        this.sumas = sumas;
    }

    public void proceso() {
        float total = 0;
        for (int contador = 0; contador <= sumas.length; contador++) {
            total = total + sumas[contador];

            System.out.println("EL RESULTADO DE LA SUMA DE LAS POTENCIAS ES: " + total);
        }
    }

}
