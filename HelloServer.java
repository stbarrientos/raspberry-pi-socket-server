package tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
  * A hello world socket server on port 5678 that responds Hello World plus the original message from the client
  */

public class HelloServer {

  /*
    Runs the server
  */

  public static void main(String[] args) throws IOException {
    ServerSocket listener = new ServerSocket(Integer.parseInt(args[0]));
    try {
      while (true) {
        Socket socket = listener.accept();
        try {
          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
          out.println("Hello World");
        }
        finally {
          socket.close();
        }
      }
    }
    finally {
      listener.close();
    }
  }
}