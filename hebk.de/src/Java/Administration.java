package hebk.de.src.Java;

import java.io.IOException;

public class Administration {
    public void serverOrClient() throws IOException {
        System.out.println("Do you want to join an existing Session(1) or create a new one(2)?");
        switch(Reader.read()){
            case "1": Client c = new Client(); c.joinSession(); break;
            case "2":  Server s = new Server(); s.newSession(); break;
        }
    }
}
