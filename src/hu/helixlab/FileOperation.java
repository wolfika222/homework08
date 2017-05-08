package hu.helixlab;


import java.io.FileWriter;

/**
 * Created by Hp_Workplace on 2017. 05. 08..
 */
public class FileOperation {

    public static void fileMaker(String path, String out){
        try {
            FileWriter file = new FileWriter(path + out);
            file.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void fileMaker(String path, int db, String out){
        try {
            for (int i = 0; i < db ; i++) {
                FileWriter file = new FileWriter(path + i + out);
                file.close();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void fileMakerWithContent(String path, String out, String content){
        try {
            FileWriter file = new FileWriter(path + out);
            file.write(content);
            file.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
