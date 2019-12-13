package ca.homedepot.customerreview.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


public class Validator {
	static List<String> crushList=new ArrayList<String>(Arrays.asList("Ship","Miss","Duck","Punt",
			"Rooster","Mother","Bits"));
	
	public static boolean validateNegativeValue( Double value)
	{
		if(value< 0)
			return true;
		return false;
		
	}
	public static boolean validateCrushWord(String comment)
	{
		return crushList.parallelStream().anyMatch(u-> comment.toLowerCase().contains(u.toLowerCase()));
		
	}
}
