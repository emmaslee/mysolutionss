
/**
 * Emma Lee
 * Sept 12 2023
 */
public class MySolutions
{
    double c=5;
    double f;
    
    int hours = 10 ;
    int minutes = 30  ;
    int seconds = 30;
    
    
    
    int secondsSinceMidnight;
    int secondsRemaining;
    int percentOfDayPassed;
    
    int secs;
    
    public void celsiusToFarenheit() {
        f = c * 1.8 + 32;
        System.out.println(c + " °C = " + f + " °F");
    }
    
    public void elapsedTime() {
        secondsSinceMidnight = (hours * 3600)+(minutes * 60)+seconds;
        System.out.println(" The current time is " + hours + ". It has been " + secondsSinceMidnight + " seconds since the day began." );
        secondsRemaining = 86400 - secondsSinceMidnight;
        System.out.println("There are " + secondsRemaining + " seconds left in the day.");
        percentOfDayPassed = secondsSinceMidnight*100/86400;
        System.out.println("The day is " + percentOfDayPassed + "% done.");
    }
    
    public void secondToHMS() {
        seconds = 5000;
        int hour = seconds/3600;
        int minute = (seconds%3600)/60;
        int second = (seconds%3600)-(minute*60);
        System.out.println(seconds + " seconds" + "= " + hour + " hours: " + minute + " minutes: " + second + " seconds");
    }
    
}
