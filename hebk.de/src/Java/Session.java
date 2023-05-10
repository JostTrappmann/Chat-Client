package hebk.de.src.Java;

public class Session {

    public int port(){

        System.out.println("Please choose the port");
        return Integer.parseInt(Reader.read());
    }

    public String  iP(){
        System.out.println("Please choose the IP");
        return Reader.read();
    }
}
