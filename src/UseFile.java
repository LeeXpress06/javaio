import java.io.*;


public class UseFile {

    public static void main(String[] args) {

    }
    private static void useFile(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter("output.text");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Shiblee is special");
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("output.text"));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();






    }

}
