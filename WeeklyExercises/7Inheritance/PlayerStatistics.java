import java.util.HashMap;
import java.util.Map;

abstract class PlayerStats {
    protected String playerName;
    protected int matchesPlayed;
    protected int goalsOrRunsScored;
    protected int assistsOrWicketsTaken;

    public PlayerStats(String playerName, int matchesPlayed, int goalsOrRunsScored, int assistsOrWicketsTaken) {
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.goalsOrRunsScored = goalsOrRunsScored;
        this.assistsOrWicketsTaken = assistsOrWicketsTaken;
    }

    public abstract double calculateAverage();

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getGoalsOrRunsScored() {
        return goalsOrRunsScored;
    }

    public void setGoalsOrRunsScored(int goalsOrRunsScored) {
        this.goalsOrRunsScored = goalsOrRunsScored;
    }

    public int getAssistsOrWicketsTaken() {
        return assistsOrWicketsTaken;
    }

    public void setAssistsOrWicketsTaken(int assistsOrWicketsTaken) {
        this.assistsOrWicketsTaken = assistsOrWicketsTaken;
    }
}

class FootballStats extends PlayerStats {
    public FootballStats(String playerName, int matchesPlayed, int goalsScored, int assists) {
        super(playerName, matchesPlayed, goalsScored, assists);
    }

    @Override
    public double calculateAverage() {
        if (matchesPlayed == 0) return 0;
        return (double) goalsOrRunsScored / matchesPlayed;
    }
}

class CricketStats extends PlayerStats {
    private int catches;

    public CricketStats(String playerName, int matchesPlayed, int runsScored, int wicketsTaken, int catches) {
        super(playerName, matchesPlayed, runsScored, wicketsTaken);
        this.catches = catches;
    }

    @Override
    public double calculateAverage() {
        if (matchesPlayed == 0) return 0;
        return (double) goalsOrRunsScored / matchesPlayed;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }
}

public class PlayerStatistics {
    public static void main(String[] args) {
        FootballStats footballPlayer = new FootballStats("Isaac Afrifa", 10, 8, 5);
        CricketStats cricketPlayer = new CricketStats("Jamal Abdullah", 15, 500, 20, 10);

        System.out.println("Football Player:");
        System.out.println("Name: " + footballPlayer.getPlayerName());
        System.out.println("Matches Played: " + footballPlayer.getMatchesPlayed());
        System.out.println("Goals Scored: " + footballPlayer.getGoalsOrRunsScored());
        System.out.println("Assists: " + footballPlayer.getAssistsOrWicketsTaken());
        System.out.println("Average Goals per Match: " + footballPlayer.calculateAverage());

        System.out.println("\nCricket Player:");
        System.out.println("Name: " + cricketPlayer.getPlayerName());
        System.out.println("Matches Played: " + cricketPlayer.getMatchesPlayed());
        System.out.println("Runs Scored: " + cricketPlayer.getGoalsOrRunsScored());
        System.out.println("Wickets Taken: " + cricketPlayer.getAssistsOrWicketsTaken());
        System.out.println("Catches: " + cricketPlayer.getCatches());
        System.out.println("Average Runs per Match: " + cricketPlayer.calculateAverage());
    }
}
