package UI;
/**
 * Código para la gestión de datos de LlanquihueTour, donde se puede leer los datos de un archivo txt.
 * Autor Lorena Padilla
 *
 */
import data.LlanquihueTxt;
import model.Tour;

/**
 * Main Package
 * Recorre la lista de datos existentes.
 */
public class Main {
    public static void main(String[] args) {

        LlanquihueTxt datos = new LlanquihueTxt();

        /**
         * El primer for recorre la lista de datos en nuestro txt
         */
        for (Tour tr : datos.getTours()) {
            System.out.println(tr);
        }

        /**
         * El segundo for recorre los datos del txt para buscar el valor indicado,
         * y devuelve la línea donde este valor se encuentra.
         */
        for (Tour tr : datos.getTours()) {

            if (tr.getNombre().equals("Ruta de los Volcanes")) {
                System.out.println("\nFiltrado: " + tr);
            }
        }
    }
}