package LAB7;
/**
 * this is a class for nba players
 * @author Dilara Mandıracı
 */
public class Player {
    private static int count = 0;
    private static int allCount = 0;

    private int id;
    private String name;
    private String position;
    private String team;
    private int rosterNumber;
    private boolean isActive;
    private double gamesPlayed, pointsPerGames, assistsPerGames, reboundsPerGame, turnoversPerGames;
    private int points, assists, rebounds,turnovers;
    private double efficiency;

    /**
     * Constructor Method initilazes variables
     * @param aName name of player
     * @param aPosition Position of player
     * @param aTeam team of player
     * @param aRosterNumber The jersey number that the player currently wears
     */
    public Player(String aName, String aPosition, String aTeam, int aRosterNumber)
    {
        this.name = aName;
        this.position = aPosition;
        this.team = aTeam;
        this.rosterNumber = aRosterNumber;
        this.register();
    }

    //ACCESSOR METHODS
    /**
     * gives accessibility to name
     * @return name of player
     */
    public String getName ()
    {
        return this.name ;
    }

    /**
     * gives accessibility to id
     * @return id of player
     */
    public int getId ()
    {
        return this.id;
    }

    /**
     * gives accessibility to position
     * @return position of player
     */
    public String getPosition()
    {
        return this.position;
    }

    /**
     * gives accessibility to jersey number
     * @return roster number of player
     */
    public int getRosterNumber()
    {
        return this.rosterNumber;
    } 

    /**
     * gives accessibility to activity status
     * @return the activity status of player
     */
    public boolean getIsActive()
    {
        return this.isActive;
    }

    //SETTER METHODS

    /**
     * sets new name to the player
     * @param newName new name that is going to be setted
     */
    public void setName (String newName)
    {
        this.name = newName;
    }

    /**
     * sets new position to the player
     * @param newPosition that is going to be setted
     */
    public void setPosition(String newPosition) 
    {
        if (newPosition == "SF" ||newPosition == "PF" ||newPosition == "SG" || newPosition =="PG" || newPosition =="C")
        {
            this.position = newPosition;
        }
        else
        {
            System.out.println("Error"); 
        }  
    }

    /**
     * sets new position to the player
     * @param newRosterNumber that is going to be setted
     * @return new roster number
     */
    public int setRosterNumber(int newRosterNumber) 
    {
        return this.rosterNumber = newRosterNumber;    
    }

    /**
     * register method for registering new player with count, activity status, and id
     */
    public void register() 
    {
        this.isActive = true;
        count++;
        allCount++;
        this.id = allCount;
    }

    /**
     * changes activity status
     */
    public void retire() 
    {
        if(this.isActive == true)
        {
            count--;
            this.isActive = false;
        }
    }

    /**
     * changes the current team if the input is valid
     * @param newTeam the team that will be changed with the old one
     */
    public void transfer(String newTeam)
    {
        if (this.team != newTeam)
        {
            this.team = newTeam;
        }
        else
        {
            System.out.println("Invalid Transfer");
        }
    }

    /**
     * removes the player from nba 
     */
    public void remove()
    {
        count--;
    }

    /**
     * checks payers order (lexicographically before)
     * @param otherPlayer compare with other player
     * @return is before than or not
     */
    public boolean isBeforeThan(Player otherPlayer)
    {
        return this.name.compareTo(otherPlayer.name) < 0;
    }

    /**
     *  records new game stats
     * @param aPoints at one game
     * @param aAssists at one game
     * @param aRebounds at one game
     * @param aTurnovers at one game
     */
    public void recordGame (int aPoints, int aAssists, int aRebounds, int aTurnovers)
    {
        this.gamesPlayed = this.gamesPlayed + 1;
        this.points = this.points + aPoints;
        this.assists = this.assists + aAssists;
        this.rebounds = this.rebounds + aRebounds;
        this.turnovers = this.turnovers + aTurnovers;
        this.pointsPerGames =  this.points/gamesPlayed;
        this.assistsPerGames = this.assists/gamesPlayed;
        this.reboundsPerGame =  this.rebounds/gamesPlayed;
        this.turnoversPerGames = this.turnovers/gamesPlayed;
        
        this.efficiency = 1.0 * this.pointsPerGames + 0.7 * this.assistsPerGames + 
        0.7 * this.reboundsPerGame - 0.9 * this.turnoversPerGames;
        
    }

    /**
     * access efficiency
     * @return
     */
    public double getEfficiency()
    {
        return efficiency;
        
    }

    /**
     * determines which one is efficient
     * @param otherPlayer
     * @return who is more efficient
     */
    public boolean isMoreEfficient(Player otherPlayer)
    {
        return this.getEfficiency() > otherPlayer.getEfficiency();
    }

    /**
     * printer method
     */
    public String toString()
    {
        
        String activitystatus = "Retired";
        if (this.isActive) 
        {
            activitystatus = "Active";
        }
        
        return "\n*************************************************\n"+"Player ID: " + this.id +"\nPlayer Name: " 
            + this.name + "\nPlayer Position: " + this.position
                + "\nCurrent Team: " + this.team + "\nJersey Number: " 
                    + this.rosterNumber + "\n*************************************************\nStats: " 
                        + "\nPPG: " + this.pointsPerGames + "\nAPG: " + this.assistsPerGames + "\nRPG: " + this.reboundsPerGame
                            + "\nTPG: " + this.turnoversPerGames + "\nEfficiency: " + this.getEfficiency() 
                                +"\n*************************************************\n"
                                    + "Retirement Status: " + activitystatus + " among " + count + " active player(s)";                    
    }
}