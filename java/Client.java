import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("server-ip-address", 1234); // create client socket
        System.out.println("Connected to server: " + socket.getInetAddress().getHostName());

        // create input and output streams
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        // read file name from console and send to server
        System.out.print("Enter file name: ");
        String fileName = console.readLine();
        output.println(fileName);

        // read file contents from server and print to console
        String line;
        while ((line = input.readLine()) != null) {
            if (line.equals("File Not Found")) {
                System.out.println(line);
                break;
            }
            System.out.println(line);
        }

        // close socket and streams
        output.close();
        input.close();
        console.close();
        socket.close();
    }
}
