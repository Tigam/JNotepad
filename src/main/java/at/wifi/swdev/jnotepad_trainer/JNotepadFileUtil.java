package at.wifi.swdev.jnotepad_trainer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dev
 */
public class JNotepadFileUtil {

    private static final String NL = System.getProperty("line.separator");

    
    public static void writeTextFile(Path p, String content) throws IOException {
        Files.writeString(p, content);
    }
    
    public static String readTextFileStream(Path p) throws IOException {
        return Files.lines(p, Charset.defaultCharset()).collect(Collectors.joining(NL));
    }

    public static String readTextFile(Path p) throws IOException {
        List<String> lines = Files.readAllLines(p, Charset.forName("utf8"));
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line);
            sb.append(NL);
        }
        return sb.toString();
    }

    public static String readTextFileOld(File inputFile) {
        String content = "";
        try ( BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                content += line;
                content += NL;
            }
        } catch (IOException ioe) {
            System.err.println("Fehler beim Schließen der Datei!" + ioe.getMessage());
        }
        return content;
    }

}
