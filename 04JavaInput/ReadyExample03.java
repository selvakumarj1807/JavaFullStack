import java.io.*;

class FileReadyExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

        // ready() will be true because file already has data
        if (br.ready()) {
            System.out.println("File has data. Reading now...\n");

            String line;
            while (br.ready()) {   // check before reading
                line = br.readLine();
                System.out.println(line);
            }
        } else {
            System.out.println("File is empty");
        }

        br.close();
    }
}