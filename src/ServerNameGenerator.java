import java.util.Random;

public class ServerNameGenerator {
    public static void random(String[] adjectives, String[] nouns){
        Random random = new Random();
        String chosenString1 = adjectives[random.nextInt(adjectives.length)];
        String chosenString2 = nouns[random.nextInt(nouns.length)];
        System.out.println("Here is your server name: ");
        System.out.println(chosenString1 + "-" + chosenString2);
    }
    public static void main(String[] args){
        String[] adjectives = {"Red", "Happy", "Angry", "Obnoxious", "Tired", "Strong", "Sleepy", "Cunning", "Unique", "Smart"};
        String[] nouns = {"Lion", "Rabbit", "Python", "Owl", "Envy", "Respect", "Library", "Continent", "iPad", "Mother"};
        random(adjectives, nouns);
     }
}
