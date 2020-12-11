package Archivos;

import static Archivos.dataFiles.Co;
import static Archivos.dataFiles.filePath;
import Clases.Contactos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan_K
 */
public class loadFiles {
    public static void load () throws IOException {
        Object b = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while( ( b = ois.readObject() ) != null){
                Co.add((Contactos) b);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(loadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(loadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
