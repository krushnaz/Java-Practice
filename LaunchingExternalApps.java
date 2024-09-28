import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class LaunchingExternalApps {
    public static void main(String[] args) {
        File file = new File("/home/krish/Music/RajyaGeet.wav");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
