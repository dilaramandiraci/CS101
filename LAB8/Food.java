package LAB8;
/**
 * this is a food class
 * @user Dilara MANDIRACI
 */
public class Food {
    private String name;
    private String ingredients;
    private int calories;
    private String type;
    private double price;

    public Food(String aName, double aPrice)
    {
        this.name = aName;
        this.price = aPrice;
        this.ingredients = null;
        this.calories = 0;
        this.type = null;
    }
    public Food(String aName, String ingredients, int caloriesOfFood, String aType, double aPrice)
    {
        this.name = aName;
        this.ingredients = ingredients;
        this.calories = caloriesOfFood;
        this.type = aType;
        this.price = aPrice;
    }

    //ACCESSOR METHODS
    /**
     * gets name
     * @return
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * gets ingredients
     * @return
     */
    public String getIngredients()
    {
        return this.ingredients;
    }
    /**
     * gets calories
     * @return
     */
    public int getCalories()
    {
        return this.calories;
    }
    /**
     * gets type 
     * @return
     */
    public String getType()
    {
        return this.type;
    }
    /**
     * gets price
     * @return
     */
    public double getPrice()
    {
        return this.price;
    }

    //MUTATOR METHODS
    /**
     * sets new name 
     * @param aName
     */
    public void setName(String aName)
    {
        this.name = aName;
    }
    /**
     * sets new calories
     * @param aCalories
     */
    public void setCalories(int aCalories)
    {
        this.calories = aCalories;
    }
    /**
     * sets new type 
     * @param aType
     */
    public void setType (String aType)
    {
        this.type = aType;
    }
    /**
     * sets price
     * @param aPrice
     */
    public void setPrice(double aPrice)
    {
        this.price = aPrice;
    }
    /**
     * sets new ingredients
     * @param anIngredient
     */
    public void setIngredients(String anIngredient)
    {
        this.ingredients = anIngredient;
    }

    //OTHER METHODS

    /**
     *  checks if they are equal
     * @param food
     * @return if equals returns true
     */
    public boolean equals(Food food)
    {
        return this.name == food.name && this.ingredients == food.ingredients;
    }
    /**
     * adds new ingredients
     * @param newIngredient
     */
    public void addNewIngredients(String newIngredient)
    {
        this.ingredients = this.ingredients + newIngredient;
    }
    /**
     * checks if food contains an ingredient
     * @param ingredient
     * @return
     */
    public boolean doesContain(String ingredient)
    {
        return this.ingredients.contains(ingredient);
    }
    public String toString()
    {
        return "***************************************************\n"
            +this.name + " is a " + this.type + " dish.\nIt includes " + this.ingredients + ".\n"
                +"Single portion contains " + this.calories + " calories.\n" 
                    +"Single serving cost = " + this.price + ".";
    }
}
