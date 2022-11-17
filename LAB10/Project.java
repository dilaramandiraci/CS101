package LAB10;

import java.util.Arrays;

public class Project {
    private final static int INITIAL = 0;
    private final static int MODIFIED = 1;
    private final static int FINAL = 2;
    private static int count;
    private String ID;
    private int finalScore;
    private String segments ;
    private String credibility;
    private int[]rawScores;
    private int[]modifiedScores;
    private Hackaton anHackaton;

    public Project(String anID, int[] rawScores)
    {
        this.ID = anID;
        this.rawScores = rawScores;
        this.credibility = "?";
        this.segments = "?";
        this.modifiedScores = Arrays.copyOf(rawScores, 4);
        this.anHackaton = getHackaton();
    }

    public static int getINITIAL() {
        return INITIAL;
    }
    public static int getMODIFIED() {
        return MODIFIED;
    }
    public static int getFINAL() {
        return FINAL;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Project.count = count;
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String iD) {
        this.ID = iD;
    }
    public int getFinalScore() {
        return this.finalScore;
    }
    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
    public String getSegments() {
        return segments;
    }
    public void setSegments(String segments) {
        this.segments = segments;
    }
    public String getCredibility() {
        return credibility;
    }
    public void setCredibility(String credibility) {
        this.credibility = credibility;
    }
    public int[] getRawScores(int i) {
        return rawScores;
    }
    public void setRawScores(int[] rawScores) {
        this.rawScores = rawScores;
    }
    public int[] getModifiedScores() {
        return modifiedScores;
    }
    public void setModifiedScores(int[] modifiedScores) {
        this.modifiedScores = modifiedScores;
    }
    public Hackaton getHackaton() {
        return anHackaton;
    }
    public void setHackaton() {
        this.anHackaton = new Hackaton();
    }    

    public void calcModifiedScores()
    {
        // score 1 is remains same 

        //score 2 changes based on these rules
        if (modifiedScores[1] <= 500 )
        {
            modifiedScores[1] = 20;
        }
        else if (modifiedScores[1] <= 1000)
        {
            modifiedScores[1] = 80;
        }
        else if (modifiedScores[1] > 1000)
        {
            modifiedScores[1] = 100;
        }

        //score 3 changes based on these rules
        if (modifiedScores[2] <= 6)
        {
            modifiedScores[2] = 100;
        }
        else if (modifiedScores[2] <= 12)
        {
            modifiedScores[2] = 80;
        }
        else if (modifiedScores[2] > 12)
        {
            modifiedScores[2] = 20;
        }

        //score 4 changes based on these rules
        if (modifiedScores[3] == 0)
        {
            modifiedScores[3] = 20;
        }
        if (modifiedScores[3] < 10)
        {
            modifiedScores[3] = 20;
        }
        if (modifiedScores[3] == 10)
        {
            modifiedScores[3] = 80;
        }
        else if (modifiedScores[3] < 15)
        {
            modifiedScores[3] = 80;
        }
        else if (modifiedScores[3] >= 15)
        {
            modifiedScores[3] = 100;
        }
    }

    public void calcWeightAvg()
    { 
        int nominator = 0;
        nominator += this.modifiedScores[0] * 10;
        nominator += this.modifiedScores[1] * 25;
        nominator += this.modifiedScores[2] * 30;
        nominator += this.modifiedScores[3] * 35;

        this.finalScore = nominator/100;
    }

    public void calcSegment()
    {
        if (this.finalScore == 100)
        {
            this.segments = "A+";
        }
        else if(this.finalScore >= 90)
        {
            this.segments = "A";
        }
        else if(this.finalScore >= 75)
        {
            this.segments = "B";
        }
        else if(this.finalScore >= 60)
        {
            this.segments = "C";
        }
        else if(this.finalScore >= 40)
        {
            this.segments = "D";
        }
    }

    public void calcCredibility()
    {
        if (this.segments.equals("A+"))
        {
            this.credibility = "Perfect";
        }
        if(this.segments.equals("A"))
        {
            this.credibility ="Very Good";
        }
        if(this.segments.equals("B"))
        {
            this.credibility = "Good";
        }
        if(this.segments.equals("C"))
        {
            this.credibility = "Considerable";
        }
        if(this.segments.equals("D"))
        {
            this.credibility = "Not Appropriate";
        }
    }

    public String toString(int scoreType)
    {
        String str = "";
        if (scoreType == getINITIAL())
        {
            return String.format("%-15s %-15d %-15d %-15d %-15d", getID(), rawScores[0] , rawScores[1] , rawScores[2] , rawScores[3]);
        }
        if (scoreType == getMODIFIED())
        {
            return String.format("%-15s %-15d %-15d %-15d %-15d", getID(), modifiedScores[0] , modifiedScores[1] , modifiedScores[2] , modifiedScores[3]);
        }
        if (scoreType == getFINAL())
        {
            str = String.format("%-15s %-15d %-15d %-15d %-15d %-15d %-15s %-20s", getID(), modifiedScores[0] , modifiedScores[1] , modifiedScores[2] , modifiedScores[3], this.finalScore, this.segments, this.credibility);
        }
       return str;
    } 
}

