package at.wifi.swdev.jnotepad_trainer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;


public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Datei einlesen und String ausgeben
        File inputFile = new File("C:\\Users\\dev\\Documents\\loremipsum.txt");
        String content = JNotepadFileUtil.readTextFileOld(inputFile);
        System.out.println("Content: " + content);
        
        
        String content2 = JNotepadFileUtil.readTextFileStream(Paths.get("C:\\Users\\dev\\Documents\\loremipsum.txt"));
        System.out.println("Content2: " + content2);
    }
    
}
