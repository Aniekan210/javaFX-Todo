import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

/**
 * Write a description of class Date here.
 *
 * @author Alamin Adeleke, Aniekan Ekarika
 * @version 28/1/2025
 **/
public class Date extends StackPane
{
    // instance variables - replace the example below with your own
    protected int day;
    protected int month;
    protected Text dateString;
    protected final String[] monthName= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    //protected int[] date/* = {day, month}*/;

    //Feb 14th default
    public Date()
    {
        // initialise instance variables
        this.day = 14;
        this.month = 2;
        
        dateString = new Text(this.toString());
        this.setMargin(dateString, new Insets(8,8,8,8));
        this.getChildren().addAll(dateString);
    }
    
    public void setDate(int day, int month)
    {
        this.day = day;
        this.month = month;
        
        dateString.setText(this.toString());
    }
    
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
        // Jan 2nd
    }
}
