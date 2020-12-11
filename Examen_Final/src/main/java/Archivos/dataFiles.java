package Archivos;

import Clases.Contactos;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Juan_K
 */
public class dataFiles {
        
    public static String directory = System.getProperty("user.home");
    public static String fileName = "Contactos.txt";
    public static String filePath = directory + File.separator + "Contactos java" + File.separator + fileName;
    public static String filePathCSV = directory + File.separator + "Contactos java" + File.separator + "Persons.csv";
    
    public static ArrayList<Contactos> Co = new ArrayList();
}
