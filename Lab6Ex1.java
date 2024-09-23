package com.deloitte.lab6.ex1;
import java.util.*;

public class Lab6Ex1 {
	
	public static List<Object> getValues(HashMap<?, ?> map) {
        
        Collection<?> values = map.values();
        
        
        List<Object> valueList = new ArrayList<>(values);
        
        
        Collections.sort(valueList, Comparator.comparing(Object::toString));
        
        return valueList;
    }

    public static void main(String[] args) {
       
        HashMap<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("Apple", 10);
        exampleMap.put("Banana", 5);
        exampleMap.put("Cherry", 20);

        List<Object> sortedValues = getValues(exampleMap);
        System.out.println("Sorted values: " + sortedValues);
    }
}

