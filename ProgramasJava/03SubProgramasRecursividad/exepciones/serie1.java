import javax.swing.JOptionPane;

public class serie1 {
    public static double calcular() {
        return resolverSerie();
    }

    private static int solicitarN() {
        int n;
        while (true) {

            try {
                //parte que pude fallar
                n = Integer.parseInt(JOptionPane.showInputDialog("introduce el valor de n : "));
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null, "el valor de n, debe de ser positivo y mayor a 0");
                } else {
                    break;
                }


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "el valor de n, debe de sar un numero");

            }


        }
        return n;
    }


    private static double solicitarX() {
        boolean sentinel = false;
        double x = 0.0;
        while (!sentinel) {
            try {
                x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));

            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "el valor de x debe de ser un numero ");

            }
        }
        return x;
    }

    private static double resolverSerie() {
        int n = solicitarN();
        double x = solicitarX();
        int deno1 = 3;
        int denon2 = 1;
        double s = 0.0;

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, 3.0 / deno1) / denon2;
            deno1 += 3;
            denon2 +=2;
        }
        return s;

    }
}