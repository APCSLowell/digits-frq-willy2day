import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	digitList = new ArrayList <Integer>();
	    for (int i=num; i>0;i/10){
		    digitList.add(num%10);
		    
	    }
		returns digitList;
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for (int i=0; i<digitList.size(); i++){
			if (digitList.get(i)>digitList.get(i+1))
				return false;
	
		}
	return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
