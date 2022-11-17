package LAB7;
/**
 * ths class has a objest "trainer"
 * @author Dilara Mandıracı
 */
public class Trainer {
    private String trainerName;
    private String speciality;
    private Boolean isPLayerCovid;
    private String lastTestDate;
    private String injuryStatus;
    private Player player;

    /**
     * this is a constructor method that initilazes variables
     * @param aName trainers name
     * @param aSpeciality trainer speciality
     * @param aPlayer a player which the trainer will take care
     */
    public Trainer (String aName, String aSpeciality, Player aPlayer)
    {
        this.trainerName = aName;
        this.speciality = aSpeciality;
        this.player = aPlayer;
        this.isPLayerCovid = true;
        this.lastTestDate = null;
        this.isPLayerCovid = false;
    }

    //ACCESSOR METHODS
    /**
     * gives accessibility to 
     * @return trainers name
     */
    public String getTrainerName()
    {
        return this.trainerName;
    }

    /**
     * gives accessibility to 
     * @return trainer's speciality
     */
    public String getSpeciality()
    {
        return this.speciality;
    }

    /**
     * gives accessibility to 
     * @return player's injury status
     */
    public String getInjuryStatus()
    {
        return this.injuryStatus;
    }

    /**
     * gives accessibility to
     * @return player's last test date 
     */
    public String getLastTestDate()
    {
        return this.lastTestDate;
    }

    /**
     * gives accessibility to
     * @return player's covid status
     */
    public boolean getIsPlayerCovid()
    {
        return this.isPLayerCovid;
    }

    /**
     * gives players info
     * @return player informaiton from player class
     */
    public Player getPlayer()
    {
        return this.player;
    }

    //METHODS
    /**
     * records last coiv test date and last status
     * @param isCovid
     * @param testDate
     */
    public void recordCovidTest(boolean isCovid, String testDate)
    {
        this.lastTestDate = testDate;
        this.isPLayerCovid = isCovid;
    }

    /**
     * updates injury status
     * @param updatedInjuryStatus
     */
    public void updateInjuryStatus(String updatedInjuryStatus)
    {
        this.injuryStatus = updatedInjuryStatus;
    }

    /**
     * prints trainer
     */
    public String toString()
    {
        if (this.injuryStatus == null)
        {
            this.injuryStatus = "Healthy";
        }
        return "**********************************\nTrainer Name: " + getTrainerName() +"\nTrainer Speciality: " + this.speciality 
                + "\nPlayer Name: " + this.player.getName()+ "\nIs COVID-19 positive?: " + this.isPLayerCovid + "\nLast test date: " 
                    + this.lastTestDate + "\nInjury status: " + this.injuryStatus + "\n**********************************";

    }
}
