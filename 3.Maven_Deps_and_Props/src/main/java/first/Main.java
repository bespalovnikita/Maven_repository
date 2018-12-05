import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Properties property  = new Properties();
        FileInputStream fis;
        String profile="";
        try {
            fis = new FileInputStream("src/main/props.properties");
            property.load(fis);
            profile = property.getProperty("prop");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(profile);
    }
}
