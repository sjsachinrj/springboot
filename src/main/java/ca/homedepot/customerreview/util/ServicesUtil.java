package ca.homedepot.customerreview.util;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.List;


public class ServicesUtil
{

	private static void validateParameterNotNull(Object parameter, String nullMessage)
	{
		Preconditions.checkArgument(parameter != null, nullMessage);
	}	

	public static void validateParameterNotNullStandardMessage(String param, Object value)
	{
		validateParameterNotNull(value, "Parameter " + param + " cannot be null");
	}
	
    
}
