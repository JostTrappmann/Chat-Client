package hebk.de.src.Java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Server {
    private Session session = new Session();
    public void newSession() throws IOException{

        int Port =session.port();
        String IP = session.iP();
        ServerSocket serverSock=new ServerSocket(6066);
        Socket Sock=serverSock .accept();
        DataOutputStream out =new DataOutputStream(Sock.getOutputStream());
        out.writeUTF(JOptionPane.showInputDialog("Message"));
        DataInputStream in= new DataInputStream(Sock.getInputStream());
        System.out.println(in.readUTF());
        Sock.close();
    }
}
