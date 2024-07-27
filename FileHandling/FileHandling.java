package FileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling");
        File file=new File("/Users/chetanharsingh/Desktop/Java_Projects/Practice/src/FileHandling/input.txt");
        file.createNewFile();
        System.out.println(file.getAbsolutePath());
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("This is new File");
        bw.close();
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(file.exists());
    }
}
