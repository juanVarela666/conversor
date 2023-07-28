package conversorAlura;

import javax.swing.*;

public class LongitudConverter {
    /**
     * constructor
     * @param cantidad3
     */
    public void convertir(double cantidad3) {
        String[] opcionesLongitud = {
                "Metros a kilometros", "Metros a Centimetros", "Metros a Milimetros", "Metros a Millas",
                "Metros a Yardas", "Metros a Pies", "Kilomtros a Metros", "Centimetros a Metros", "Milimetros a Metros",
                "Millas a Metros", "Yardas a Metros", "Pies a Metros"
        };

        String longitudSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Elija la longitud a la que desea convertir:", "Longitud",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcionesLongitud, opcionesLongitud[0]);

        double conversion;
        String longitud;
        switch (longitudSeleccionada) {
            case "Metros a kilometros":
                longitud = "KM";
                conversion = cantidad3 * 0.001;
                break;
            case "Metros a Centimetros":
                longitud = "CM";
                conversion = cantidad3 * 100;
                break;
            case "Metros a Milimetros":
                longitud = "MM";
                conversion = cantidad3 * 1000;
                break;
            case "Metros a Millas":
                longitud = "MI";
                conversion = cantidad3 * 0.00062137;
                break;
            case "Metros a Yardas":
                longitud = "YD";
                conversion = cantidad3 * 1.093613;
                break;
            case "Metros a Pies":
                longitud = "FT";
                conversion = cantidad3 * 3.28084;
                break;
            case "Kilomtros a Metros":
                longitud = "M";
                conversion = cantidad3 * 1000;
                break;
            case "Centimetros a Metros":
                longitud = "M";
                conversion = cantidad3 * 0.01;
                break;
            case "Milimetros a Metros":
                longitud = "M";
                conversion = cantidad3 * 0.001;
                break;
            case "Millas a Metros":
                longitud = "M";
                conversion = cantidad3 * 1609.344;
                break;
            case "Yardas a Metros":
                longitud = "M";
                conversion = cantidad3 * 0.9144;
                break;
            case "Pies a Metros":
                longitud = "M";
                conversion = cantidad3 * 0.3048;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción de conversión inválida", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
        }
        mostrarResultado(cantidad3, longitudSeleccionada, conversion, longitud);
    }

    /**
     * constructor que recibe
     * @param cantidad2
     * @param temperaturaSeleccionada
     * @param conversion
     * @param temp
     */
    private void mostrarResultado(double cantidad2, String temperaturaSeleccionada, double conversion, String temp) {
        String mensajeResultado = String.format("%.2f %s son: %.2f %s", cantidad2, temperaturaSeleccionada, conversion, temp);
        JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
