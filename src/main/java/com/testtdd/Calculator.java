package com.testtdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator
{
	public static int add(String string)
    {
		
		return 0;
		
	}
	




public static int addMultipleNo(String string) {
    if (string != null && !string.isEmpty()) {
        if (!string.contains(",")) {
            return Integer.parseInt(string);
        }

        List<Integer> list = Arrays.stream(string.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return list.stream().reduce(Integer::sum).orElseThrow();
    }
    return 0; 
}

}

