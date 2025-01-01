package EffectiveJava.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);
            System.out.println(inetAddress.getHostAddress());

            InetAddress[] inetAddress1 = InetAddress.getAllByName("www.naver.com");
            for(InetAddress inet : inetAddress1){
                System.out.println(inet);
                System.out.println(inet.getHostAddress());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
