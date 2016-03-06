package AssignmentTp3;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App
{
    public double calculateFloat(double a, double b)
    {
        return a + b;
    }
    public  int calInteger(int num1,int num2)
    {
        return num1+num2;
    }
    public String displayOblectIdentity()
    {
        return "Encore";
    }
    public String displayt()
    {
        return "Encore";
    }
    public static ArrayList notNullFunction(int b)
    {
        ArrayList list;

        if(b==0)
        {
            list=new ArrayList();
            list.add(b);
        }
        else
        {
            list =null;
        }
        return list;
    }
    public static ArrayList nullFunction(int b) {
        ArrayList list;
        if(b==0)
        {
            list=new ArrayList();
        }
        else
            list=null;

        return list;
    }
    public boolean failMessage(int a, int b) {
        if(a>b) {
            return true;
        }
        else
            return false;
    }
    public  int time(int number) {

        while(number==1)
        {
            number=1;
        }
        return 2;
    }
    public  int exception(int num1,int num2) {

        return num1/num2;
    }
    public boolean ObjectEquality(int num1,int num2)
    {
        if(num1==num2)
        {
            return true;
        }
        else
            return false;
    }

    /*public void exceptionTest()
    {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }
    public String disable()
    {
        return "I am disabling";
    }*/

}