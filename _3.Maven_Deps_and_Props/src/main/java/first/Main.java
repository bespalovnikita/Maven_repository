package first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        java.util.Properties p = new Properties();

        System.out.println("2222222222!");
        Properties property  = new Properties();
        FileInputStream fis;
        String profile="";
        try {
            fis = new FileInputStream("src/main/resources/my_config.properties");
            property.load(fis);
            profile = property.getProperty("prop");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(profile);
        System.out.println("Profile ID:  " + System.getProperty("prop"));
    }
}
