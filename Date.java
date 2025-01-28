/**
 * Write a description of class Date here.
 *
 * @author Alamin Adeleke, Aniekan Ekarika
 * @version 28/1/2025
 **/
public class Date
{
    // instance variables - replace the example below with your own
    protected int day;
    protected int month;
    protected final String[] monthName= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    //protected int[] date/* = {day, month}*/;

    /**
     * Constructor for objects of class Date
     */
    public Date(int day, int month)
    {
        // initialise instance variables
        this.day = day;
        this.month = month;
    }

    /**
     * Accessor method o return the day and month as an array
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] returnDate()
    {
        //set the array
        int[] date = {day, month};
        return date;
    }
    
    /**
     * Accesor Methods
     *
     * @return    the day and month
     */
    public int returnDay() {return day;}
    public int returnMonth() {return month;}
    
    /**
     * Mutator Methods
     *
     * @param    integer to set it to
     */
    public void setDay(int day) {this.day = day;}
    public void setMonth(int month) {this.month = month;}
    
    public String toString()
    {
        //Create the String
        String text = "";
        //add the monthname according to the month value
        text += monthName[month-1];
        //add a space
        text += " ";
        //Add the day
        text += day;
        //epending on the last number of the day, add the appropriate suffix
        if((day%10 == 1) && (day != 11))
        {
            text += "st";
        }
        else if(day%10 == 2 && (day != 12))
        {
            text += "nd";
        }
        else if((day%10 == 3) && (day != 13))
        {
            text += "rd";
        }
        else
        {
            text += "th";
        }
        return text;
    }
}
