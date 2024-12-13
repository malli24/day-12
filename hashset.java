import java.util.*;
class hashset
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("Malli");
        a.add("mahesh");
        a.add("renukaa");
        a.add("gowthami");
        a.add("venktramana");
        //Iterator
        for(String s:a)
        {
            System.out.println(s+" ");
        }
    }
}