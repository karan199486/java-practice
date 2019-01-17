public class q4{
public static void main(String[] args)  // if passed string then it will give numberformatexception
{
  System.out.println(avg(args));
}

public static int avg(String... arr)
{
 int sum = 0;
  for(String str : arr)
  {
	sum += Integer.parseInt(str);
  }
   
return sum;
}
}