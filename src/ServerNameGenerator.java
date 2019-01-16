package src;

public class ServerNameGenerator {
    public static void main(String[] args) {
    String[] adjectives = {"nefarious", "sycophantic", "audacious", "ostentatious", "misanthropic", "deleterious", "cacophonous", "quixotic", "evanescent", "iridescent"};
    String[] nouns = {"cuttlefish", "crab", "conch", "crustacean", "carp",    "catfish", "clownfish", "cod", "clam", "coelocanth" };
    // STRING ARRAYS CREATED
    // METHOD CALLS GO HERE
        System.out.println("Here is your new server title:");
        generateServerName(adjectives, nouns);
    }
    // BUILD METHODS HERE
    public static String generateServerName(String[] adjectives, String[] nouns){
        int random1 = (int) (Math.random() * ((10 - 1) + 1));
        int random2 = (int) (Math.random() * ((10 - 1) + 1));
        String randomName = adjectives[random1] + "-" + nouns[random2];
        System.out.println(randomName);
        return randomName;

    }

    //  END OF EVERYTHING
}
