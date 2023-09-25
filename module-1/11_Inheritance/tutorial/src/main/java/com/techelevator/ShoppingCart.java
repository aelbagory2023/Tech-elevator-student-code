package com.techelevator;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart
 */
public class ShoppingCart {

	private final List<MediaItem> ItemsToBuy = new ArrayList<>();

	public void add(MediaItem MediaItemToAdd) {
	    MediaItem.add(MediaItemToAdd);
	}

	public double getTotalPrice() {
	    double total = 0.0;
	    for (MediaItem book : ItemsToBuy) {
	        total += MediaItem.getPrice();
	    }
	    return total;
	}

	public String receipt() {
	    String receipt = "\nReceipt\n";
	    for (MediaItem book : ItemsToBuy) {
	        receipt += book;
	        receipt += "\n";
	    }

	    receipt += "\nTotal: $" + getTotalPrice();

	    return receipt;
	}
}
