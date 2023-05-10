package hebk.de.src.Java;

import hebk.de.src.Java.Administration;

import java.io.IOException;


public class App {
    public static void main(String [] args) throws IOException {
        Administration administration = new Administration();
        administration.serverOrClient();
    }
}
