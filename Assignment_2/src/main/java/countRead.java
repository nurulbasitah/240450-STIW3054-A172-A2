
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class countRead implements statistics {

    @Override
    public void readCountw() {
        FileInputStream fileStream = null;
        try {
            File fileread = new File("C:\\Users\\hp\\240450-STIW3054-A172-A1.wiki\\senarai.md");
            fileStream = new FileInputStream(fileread);
            InputStreamReader input = new InputStreamReader(fileStream);
            BufferedReader reader = new BufferedReader(input);
            int characterCount = 0;
            String line;
            int countWord = 0;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (!(line.equals(""))) {
                    // \\s+ is the space delimiter in java
                    String[] wordList = line.split("\\s+");
                    countWord += wordList.length;
                    characterCount += line.length();
                }
                //line = reader.readLine();
            }
            Writer writer = null;
            File file = new File("C:\\Users\\hp\\240450-STIW3054-A172-A2.wiki\\Assignment.md");
            writer = new BufferedWriter(new FileWriter(file));
            System.out.println("Total word count = " + countWord);
            writer.write("Total word count = " + countWord + "\n");
            System.out.println("Total number of characters = " + characterCount);
            writer.write("Total number of characters = " + characterCount + "\n");
            System.out.println("Total number of lines = " + lineCount);
            writer.write("Total number of lines = " + lineCount + "\n");
            System.out.println();
            try {
                if (writer != null) {
                    writer.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(countRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(countRead.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileStream.close();
            } catch (IOException ex) {
                Logger.getLogger(countRead.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
