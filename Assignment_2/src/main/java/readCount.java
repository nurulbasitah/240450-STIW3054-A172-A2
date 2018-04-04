import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class readCount {

   public static void main (String args[]) throws Exception {
      // int calcu =0;
       Writer writer = null;
        
        readCountw();
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long output = endTime - startTime;
        double result = (double) output/1000000000.0;
        System.out.printf("\nTime Execution = %.9f seconds",result );
        //writer.write("\nConcurrent program = "+result+" seconds");
       
   }
    
    public static void readCountw() throws FileNotFoundException, IOException{
        File fileread = new File("C:\\Users\\hp\\240450-STIW3054-A172-A1.wiki\\senarai.txt");
        FileInputStream fileStream = new FileInputStream(fileread); 
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        

        int characterCount = 0;
        String line;
        int countWord = 0;
        int lineCount =0;
        while((line = reader.readLine()) != null){
          lineCount++;
            if(!(line.equals("")))
            {      
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
           
        try{
        if (writer!=null){
            writer.close();
            
        } 
        }catch(IOException e){
                e.printStackTrace();
                }
     
    }
 
}
