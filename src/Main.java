import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // input file and output reading

        // step -01: need to know file location
        String path = "\"C:\\Users\\shibl\\OneDrive\\Documents\\Transform myself.docx\"";

        // step two need a class/machine to read we select Buffer reader
        FileReader fileReader = new FileReader(path);

        // now upgrade to bufferreader for more efficient reading
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // let read now  and store it in a string
          // read first line
          String line =   bufferedReader.readLine();
          // keep reading and repeat the process using loop
          while(line != null) {
              System.out.println(line);
               line =   bufferedReader.readLine();
          }
          // close the machine to stop memory leaking
          bufferedReader.close();















    }





}
