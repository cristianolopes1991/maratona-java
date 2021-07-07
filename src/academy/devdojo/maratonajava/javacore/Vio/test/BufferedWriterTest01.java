package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O devDojoe é lindo, é o melhor curso do brasilll");
            bw.newLine();
            bw.write("Continuando a cantoria do brasil");
            bw.flush();

        }catch (IOException ex){
            ex.printStackTrace();

        }
    }
}
