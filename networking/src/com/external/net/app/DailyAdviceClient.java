package com.external.net.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * It is a simple application class which works as client.
 * It take advice from the AdviceServer using socket.
 */
public class DailyAdviceClient {

    public void go() {
        try {

            // Make a socket connection to whatever is running on port 4242,
            // on the same host this code is running (The 'localhost')
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());

            // Chain a BufferedReader to an InputStreamReader to the input stream from the socket.
            BufferedReader reader = new BufferedReader(streamReader);


            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);

            reader.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
