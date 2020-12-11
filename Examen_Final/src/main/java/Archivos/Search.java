package Archivos;

import static Archivos.dataFiles.Co;

/**
 *
 * @author Juan_K
 */
public class Search {
    
    public static int searchByID(String name){
        for ( int i = 0 ; i < Co.size() ; i++ ){
            if(Co.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
