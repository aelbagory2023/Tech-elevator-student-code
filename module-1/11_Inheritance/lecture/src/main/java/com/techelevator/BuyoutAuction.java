package com.techelevator;

public class BuyoutAuction extends Auction{
    private int buyoutPrice;
    private boolean isOver = false; //false by default
    public BuyoutAuction(String item,int buyoutPrice) {
        super(item);
        this.buyoutPrice = buyoutPrice;
    }
    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if(offeredBid.getBidAmount() >= buyoutPrice) {
            isCurrentWinningBid = super.placeBid(offeredBid);
            this.isOver = true;
            return isCurrentWinningBid;
        }
        isCurrentWinningBid = super.placeBid(offeredBid);
        return isCurrentWinningBid;
    }
    public String endAuction() {
        this.isOver = true;
                return "The auction ended, " + super.getHighBid().getBidder() + " Won!";
    }
}
