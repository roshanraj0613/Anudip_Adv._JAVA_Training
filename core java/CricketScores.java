import java.util.HashMap;
import java.util.Map;

public class CricketScores {
    // The map is private and can only be accessed within the class
    private final Map<String, Integer> scores;

    public CricketScores() {
        // The map is initialized in the constructor
        this.scores = new HashMap<>();
    }
    // The addScore method is used to add a cricketer and their score to the map

    public void addScore(String cricketer, int score) {
        // The put method is used to add a key-value pair to the map
        this.scores.put(cricketer, score);
    }

    public Integer getScore(String cricketer) {
        // The get method is used to retrieve the value associated with a key
        return this.scores.get(cricketer);
    }

    public static void main(String[] args) {
        // An instance of the CricketScores class is created
        CricketScores cricketScores = new CricketScores();

        // A cricketer and their score is added to the map

        cricketScores.addScore("Cricketer1", 100);
        cricketScores.addScore("Cricketer2", 150);
        cricketScores.addScore("Cricketer3", 200);

        System.out.println("Score of Cricketer1: " + cricketScores.getScore("Cricketer1"));
        System.out.println("Score of Cricketer2: " + cricketScores.getScore("Cricketer2"));
        System.out.println("Score of Cricketer3: " + cricketScores.getScore("Cricketer3"));
    }
}