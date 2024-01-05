import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1234); // create server socket
        System.out.println("Server started on port 1234.");
        Socket socket = serverSocket.accept(); // wait for client connection
        System.out.println("Client connected: " + socket.getInetAddress().getHostName());

        // create input and output streams
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        // read and write messages between client and server
        String message;
        while ((message = input.readLine()) != null) {
            System.out.println("Client: " + message);
            output.println("Server: " + message);
        }

        // close socket and streams
        System.out.println("Client disconnected.");
        output.close();
        input.close();
        socket.close();
        serverSocket.close();
    }
}
