package strings_and_arrays;

import java.util.*;

public class ShuffleDeckOfCards {
	//This is not part of the algo, just init the deck
	private static final int numCards = 10;
	public static void main(String[] args) {
		int[] deck = new int[numCards]; 
		for (int i = 0; i < numCards; i++)
			deck[i] = i + 1;
		
		System.out.println(Arrays.toString(shuffle(deck)));
	}
	
	private static int[] shuffle(int[] deck) {
		Random rand = new Random();
		for (int i = 0; i < deck.length; i++) {
			int pos = rand.nextInt(deck.length - i);
			swap(deck, pos + i, i);
		}
		return deck;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
