import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket(InetAddress.getByName("127.0.0.1"), 8080);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

              out.println("Николай");

            String serverWord = in.readLine(); // ждём, что скажет сервер
            System.out.println(serverWord);



    }

}
