package hebk.de.src.Java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Server {

    private Session session = new Session();
    public void newSession(User pUser) throws IOException{

        int port =session.port();
        String IP = session.iP();
        ServerSocket serverSock=new ServerSocket(port);
        while(true) {
            Socket Sock=serverSock .accept();
            DataOutputStream out =new DataOutputStream(Sock.getOutputStream());
            DataInputStream in= new DataInputStream(Sock.getInputStream());
            session.newChat(out, in,pUser);
        }



      //

    }
}
