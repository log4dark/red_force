package com.log4dark.method_chaining;


import java.net.ConnectException;

public class TcpClientExample {
    public TcpClientExample() {
        System.out.println("## Method Chaining ##############################");

        TcpClient tcpClient = new TcpClient();
        try {
            tcpClient
                    .open("127.0.0.1", 7905, 3000)
                    .setArg("NAME", "dark")
                    .setArg("EMAIL", "arthur.jeon@gmail.com");
        } catch (ConnectException e) {
            System.out.printf("IOException ie=%s\n", e.toString());
        } catch (Exception e) {
            System.out.printf("Exception ie=%s\n", e.toString());
        }
    }
}
