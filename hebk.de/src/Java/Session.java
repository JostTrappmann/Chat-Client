package hebk.de.src.Java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Session {
    ArrayList<User> user = new ArrayList();

    public int port(){


        System.out.println("Please choose the port");
        return Integer.parseInt(Reader.read());
    }

    public String  iP(){
        System.out.println("Please choose the IP");
        return Reader.read();
    }
    public User getUser(int i){

        return user.get(i);
    }
    public void addUser(User user, Socket socket){
        user.setSocket(socket);
        this.user.add(user);

    }
    public void newChat(DataOutputStream out, DataInputStream in) throws IOException {
        System.out.println("Write your Message");
        out.writeUTF(Reader.read());
        System.out.println(in.readUTF());
    }
}
