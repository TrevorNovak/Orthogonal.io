package orthonormal.util;

import java.util.Scanner;

/**
 * 3x + 4y + 0z = 10 x + 0y + 3z = 34 0x - 3y - 2z = 3
 * 
 * 
 * @author Trevor Novak
 *
 */

public class Parser
{
    private int numEquations;
    private char[] validCharacters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
	    'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
	    't', 'u', 'v', 'w', 'x', 'y', 'z', '=', '-', '+', '^', '_' };
    private String[] equations = {};

    public Parser()
    {

    }

    public static void main(String[] args)
    {
	Parser parser = new Parser();
	parser.scrape();

	// String[] equations = parser.getEquations();

	// System.out.println(equations[0]);
    }

    public String[] getEquations()
    {
	return this.equations;
    }

    public void parse()
    {
	scrape();
	  condense("");
	  validate("");
	
	
    }

    /**
     * Reads user input from system.in, storing each line as an equation in an
     * array called equations.
     * 
     */
    public void scrape()
    {
	retrieve();
    }

    private void retrieve()
    {
	//String line;
	Scanner scan;
	int index;
	
	
    }
    
    private void orphan()
    {

	String line;
	Scanner scan;
	int index;

	
	
	
	
	System.out.println("Enter your system: ");
	line = scan.nextLine();

	index = 0;
	while (index < numEquations && scan.hasNextLine())
	{
	    line = condense(line);
	    System.out.println(line);
	    boolean isValid = validate(line);
	    System.out.println(line);
	    System.out.println(isValid);

	    if (isValid == true)
	    {
		equations[index] = line;
		index++;
		line = scan.nextLine();
	    }
	    else
	    {
		line = scan.nextLine();
	    }
	}

	scan.close();
    }

    /**
     * Removes all whitespace from the equation. Called by validate().
     * 
     * @param equation
     *            a string representing an equation to trim().
     */
    private String condense(String equation)
    {
	return equation.replaceAll("\\s", "");
    }

    /**
     * Ensures the equation has been entered correctly by validating the
     * correctness of the mathematical sentence as well as ensuring all
     * characters are legal within the context of orthonormal.
     * 
     * @param equation
     *            a string representing an equation to be validated.
     * @return isValid is true if no errors are found and false if an error is
     *         found.
     * 
     */
    private boolean validate(String equation)
    {
	boolean isValid = true;

	char[] chars = equation.toCharArray();
	for (int i = 0; i < chars.length - 1; i++)
	{
	    System.out.println(chars[i]);
	    for (int j = 0; j < validCharacters.length - 1; j++)
	    {
		if (chars[i] != validCharacters[j])
		{
		    isValid = false;
		}
	    }
	}

	return isValid;

    }
}
