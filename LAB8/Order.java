package LAB8;
/**
 * this is an Order class
 * @author dilara mandıracı
 */
public class Order {
    public static int count = 0;
    private int id;
    private Food orderedFood;
    private double portion;
    private double totalPrice;
    public boolean isFree;
    
    /**
     * takes name and price so that create a new food objects whic represents ordered food.
     * @param aPortion portion of food
     * @param aName name of food object
     * @param aPrice price of food object
     */
    public Order(double aPortion, String aName, double aPrice)
    {
        this.portion = aPortion;
        this.orderedFood = new Food (aName, aPrice);
        this.addOrder();
        totalPrice = 0.0;
    }

    /**
     * constructs order object by taking portion and object food of ordered food.
     * @param aPortion portion of the order
     * @param anOrderFood ordered food object
     */
    public Order(double aPortion, Food anOrderFood)
    {
        this.portion = aPortion;
        this.orderedFood = anOrderFood;
        this.addOrder();
        totalPrice = 0.0;
    }

    /**
     * get counts
     * @return
     */
    public static int getCount() {
        return count;
    }

    /**
     * sets count
     * @param count
     */
    public static void setCount(int count) {
        Order.count = count;
    }
    /**
     * gets id
     */
    public int getId() {
        return id;
    }
    /**
     * sets id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * gets ordered food
     * @return
     */
    public Food getOrderedFood() {
        return orderedFood;
    }
    /**
     * sets ordered food
     * @param orderedFood
     */
    public void setOrderedFood(Food orderedFood) {
        this.orderedFood = orderedFood;
    }
    /**
     * gets portion
     * @return
     */
    public double getPortion() {
        return portion;
    }
    /**
     * sets portion
     * @param portion
     */
    public void setPortion(double portion) {
        this.portion = portion;
    }
    /**
     * gets total price
     * @return
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    /**
     * sets total price
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public boolean getIsFree()
    {
        return isFree;
    }
    /**
     * adds new order
     */
    public void addOrder()
    {
        this.id = count;
        count++;
    }
    /**
     * checks if new orders id equals the current id
     * @param anOrder
     * @return
     */ 
    public boolean equals(Order anOrder)
    {
        return this.id == anOrder.id;
    }
    /**
     * adds price to total price
     */
    public void checkout()
    {
        this.totalPrice = this.portion * orderedFood.getPrice();
        if (totalPrice == 0.0 && !isFree)
        {
            System.out.println(">> Warning: This order is incomplete."); 
        }
    }
    /**
     * increases portion
     * @param extraPortion
     */
    public void increasePortion(int extraPortion)
    {
        this.portion += extraPortion;
    }
    
    public String toString()
    {
        return "Details for Order " + this.id + " :\n" 
            + orderedFood.getName() + " (x" + this.portion + ")\n" 
                + "TOTAL: " + this.totalPrice +"\n";
    } 
}
