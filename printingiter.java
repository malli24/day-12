import java.util.*;
class printingiter
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("Malli");
        a.add("mahesh");
        a.add("renukaa");
        a.add("gowthami");
        a.add("venktramana");
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}