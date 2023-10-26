package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }
@RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false, defaultValue = "",name = "title_like")String titleLike,@RequestParam(required = false,defaultValue = "0.00", name = "currentBid_lte") double currentBid_lte) {
    if(titleLike.equals("") && currentBid_lte < 0) {
        return auctionDao.getAuctions();
    } else if(currentBid_lte > 0 && !titleLike.equals("")) {
        return auctionDao.getAuctionsByTitleAndMaxBid(titleLike, currentBid_lte);
    } else if(currentBid_lte > 0) {
        System.out.println( "currentBid:" + currentBid_lte);
        return auctionDao.getAuctionsByMaxBid(currentBid_lte);

    } else if(titleLike.equals("")) {
        return auctionDao.getAuctions();

    } else {
        return auctionDao.getAuctionsByTitle(titleLike);


    }
}


@RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return auctionDao.getAuctionById(id);
}

@RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction newAuction) {
        Auction returnedAuction = auctionDao.createAuction(newAuction);
        return returnedAuction;
}
}
