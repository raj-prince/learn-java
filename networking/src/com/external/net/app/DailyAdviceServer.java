package com.external.net.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * It is a simple application class which works as Advice Server.
 * It provides advice to client.
 */
public class DailyAdviceServer {

    public void go() {

        try {
            // ServerSocket makes this server application 'listen'
            // for client requests on port 4242 on the machine
            // this code is running.
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {

                // This accept method blocks (just sits there) until a request
                // comes in, and then the method returns a Socket (on some random port)
                // for communicating with the client.
                Socket sock = serverSocket.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());

                String advice = "Take Smaller Bites";

                writer.println(advice);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
