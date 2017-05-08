package hu.helixlab;

public class Main {

    public static void main(String[] args) {

        FileOperation.fileMaker("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework08\\files", "\\out.txt" );
        FileOperation.fileMaker("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework08\\files\\", 5, "Test.txt");
        FileOperation.fileMakerWithContent("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework08\\files\\", "output.txt", "Ez a szöveg lesz beleírva a fájlba");
        FileOperation.fileMakerWithContent("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework08\\files\\", 5, "Test.txt", "Ez a szöveg van beleírva a fájlokba");
    }
}
