package hebk.de.src.Java;

public class User {
    private String name;
    private int uID;
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
}
