package conversorAlura;
/**
 * Conversor de monedas, temperatura y longitud
 * Esta clase implementa un programa que permite al usuario realizar conversiones entre diferentes unidades,
 * como monedas, temperatura y longitud. El programa muestra un menú principal con tres opciones y, según la
 * opción seleccionada, permite al usuario ingresar una cantidad y realizar la conversión correspondiente.
 * @author Juan Varela
 * @version 1.0
 */
import javax.swing.JOptionPane;

public class ConversorMain {
    /**
     * Método principal que inicia el programa mostrando el menú principal.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }
    /**
     * Muestra el menú principal con las opciones de conversión disponibles.
     * Dependiendo de la opción seleccionada, invoca los métodos correspondientes para realizar la conversión.
     */
    public static void mostrarMenuPrincipal() {
        Object[] opcionesMenuPrincipal = { "Conversor de monedas", "Conversor de temperatura", "Conversor de longitud" };

        Object opcionMenuPrincipal = JOptionPane.showInputDialog(null,
                "Seleccione una opción de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcionesMenuPrincipal, opcionesMenuPrincipal[0]);

        if (opcionMenuPrincipal == null) {
            // El usuario ha cancelado el diálogo
            JOptionPane.showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Adiós", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (opcionMenuPrincipal.equals(opcionesMenuPrincipal[0])) {
            convertirMoneda();
        } else if (opcionMenuPrincipal.equals(opcionesMenuPrincipal[1])) {
            convertirTemperatura();
        } else {
            convertirLongitud();
        }
    }
    /**
     * Realiza la conversión de monedas.
     * Obtiene una cantidad ingresada por el usuario y utiliza la clase MonedaConverter para realizar la conversión.
     */
    public static void convertirMoneda() {
        double cantidad = obtenerCantidad();
        MonedaConverter monedaConverter = new MonedaConverter();
        monedaConverter.convertir(cantidad);
    }
    /**
     * Realiza la conversión de temperatura.
     * Obtiene una cantidad ingresada por el usuario y utiliza la clase TemperaturaConverter para realizar la conversión.
     */
    public static void convertirTemperatura() {
        double cantidad2 = obtenerCantidadT();
        TemperaturaConverter temperaturaConverter = new TemperaturaConverter();
        temperaturaConverter.convertir(cantidad2);
    }
    /**
     * Realiza la conversión de longitud.
     * Obtiene una cantidad ingresada por el usuario y utiliza la clase LongitudConverter para realizar la conversión.
     */
    public static void convertirLongitud() {
        double cantidad3 = obtenerCantidadL();
        LongitudConverter longitudConverter = new LongitudConverter();
        longitudConverter.convertir(cantidad3);
    }
    /**
     * Obtiene una cantidad de dinero ingresada por el usuario.
     * Se le permite al usuario hasta 3 intentos para ingresar un valor válido.
     * @return La cantidad ingresada por el usuario como un objeto Double, o null si la operación fue cancelada o fallida.
     */
    public static Double obtenerCantidad() {
        int intentos = 3; // Número máximo de intentos permitidos
        while (intentos > 0) {
            try {
                String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que desea convertir:");
                if (input == null) {
                    // El usuario ha cancelado el diálogo
                    JOptionPane.showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Adiós", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0); // O podrías retornar null o realizar otra acción
                }
                double cantidad = Double.parseDouble(input);
                return cantidad;
            } catch (NumberFormatException e) {
                intentos--;
                if (intentos == 0) {
                    JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. Saliendo del programa.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(1); // O podrías retornar null o realizar otra acción
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return null; // Puede ser útil retornar null si hay alguna otra parte del código que necesita manejar esto.
    }
    /**
     * Obtiene una temperatura ingresada por el usuario.
     * Se le permite al usuario hasta 3 intentos para ingresar un valor válido.
     * @return La temperatura ingresada por el usuario como un objeto Double, o null si la operación fue cancelada o fallida.
     */
    public static Double obtenerCantidadT() {
        int intentos = 3; // Número máximo de intentos permitidos
        while (intentos > 0) {
            try {
                String input = JOptionPane.showInputDialog("Ingresa la temperatura que desea convertir:");
                if (input == null) {
                    // El usuario ha cancelado el diálogo
                    JOptionPane.showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Adiós", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0); // O podrías retornar null o realizar otra acción
                }
                double cantidad = Double.parseDouble(input);
                return cantidad;
            } catch (NumberFormatException e) {
                intentos--;
                if (intentos == 0) {
                    JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. Saliendo del programa.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(1); // O podrías retornar null o realizar otra acción
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese una temperatura válida.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return null; // Puede ser útil retornar null si hay alguna otra parte del código que necesita manejar esto.
    }
    /**
     * Obtiene una longitud ingresada por el usuario.
     * Se le permite al usuario hasta 3 intentos para ingresar un valor válido.
     * @return La longitud ingresada por el usuario como un objeto Double, o null si la operación fue cancelada o fallida.
     */
    public static Double obtenerCantidadL() {
        int intentos = 3; // Número máximo de intentos permitidos
        while (intentos > 0) {
            try {
                String input = JOptionPane.showInputDialog("Ingresa la longitud que desea convertir:");
                if (input == null) {
                    // El usuario ha cancelado el diálogo
                    JOptionPane.showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Adiós", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0); // O podrías retornar null o realizar otra acción
                }
                double cantidad = Double.parseDouble(input);
                return cantidad;
            } catch (NumberFormatException e) {
                intentos--;
                if (intentos == 0) {
                    JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. Saliendo del programa.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(1); // O podrías retornar null o realizar otra acción
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese una longitud válida.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return null; // Puede ser útil retornar null si hay alguna otra parte del código que necesita manejar esto.
    }
}