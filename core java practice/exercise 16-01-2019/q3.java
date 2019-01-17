public class q3{
public static void main(String[] args)
{
int no = Integer.parseInt(args[0]);
boolean isprime = true;

for(int i = 2; i<= Math.sqrt(no); i++)
{
  if(no%i == 0)
  {
   isprime =  false;
   break;
  }
}

if(isprime)
	System.out.println("yes");
else
	System.out.println("no");
}
}