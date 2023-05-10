package hebk.de.src.Java;

import java.io.IOException;

public class Administration {
    public User createUser(){
        System.out.println("Please select a Name");
        return new User(Reader.read());
    }
    public void serverOrClient() throws IOException {
        User user = createUser();
        System.out.println("Do you want to join an existing Session(1) or create a new one(2)?");
        switch(Reader.read()){
            case "1": Client c = new Client(); c.joinSession(user); break;
            case "2":  Server s = new Server(); s.newSession(); break;
        }
    }
}
