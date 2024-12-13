import java.util.*;
public class linkedlistlast
{
    public static void main(String[]args)
{
LinkedList<Integer>a=new LinkedList<>();
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
for(int i=0;i<size;i++)
{
    int s=sc.nextInt();
    a.addLast(s);
}
for(int i=0;i<size;i++)
System.out.print(a.get(i)+" ");
}
}