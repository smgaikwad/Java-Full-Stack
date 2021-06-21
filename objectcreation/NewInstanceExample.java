package objectcreation;

public class NewInstanceExample
{
    public static void main(String[] args)
    {
        try
        {
            Class cls = Class.forName("objectcreation.ForName");
            ForName obj = (ForName) cls.newInstance();
            System.out.println(obj);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}
class ForName
{
    int a = 10;

    @Override
    public String toString() {
        return "ForName{" +
                "a=" + a +
                '}';
    }
}
