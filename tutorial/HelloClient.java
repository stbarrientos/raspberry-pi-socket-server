package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

/*
Socket Client
*/

public class HelloClient {

  /*
  Runs the client app. Displays a dialog box for IP and Port
  */

  public static void main(String[] args) throws IOException {
    String serverAddress = JOptionPane.showInputDialog("Enter target IP: ");
    int port = Integer.parseInt(JOptionPane.showInputDialog("Enter Port: "));
    Socket s = new Socket(serverAddress, port);
    BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
    String answer = input.readLine();
    JOptionPane.showMessageDialog(null, answer);
    System.exit(0);
  }
}