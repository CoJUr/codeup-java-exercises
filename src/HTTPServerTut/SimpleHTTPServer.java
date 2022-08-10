package HTTPServerTut;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPServer {

    public static void main(String[] args) throws Exception{

        final ServerSocket server = new ServerSocket(8080);
        System.out.println("listening for connection on port 8080 . . . ");
        while (true) {
//            blocking method- blocks until a connection is made, then returns a socket object which
//            can be used to communicate with the client. close the socket when done with client and call accept again to accept another client.
            final Socket client = server.accept();

//            1. read http request from client socket
//            2. prepare http response and then send it to client
//            3. close the socket

//            can use InputStream to read content of get request. better to use BufferedReader to read content of get request
//            because the browser sends multiple lines.
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (!line.isEmpty()) {
                System.out.println(line);
                line = br.readLine();
//                https://javarevisited.blogspot.com/2015/06/how-to-create-http-server-in-java-serversocket-example.html
            }

//
        }
    }
}
