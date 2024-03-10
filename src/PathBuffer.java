import java.io.*;

public class PathBuffer {

    public static void main(String[] args) {

        String filename = "file.text";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
            bufferedWriter.write("Shiblee is special");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     // reader
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
