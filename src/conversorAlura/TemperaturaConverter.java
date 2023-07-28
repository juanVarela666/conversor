package conversorAlura;

import javax.swing.*;

public class TemperaturaConverter {
    /**
     * Constructor
     * @param cantidad2
     */
    public void convertir(double cantidad2) {
        String[] opcionesTemperatura = {
                "Celsius a Fahrenheit", "Celsius a Kelvin", "Celsius a Rankie",
                "Fahrenheit a Celsius", "Kelvin a Celsius", "Rankie a Celsius"
        };

        String temperaturaSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Elija la temperatura a la que desea convertir:", "Temperatura",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcionesTemperatura, opcionesTemperatura[0]);

        double conversion;
        String temp;
        switch (temperaturaSeleccionada) {
            case "Celsius a Fahrenheit":
                temp = "F";
                conversion = ((cantidad2 * 9) / 5) + 32;
                break;
            case "Celsius a Kelvin":
                temp = "K";
                conversion = cantidad2 + 273.15;
                break;
            case "Celsius a Rankie":
                temp = "R";
                conversion = ((cantidad2 + 273.15) * 9) / 5;
                break;
            case "Fahrenheit a Celsius":
                temp = "C";
                conversion = ((cantidad2 - 32) * 5) / 9;
                break;
            case "Kelvin a Celsius":
                temp = "C";
                conversion = cantidad2 - 273.15;
                break;
            case "Rankie a Celsius":
                temp = "C";
                conversion = ((cantidad2 - 491.67) * 5) / 9;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción de conversión inválida", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
        }
        mostrarResultado(cantidad2, temperaturaSeleccionada, conversion, temp);
    }

    /**
     * contructor que
     * @param cantidad2
     * @param temperaturaSeleccionada
     * @param conversion
     * @param temp
     */
    private void mostrarResultado(double cantidad2, String temperaturaSeleccionada, double conversion, String temp) {
        String mensajeResultado = String.format("%.2fº %s son: %.2fº %s", cantidad2, temperaturaSeleccionada, conversion, temp);
        JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
