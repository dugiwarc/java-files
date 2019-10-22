import java.io.File;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/home/dugiwarc/Dekstop/George/Botnaru";
        File d = new File(dirname);

        d.mkdirs();
    }
}