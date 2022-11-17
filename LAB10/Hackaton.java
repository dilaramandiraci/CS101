package LAB10;

public class Hackaton {
    private final static int MAX_NO_OF_PROJECTS = 6;
    private final static int INDICATOR_COUNT=4;
    private final static int[] INDICATOR_WEIGHTS = {10,25,30,35};
    private int projectCounts;
    private Project[] projects;

    public Project[] getProjects() {
        return projects;
    }
    public Hackaton()
    {
        projectCounts=0;
        this.projects = new Project[MAX_NO_OF_PROJECTS];
    }
    
    public static int getMaxNoOfProjects() {
        return MAX_NO_OF_PROJECTS;
    }

    public static int getIndicatorCount() {
        return INDICATOR_COUNT;
    }

    public static int[] getIndicatorWeights() {
        return INDICATOR_WEIGHTS;
    }

    public void addProject(Project aProject)
    {
        this.projects[projectCounts] = aProject;
        projectCounts++;
        aProject.setHackaton();
    }
/*     public void setProjects(Project[] projects) {
        this.projects = projects;
    } */

    public String toString(int scoreType)
    {
        if (scoreType == 0 )
        {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s", "Project ID", "Indicator 1", "Indicator 2", "Indicator 3" ,"Indicator 4");
            System.out.println();
        }

        if (scoreType == 1)
        {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s", "Project ID", "Indicator 1", "Indicator 2", "Indicator 3" ,"Indicator 4");
            System.out.println();
        }

        if (scoreType == 2)
        {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-20s", "Project ID", "Indicator 1", "Indicator 2", "Indicator 3" ,"Indicator 4" ,"Weighted Mean", "Segment", "Credibility\n");
            System.out.println();
        }
        System.out.println(projects[0].toString(scoreType));
        System.out.println(projects[1].toString(scoreType));
        System.out.println(projects[2].toString(scoreType));
        System.out.println(projects[3].toString(scoreType));
        System.out.println(projects[4].toString(scoreType));
        System.out.println(projects[5].toString(scoreType));;
        String str = "";
        return str;
    }

    public static void main(String[] args) {
        Hackaton newHackaton = new Hackaton();

        int[] rawScoresProject1 = new int[] {100, 240, 15, 26};
        Project project1 = new Project("A1", rawScoresProject1);
        newHackaton.addProject(project1);

        int[] rawScoresProject2 = new int[] {20, 407, 13, 11};
        Project project2 = new Project("A2" , rawScoresProject2);
        newHackaton.addProject(project2);

        int[] rawScoresProject3 = new int[] {100, 281, 13, 39};
        Project project3 = new Project("A3", rawScoresProject3);
        newHackaton.addProject(project3);

        int[] rawScoresProject4 = new int[] {80, 1264, 4, 38};
        Project project4 = new Project("A4", rawScoresProject4);
        newHackaton.addProject(project4);

        int[] rawScoresProject5 = new int[] {20, 1020, 12, 11};
        Project project5 = new Project("A5", rawScoresProject5);
        newHackaton.addProject(project5);

        int[] rawScoresProject6 = new int[] {100, 1162, 17, 34};
        Project project6 = new Project("A6", rawScoresProject6);
        newHackaton.addProject(project6);
        
        System.out.println();
        System.out.println("Initial Table: ");
        System.out.println("*".repeat(75));
        System.out.println(newHackaton.toString(0));


        project1.calcModifiedScores();
        project2.calcModifiedScores();
        project3.calcModifiedScores();
        project4.calcModifiedScores();
        project5.calcModifiedScores();
        project6.calcModifiedScores();
        System.out.println("Modified Table: ");
        System.out.println("*".repeat(75));
        System.out.println(newHackaton.toString(1));

        project1.calcWeightAvg();
        project2.calcWeightAvg();
        project3.calcWeightAvg();
        project4.calcWeightAvg();
        project5.calcWeightAvg();
        project6.calcWeightAvg();

        project1.calcSegment();
        project2.calcSegment();
        project3.calcSegment();
        project4.calcSegment();
        project5.calcSegment();
        project6.calcSegment();

        project1.calcCredibility();
        project2.calcCredibility();
        project3.calcCredibility();
        project4.calcCredibility();
        project5.calcCredibility();
        project6.calcCredibility();

        project1.getFinalScore();
        project2.getFinalScore();
        project3.getFinalScore();
        project4.getFinalScore();
        project5.getFinalScore();
        project6.getFinalScore();

        System.out.println("Final Table: ");
        System.out.println("*".repeat(123));
        System.out.println(newHackaton.toString(2));  
    }

}

