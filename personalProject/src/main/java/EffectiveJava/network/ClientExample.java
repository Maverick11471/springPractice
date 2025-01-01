package EffectiveJava.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 50001);

            socket.close();
        } catch (UnknownHostException e){

        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
