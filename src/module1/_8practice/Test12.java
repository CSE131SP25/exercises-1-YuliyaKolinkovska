package module1._8practice;

public class Test12
{
    public static void main(String[] args)
    {
       // Your code should use the variables
       // secondsInDay and secondsInThreeDays
       // and print out secondsInThreeDays
int secondsInMin = 60; 
int minInHour = 60; 
int hourInDay= 24; 
int secondsInDay = (secondsInMin * minInHour * hourInDay);
int secondsInThreeDays = (secondsInDay * 3);
System.out.println(secondsInThreeDays);
    }
}
