import java.util.*;
class Sol
{
    static String string(int c, char d)
    {
        String s = "";
        for(int i = 0; i < c; i++)
        {
            s += d;
        }
        return s;
    }
    static String next_balanced_sequence(String s)
    {
        String next = "-1";
	    int length = s.length();
	    int depth = 0;
	    for (int i = length - 1; i >= 0; --i)
        {
            if (s.charAt(i) == '(')
            {
                depth--;
            }
            else
			{
                depth++;
            }
            if (s.charAt(i) == '(' && depth > 0)
            {
                depth--;
			    int open = (length - i - 1 - depth) / 2;
			    int close = length - i - 1 - open;
			    next = s.substring(0, i) + ')'
				+ string(open, '(')
				+ string(close, ')');
			    break;
            }
	    }
	    return next;
    }
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        s=sc.nextLine();
        if(length(s)%2==0)
        {
            System.out.println(next_balanced_sequence(s));
        }
        else
        {
            System.out.println("generatte even sequen only");
        }
    }
}