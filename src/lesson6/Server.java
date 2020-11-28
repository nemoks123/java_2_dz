package lesson6;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Socket socket= null;
        Scanner scanner = new Scanner(System.in);

        try (ServerSocket server = new ServerSocket(3221)) {
            System.out.println("Сервер запущен");

            socket = server.accept();
            System.out.println("Клиент подключился" );
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());


            Thread threadReader = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threadReader.setDaemon(true);
            threadReader.start();

            while (true) {
                String str = in.readUTF();
                if (str.equals("/выход")) {
                    System.out.println("Клиент вышел");
                    out.writeUTF("/выход");
                    break;
                } else {
                    System.out.println("Клиент пишет :" + str  + "    (для выхода напишите \"/выход\")");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
