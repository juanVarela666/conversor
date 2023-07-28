package conversorAlura;

import javax.swing.*;
/**
 * Clase que representa un convertidor de monedas.
 */
public class MonedaConverter {
    /**
     * Realiza la conversión de una cantidad de dinero a diferentes monedas.
     *
     * @param cantidad La cantidad de dinero a convertir.
     */
    public void convertir(double cantidad) {
        String[] opcionesMonedas = {
                "Pesos Mexicanos a Dolares", "Pesos Mexicanos a Euros",
                "Pesos Mexicanos a Libras Esterlinas", "Pesos Mexicanos a Yenes Japoneses",
                "Pesos Mexicanos a Wones Sul-Coreanos", "Dolares a Pesos Mexicanos",
                "Euros a Pesos Mexicanos", "Libras Esterlinas a Pesos Mexicanos",
                "Yenes Japoneses a Pesos Mexicanos", "Wones Sul-Coreanos a Pesos Mexicanos"
        };

        String monedaSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Elija la moneda a la que desea convertir su dinero:", "Monedas",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcionesMonedas, opcionesMonedas[0]);

        double conversion;
        String moneda;
        switch (monedaSeleccionada) {
            case "Pesos Mexicanos a Dolares":
                moneda = "USD";
                conversion = cantidad * 0.059;
                break;
            case "Pesos Mexicanos a Euros":
                moneda = "EUR";
                conversion = cantidad * 0.048;
                break;
            case "Pesos Mexicanos a Libras Esterlinas":
                moneda = "GBP";
                conversion = cantidad * 0.042;
                break;
            case "Pesos Mexicanos a Yenes Japoneses":
                moneda = "JPY";
                conversion = cantidad * 5.495;
                break;
            case "Pesos Mexicanos a Wones Sul-Coreanos":
                moneda = "KRW";
                conversion = cantidad * 76.656;
                break;
            case "Dolares a Pesos Mexicanos":
                moneda = "MXN";
                conversion = cantidad * 16.844;
                break;
            case "Euros a Pesos Mexicanos":
                moneda = "MXN";
                conversion = cantidad * 20.627;
                break;
            case "Libras Esterlinas a Pesos Mexicanos":
                moneda = "MXN";
                conversion = cantidad * 23.996;
                break;
            case "Yenes Japoneses a Pesos Mexicanos":
                moneda = "MXN";
                conversion = cantidad * 0.182;
                break;
            case "Wones Sul-Coreanos a Pesos Mexicanos":
                moneda = "MXN";
                conversion = cantidad * 0.013;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción de conversión inválida", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
        }

        mostrarResultado(cantidad, monedaSeleccionada, conversion, moneda);
    }

    /**
     * Muestra el resultado de la conversión de moneda en un cuadro de diálogo.
     *
     * @param cantidad              La cantidad original de dinero ingresada por el usuario.
     * @param monedaSeleccionada    La opción seleccionada por el usuario para la conversión de moneda.
     * @param conversion            El valor convertido de la moneda.
     * @param moneda                La abreviatura de la moneda convertida.
     */
    private void mostrarResultado(double cantidad, String monedaSeleccionada, double conversion, String moneda) {
        String mensajeResultado = String.format("%.2f %s son: %.2f %s", cantidad, monedaSeleccionada, conversion, moneda);
        JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
