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
        statistics nur;
        nur = new countRead();
        nur.readCountw();
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long output = endTime - startTime;
        double result = (double) output/1000000000.0;
        System.out.printf("\nTime Execution = %.9f seconds",result );
        //writer.write("\nConcurrent program = "+result+" seconds");
       
   }   
 
}
