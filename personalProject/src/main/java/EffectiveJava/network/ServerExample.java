package EffectiveJava.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {

        startServer();


    }

    public static void startServer(){
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {


                    serverSocket = new ServerSocket(50001);
                    System.out.println("서버 시작됨");

                    Socket socket = serverSocket.accept();

                    InetSocketAddress isa =
                            (InetSocketAddress) socket.getRemoteSocketAddress();

                    String a = isa.getHostName();

                    System.out.println(a + "연결");

                    socket.close();


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        thread.start();
    }
}
