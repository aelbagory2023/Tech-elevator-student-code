package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice;

    public ReserveAuction(String item, int reserve) {
        super(item);
        this.reservePrice = reserve;
    }

    //the @Override decorator lets anyone reading this know that this is a method from the parent class being overridden
    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if (offeredBid.getBidAmount() > this.reservePrice) {
            //if the bid meets the reserve price, I want to place the bid...
            //and the superclass (Auction) already has a method for that I can use
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }

}
