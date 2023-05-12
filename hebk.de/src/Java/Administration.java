package hebk.de.src.Java;

import java.io.IOException;

public class Administration {
    public User createUser(){
        String name = null;
        boolean b = true;
        while(b) {
            System.out.println("Please select a Name");
            name = Reader.read();
            if (name.equals("Random")) {
                System.out.println("You've found the easter egg random Name");
                name = Reader.randomName();
            }
            System.out.println("You're name ist : [" + name + "] do you want to keep it?");
            switch(Reader.read()){
                case "yes": b = false; break;
                default:
            }
        }
        return new User(name);
    }
    public void serverOrClient() throws IOException {
        User user = createUser();
        System.out.println("Do you want to join an existing Session(1) or create a new one(2)?");
        switch(Reader.read()){
            case "1": Client c = new Client(); c.joinSession(user); break;
            case "2":  Server s = new Server(); s.newSession(user); break;
        }
    }
}
