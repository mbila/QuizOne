/**
 * Write a description of class QuizOne here.
 * 
 * @author Michael Bila
 * @version 2015.02.09
 */

public class QuizOne
{
    private int age;
    private int cost;
    private ClassB lastName;

    /**
     * Constructor for objects of class QuizOne
     */
    public QuizOne()
    {
        age = 0;
        cost = 0;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = new ClassB(lastName);
    }
    
    public void calculateTax(int tax)
    {
        //This variable is the tax amount, which then multiplies by the cost to get the final price.
        cost = tax * cost;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public String getLastName()
    {
        return lastName.getLastName();
    }
}
