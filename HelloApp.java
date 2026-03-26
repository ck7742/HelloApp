/**
 * UC2: Display "Hello" with Command-Line Argument
 *  @author CharanRam
 * @version 2
 */
public class HelloApp
{
    
    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            System.out.println("Hello " + args[0]);
        } else
        {
            System.out.println("Hello");
        }
    }
}
