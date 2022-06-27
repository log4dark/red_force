package com.log4dark.method_chaining;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class TcpClient {

    Socket sock = null;
    String result = null;

    public TcpClient open(String strHost, int iPort, int timeoutMsec) throws Exception {
        System.out.printf("open() start\n");

        try {
            /** NOTE: TCP Connect...
             * - Check... java.net.ConnectException: Connection refused (Connection refused)
            sock = new Socket();
            sock.setSoTimeout(timeoutMsec);
            sock.connect(new InetSocketAddress(strHost, iPort), timeoutMsec);
             */
            result = "200";

            // if error occur, throw user's exception
            if (result == null || !result.startsWith("200")) {
                throw new Exception("tcpClient.open() error=" + result);
            }
        } catch (Exception e) {
            System.out.printf("tcp connect failed err=%s\n", e.toString());
            throw e;
        }
        return this;
    }

    public TcpClient setArg(String sKey, String sVal) throws Exception {
        System.out.printf("setArt(%s=%s) start\n", sKey, sVal);

        try {
            // Send & Receive... (& Error Check...)
            result = "200";

            if (result == null || !result.startsWith("200")) {
                throw new Exception("tcpClient.setArg() error=" + result);
            }
        } catch (Exception e) {
            System.out.printf("setArg failed err=%s\n", e.toString());
            throw e;
        }
        return this;
    }
}