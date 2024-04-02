import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public void run(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while(true){
            try {
                Socket socket = serverSocket.accept();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
