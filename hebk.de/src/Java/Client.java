package hebk.de.src.Java;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client {
    private Session session = new Session();
    public void joinSession(User pUser)throws IOException {
        System.out.println("join Session");
        int port =session.port();
        String IP = session.iP();
        Socket sock=new Socket("localhost", port);

        DataInputStream in= new DataInputStream(sock.getInputStream());

        DataOutputStream out =new DataOutputStream(sock.getOutputStream());
        session.newChat(out, in);
    }}