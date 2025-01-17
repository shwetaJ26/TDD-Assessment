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
        List<Integer> list = Arrays.stream(string.split("[,\\n\\r]+")) // Split by comma, newline, or carriage return
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return list.stream().reduce(Integer::sum).orElseThrow();
    }
    return 0; // Return 0 if the string is empty or null
}

public static int checkdelimiter(String string) {
    if (string == null || string.isEmpty()) {
        return 0;
    }

    // Check if custom delimiter is defined at the start of the string
    if (string.startsWith("//")) {
        String delimiterSection = string.substring(2, string.indexOf('\n'));
        String delimiter = delimiterSection.equals(";") ? ";" : ",|\n"; // Default delimiter is comma or newline

        return Arrays.stream(string.split(delimiter))
                     .mapToInt(Integer::parseInt)
                     .sum();
    }

    // If no custom delimiter, use default delimiters
    return Arrays.stream(string.split(",|\n"))
                 .mapToInt(Integer::parseInt)
                 .sum();
}

}

