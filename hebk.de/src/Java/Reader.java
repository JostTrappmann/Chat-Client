package hebk.de.src.Java;

import java.util.Scanner;

public class Reader {
    private static Scanner s = new Scanner(System.in);

    public static String read() {
        return s.nextLine();
    }

    public static String[] firstNames = {
            "Submissive",
            "IceOut",
            "Slay",
            "[They/Them]",
            "KissXSis",
            "SíSíPorFavores",
            "BetterThanYourEx",
            "Dark",
            "Horny",
            "Big",
            "Eigentlich...",
            "Bad",
            "Döner",
            "Lost",
            "Deez",
            "Small",
            "Hard",
            "Flat",
            "Drunk",
            "The",
            "Hot",
            "Flirty",
            "Sexy",
            "Naked",
            "Stripped",
            "Tied",
            "Kinky",
            "Privatversichert",
            "Gay",
            "Juicy",
            "Dirty",
            "Thirsty",
            "Handsome",
            "Good",
            "Crazy",
            "Psychic"

    };
    public static String[] lastNames = {
            "Lightbulb",
            "Nightmare",
            "Dream",
            "Kitty",
            "Upgrade",
            "Markus",
            "Kampfhelikopter",
            "NNN",
            "Sub",
            "DDD",
            "DarkSoulsBoss",
            "Homie",
            "Schwanz",
            "Loch",
            "Alina",
            "OleMaartenHolftrerich",
            "Smaarten",
            "Oma Maarten",
            "Hero",
            "Lord",
            "Fantasy",
            "Pokemon",
            "Bitch",
            "Scream",
            "Oooops",
            "Smoke",
            "Döner",
            "User",
            "800 J. Holtfrerich",
            "Winner",
            "Lover",
            "Nuts",
            "Balls",
            "ThiccShady",
            "Timolia",
            "B00bs",
            "Master",
            "Niklas",
            "Tim",
            "Kevin",
            "Manuela",
            "Stella",
            "Jost",
            "Msallam",
            "Atakan",
            "Aswin",
            "Max",
            "Lukas",
            "Marvin",
            "Jonas",
            "Nick",
            "OleFanclub",
            "ErvinKotzlovski",
            "Schmonz",
            "VdV",
            "Slut",
            "Red-Light-District",
            "Juice",
            "Talk",
            "Impact",
            "Mommy",
            "Daddy",
            "Boy",
            "Girl",
            "Love",
            "Honey",
            "DM's",
            "Waifu",
            "Nordwand",
            "Wienands",
    };
    public static String randomName() {

        int x = (int)Math.floor(Math.random() * (firstNames.length));
        String s = "";
        int y = (int)Math.floor(Math.random() * (lastNames.length));

        s = firstNames[x] + " " + lastNames[y];
        return s;


    }
}
