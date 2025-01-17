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

public static int nonewline(String string) {
    if (string != null && !string.isEmpty()) {
        List<Integer> list = Arrays.stream(string.split("[,\\n\\r]+")) 
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return list.stream().reduce(Integer::sum).orElseThrow();
    }
    return 0; 
}

public static int checkdelimiter(String string) {
	   if (string == null || string.isEmpty()) {
           return 0;
       }

       if (string.startsWith("//")) {
           String delimiterSection = string.substring(2, string.indexOf('\n'));
           String delimiter = delimiterSection;
           
           string = string.substring(string.indexOf('\n') + 1);

           return Arrays.stream(string.split(delimiter))
                        .mapToInt(Integer::parseInt)
                        .sum();
       }

       return Arrays.stream(string.split(",|\n"))
                    .mapToInt(Integer::parseInt)
                    .sum();
   }

public static void negatives(String string) {
    StringBuilder sb = new StringBuilder();
    Arrays.stream(string.strip()
        .split(","))
        .mapToInt(Integer::parseInt) 
        .filter(num -> num < 0) 
        .forEach(num -> sb.append(num).append(","));
    
    if (sb.length() > 0) {
        sb.setLength(sb.length() - 1);
        throw new RuntimeException("Negatives are not allowed: " + sb.toString());
    }
}
}


