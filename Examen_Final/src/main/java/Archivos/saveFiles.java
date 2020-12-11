package Archivos;

import static Archivos.dataFiles.Co;
import static Archivos.dataFiles.filePath;
import static Archivos.dataFiles.filePathCSV;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan_K
 */
public class saveFiles {
    
    public static void saveObjects() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for ( int i = 0; i < Co.size(); i++ ){
                oos.writeObject(Co.get(i));
            }
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveFiles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(saveFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void saveAsCSV() {
        String information = "";
        
        try {
            FileWriter w = new FileWriter(filePathCSV);
            for ( int i = 0 ; i < Co.size(); i++ ) {
                information = information.concat(Co.get(i).toString()) + "\n";
            }
            w.write(information);
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(saveFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
