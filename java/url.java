import java.io.IOException;
import java.net.URL;

public class url {
    public static void main(String[] args) throws IOException {
       URL url = new URL("http://www.javatpoint.com/java-tutorial");
       System.out.println("Protocol : "+url.getProtocol());
       System.out.println("Port : "+url.getPort());
       System.out.println("Host name : "+url.getHost());
       System.out.println("File name : "+url.getFile());
       System.out.println("file path : "+url.getPath());
    //    System.out.println("content : "+url.getContent());

    }
}
