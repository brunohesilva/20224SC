package atividade.rmi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandleFile {

    private File file;

    public HandleFile() {
        file = new File("Presenca.txt");
    }

    public boolean setData(String data) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(data);
            bw.close();
            fw.close();
            return true;

        } catch (IOException e) {
            System.err.println("***** ERROR WRITING FILE *****");
            System.err.println(e);
            return false;
        }
    }

    public String getData() {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            return br.readLine();

        } catch (IOException e) {
            System.err.println("***** ERROR READING FILE *****");
            System.err.println(e);
            return null;
        }
    }
}
