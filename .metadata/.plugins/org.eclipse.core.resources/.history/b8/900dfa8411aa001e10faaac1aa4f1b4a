package com.logics;


	
	
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Arrays;
	import java.util.Iterator;
	import java.util.Collections;

	public class TripletsCount {

	    public static int countTriplets(List<Integer> arr, int d) {
	        int count = 0;
	        List<List<Integer>> triplets = generateCombinations(arr.subList(1, arr.size()), 3);

	        for (List<Integer> triplet : triplets) {
	            int tripletSum = triplet.stream().mapToInt(Integer::intValue).sum();
	            if (tripletSum % d == 0) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static <T> List<List<T>> generateCombinations(List<T> elements, int r) {
	        List<List<T>> combinations = new ArrayList<>();
	        generateCombinationsHelper(elements, r, 0, new ArrayList<>(), combinations);
	        return combinations;
	    }

	    private static <T> void generateCombinationsHelper(List<T> elements, int r, int start, List<T> current,
	            List<List<T>> result) {
	        if (r == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i <= elements.size() - r; i++) {
	            current.add(elements.get(i));
	            generateCombinationsHelper(elements, r - 1, i + 1, current, result);
	            current.remove(current.size() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        List<Integer> arr = Arrays.asList(0, 1, 2, 3, 4, 5); // Example array
	        int d = 3; // Example value of d

	        int result = countTriplets(arr, d);
	        System.out.println("Number of triplets: " + result);
	    }
	}


