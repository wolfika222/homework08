package hu.helixlab;

import java.io.File;
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
}
