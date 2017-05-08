package hu.helixlab;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Hp_Workplace on 2017. 05. 08..
 */
public class FileOperation {

    public static void fileMaker(String path, String out) {
        try {
            FileWriter file = new FileWriter(path + out);
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void fileMaker(String path, int db, String out) {
        try {
            for (int i = 0; i < db; i++) {
                FileWriter file = new FileWriter(path + i + out);
                file.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fileMakerWithContent(String path, String out, String content) {
        try {
            FileWriter file = new FileWriter(path + out);
            file.write(content);
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fileMakerWithContent(String path, int db, String out, String content) {
        try {
            for (int i = 0; i < db; i++) {
                FileWriter file = new FileWriter(path + i + out);
                file.write(content);
                file.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void printMatrixFromFile() {
        int x = 0;
        int y = 0;
        int[][] matrix = new int[5][5];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework08\\files\\matrix.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                for (String str : values) {
                    int str_int = Integer.parseInt(str);
                    matrix[x][y] = str_int;
                    System.out.print(matrix[x][y] + " ");
                }
                y += 1;
                System.out.println("");
            }
            x += 1;

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
