package hebk.de.src.Java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class User {
    private String name;
    private int uID;
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    public User(String pName) {
        this.name = pName;
        this.uID = pName.hashCode();
    }
    public int getUID(){
        return uID;
    }
    public String getName(){
        return name;
    }
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    public Socket getSocket(){
        return socket;
    }
    public void setIn(DataInputStream in) {
        this.in = in;
    }
    public void setOut(DataOutputStream out){
        this.out = out;
    }
}
