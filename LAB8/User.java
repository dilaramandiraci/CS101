package LAB8;
/**
 * this is a user class
 * @author dilara mandıracı
 */
import java.util.Random;

public class User {
    private static int count = 0;

    private int id;
    private String name;
    private int age;
    private String orders;
    private int numberOfOrders;
    private String eatenFoods;
    private Food favoriteFood;
    

    /**
     * takes name and age asa parameters and costructs a user
     * @param aName
     * @param anAge
     */
    public User(String aName, int anAge)
    {
        this.name = aName;
        this.age = anAge;
        this.addUser(); //increments count and assign an ID
        this.orders = null;
        this.numberOfOrders = 0;
        this.eatenFoods = null;
    }
    
    /**
     * adds user and assigns an id
     */
    public void addUser()
    {
        this.id = count;
        count++;
    }

    //ACCESSOR METHODS
    /**
     * gets id
     * @return
     */
    public int getId()
    {
        return this.id;
    }
    /**
     * gets name
     * @return
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * gets age
     * @return
     */
    public int getAge()
    {
        return this.age;
    }
    /**
     * gets orders
     * @return
     */
    public String getOrders()
    {
        return this.orders;
    }
    /**
     * gets number of orders
     * @return
     */
    public int getNumberOfOrders()
    {
        return this.numberOfOrders;
    }
    /**
     * gets eaten foods
     * @return
     */
    public String getEatenFoods()
    {
        return this.eatenFoods;
    }
    /**
     * gets count
     * @return
     */
    public int getCount()
    {
        return count;
    }
    /**
     * gets favorite foods
     * @return
     */
    public Food getFavoriteFood()
    {
        return this.favoriteFood;
    }

    //MUTATOR METHODS
    /**
     * sets mnew name
     * @param newName
     */
    public void setName (String newName)
    {
        this.name = newName;
    }
    /**
     * sets an id
     * @param newId
     */
    public void setId (int newId)
    {
        this.id = newId;
    }
    /**
     * sets a new age
     * @param newAge
     */
    public void setAge (int newAge)
    {
        this.age = newAge;
    }
    /**
     * sets orders
     * @param newOrder
     */
    public void setOrders (String newOrder)
    {
        this.orders = this.orders + "-" + newOrder;
    }
    /**
     * sets the number of orders
     * @param aNumberOfOrders
     */
    public void setNumberOfOrders (int aNumberOfOrders)
    {
        this.numberOfOrders = aNumberOfOrders;
    }
    /**
     * sets eaten foods
     * @param newEatenFood
     */
    public void setEatenFoods (String newEatenFood)
    {
        this.eatenFoods = this.eatenFoods + "-" + newEatenFood;
    }
    /**
     * sets favorte foods
     * @param aFood
     */
    public void setFavoriteFood(Food aFood)
    {
        this.favoriteFood = aFood;
    }

    //OTHER METHODS
    /**
     * checks if new user is equals with current user
     * @param aUser
     * @return
     */
    public boolean equals (User aUser)
    {
        return this.id == aUser.id && this.name == aUser.name && this.age == aUser.age;        
    }
    /**
     * checcks if user eat this food before
     * @param aFood
     * @return
     */
    public boolean didEatFood (Food aFood)
    {
        return this.eatenFoods.contains(aFood.getName());
    }
    /**
     * picks order by index
     * @param index
     * @return
     */
    public String pickOrderbyIndex(int index)
    {
        int count = 0;
        int prevOccurance = 0;
        int currentOccurance = 0;
        while (count < index )
        {
            if(count == 0)
            {
                prevOccurance = orders.indexOf("-");
                count++; 
                currentOccurance = orders.indexOf("-", prevOccurance);
                count++;
            }
            else
            {
                prevOccurance = currentOccurance;
                currentOccurance = orders.indexOf("-", prevOccurance);
                count++;
            }
        }
        return orders.substring(prevOccurance, currentOccurance);
        
        

    }
    /**
     * adds new order and checks if user is lucky enought to get his/her favorite food free
     * @param anOrder
     */
    public void addNewOrder(Order anOrder)
    {
        System.out.println("Adding a new order of " + getFavoriteFood().getName() + " to " + this.name);
        this.orders = this.orders + "-" + anOrder;
        this.numberOfOrders++;
        this.eatenFoods = this.eatenFoods + anOrder;
        if (this.favoriteFood.equals(anOrder.getOrderedFood()))
        {
            System.out.println(getFavoriteFood().getName() + " is " + this.name + "'s favorite food!");
            Random pickerWheel = new Random();
            double luckyNumber = pickerWheel.nextInt(0,10); 
            if (luckyNumber < 5)
            {
                anOrder.isFree = true;
                System.out.println();
                anOrder.getOrderedFood().setPrice(0);
                System.out.println("You are lucky today! You won't pay any money. Bon Appettite!!!");
            }
            else
            {
                anOrder.isFree = false;
                System.out.println(this.name + " lost the chance.");
            }

        }

    }

    public String toString()
    {
        return "**************************************\nUser ID: " + this.id + ", User Name: " + this.name 
            + ", Age: " + this.age + "\n" + this.name + " made " + count + " orders.";
    }

}
