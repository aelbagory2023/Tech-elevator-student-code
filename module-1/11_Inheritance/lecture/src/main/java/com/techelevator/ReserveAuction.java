package com.techelevator;

public class ReserveAuction extends Auction {

   private int reservePrice;
    public ReserveAuction(String item, int reserve) {
        super(item);
        this.reservePrice = reserve;
    }
    @Override
    public boolean placeBid(Bid offeredBid) {

        boolean isCurrentWinningBid = false;
        if (offeredBid.getBidAmount() > this.reservePrice) {

           isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }
}
