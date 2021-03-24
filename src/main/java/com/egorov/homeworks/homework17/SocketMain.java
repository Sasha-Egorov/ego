package com.egorov.homeworks.homework17;

import com.google.gson.Gson;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;


public class SocketMain {
    public String getInfo() {
        try (Socket socket = new Socket("jsonplaceholder.typicode.com", 80);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()){

            String s = "GET /users/5 HTTP/1.1\n" +
                    "Host: jsonplaceholder.typicode.com\n" +
                    "\n" +
                    "\n";
            outputStream.write(s.getBytes());
            int ch;
            String result = "";

            try {
                while ((ch = inputStream.read()) != -1) {
                    result = result + (char) ch;
                }
            } catch (SocketException e) {
                socket.close();
            }
            String[] split = result.split("\n(?=\\{)");
            return split[1];
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
