import java.util.*;
public class ListManager {
    static List<String>removeElements(List<String>str,List<String>str1){
    	str.removeAll(str1);
    	return str;
    }
    public static void main(String[] args)
    {
    	List<String> str = new ArrayList<String>();
    	List<String> str1 = new ArrayList<String>();
    	str.add("Palak");
		str.add("Nayati");
		str.add("Pragati");
		str1.add("Soumya");
		List<String> res = removeElements(str,str1);
		System.out.println(res);
		
    	
    }
}
