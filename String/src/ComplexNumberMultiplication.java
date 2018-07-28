
public class ComplexNumberMultiplication {
	/**
	 * #537
	 * Example 1:
		Input: "1+1i", "1+1i"
		Output: "0+2i"
		Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
	   Example 2:
		Input: "1+-1i", "1+-1i"
		Output: "0+-2i"
		Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
	 * 
	 */
	public String complexNumberMultiply(String a, String b) {
        String sb="";
        String[] first = a.split("\\+");
        String[] second = b.split("\\+");
        int a1 = Integer.parseInt(first[0]);
        int b1 = Integer.parseInt(second[0]);
        int a2 = Integer.parseInt(first[1].substring(0,first[1].length()-1));
        int b2 = Integer.parseInt(second[1].substring(0,second[1].length()-1));
        sb+=(a1*b1-a2*b2)+"";
        sb+="+"+(a1*b2+a2*b1)+"i";
        return sb;
    }
/**
 *  Two things to notice here:
 *  1 symbol needs to use "//" to split
 *  2 Integer.parseInt to parse string to integer.
 */
}
