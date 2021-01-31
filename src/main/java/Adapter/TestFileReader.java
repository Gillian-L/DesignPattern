package Adapter;

import java.io.*;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-15:34
 * @Description: Gillian_pro:Adapter
 * @Version: 1.0
 */
public class TestFileReader {

    public static void main(String[] args) {
        try {
            FileInputStream file1 = new FileInputStream("Design_pattern/ttt.txt");
           // File file = new File("Design_pattern/ttt.txt");
           // BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(file1));
            while (true) {
                try {
                    String line = reader.readLine();
                    if (line == null) break;
                    System.out.println(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*finally {

        }*/
    }
}
