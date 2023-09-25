package com.techelevator;

public class BuyoutAuction extends Auction{

    private int buyoutPrice;
    private boolean isOver = false; //false by default because auctions aren't over as soon as they start... :/

    public BuyoutAuction(String item, int buyoutPrice) {
        super(item); //calling the Auction constructor because we are making a type of Auction
        this.buyoutPrice = buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if (offeredBid.getBidAmount() >= this.buyoutPrice) {
            //the auction ends and this bid is the highest/winning bid
            isCurrentWinningBid = super.placeBid(offeredBid);
            this.isOver = true;
            return isCurrentWinningBid;
        }
        //could still be the highest bid, but the auction isn't over
        //let the parent class sort out if it's the winning bid
        isCurrentWinningBid = super.placeBid(offeredBid);
        return isCurrentWinningBid;
    }

    public String endAuction() {
        this.isOver = true;
        return "The auction ended, " + super.getHighBid().getBidder() + " won!";
    }

}
