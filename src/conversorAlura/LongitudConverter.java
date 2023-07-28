package conversorAlura;

import javax.swing.*;
/**
 * Clase que representa un convertidor de longitud.
 */
public class LongitudConverter {
    /**
     * Realiza la conversión de una cantidad de longitud a diferentes unidades.
     *
     * @param cantidad3 La cantidad de longitud a convertir.
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
     * Muestra el resultado de la conversión de longitud en un cuadro de diálogo.
     *
     * @param cantidad                La cantidad original de longitud ingresada por el usuario.
     * @param longitudSeleccionada    La opción seleccionada por el usuario para la conversión.
     * @param conversion              El valor convertido de la longitud.
     * @param longitud                La longitud seleccionada
     */
    private void mostrarResultado(double cantidad, String longitudSeleccionada, double conversion, String longitud) {
        String mensajeResultado = String.format("%.2f %s son: %.2f %s", cantidad, longitudSeleccionada, conversion, longitud);
        JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
