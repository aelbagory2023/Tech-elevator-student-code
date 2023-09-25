package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
System.out.println("The highest bid goes to: " + generalAuction.getHighBid().getBidder());
ReserveAuction reserveAuction = new ReserveAuction("coffee Mug", 299);
reserveAuction.placeBid(new Bid ("Tori", 300));

System.out.println("The highest bid goes to: " + reserveAuction.getHighBid().getBidder());

BuyoutAuction buyoutAuction = new BuyoutAuction("WhiteBoard Marker", 5000);
buyoutAuction.placeBid(new Bid("dave", 200));
        buyoutAuction.placeBid(new Bid("Ben", 215));
        buyoutAuction.placeBid(new Bid("Nate", 17000));
System.out.println(buyoutAuction.endAuction());
}

}

