/**
 * Esta clase funciona como un gestor de datos para el archivo de texto ligado a este código (tours.txt)
 * Se agregan estos valores a una ArrayList.
 */
package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LlanquihueTxt {
    /**
     * Se crea una nueva Arraylist donde irán los datos de cada línea.
     * Se asignan valores a variables separadas por un ";".
     */
    public ArrayList<Tour> tours = new ArrayList<>();
    {
        try {
            FileReader fr = new FileReader("src/main/resources/tours.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null){
                String[] partes = linea.split(";");
                Tour recorrido = new Tour(partes[0], partes[1], Integer.parseInt(partes[2]));
                tours.add(recorrido);
            }
/**
 * Y se manejan errores en caso de no encontrar el archivo.
 */
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e + "Error al leer el archivo");
        }

    }
    public ArrayList<Tour> getTours(){
        return tours;
    }

    public String toString() {
        return tours.toString();
    }
}
