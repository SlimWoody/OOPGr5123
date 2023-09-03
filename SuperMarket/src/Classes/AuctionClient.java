package Classes;

public class AuctionClient extends Actor  {
    private  String auctionName;
    private int clientID;
    private static int auctionClientCount;
    
    public AuctionClient(String name, String auctionName, int clientID) {
        super(name);
        this.auctionName = auctionName;
        this.clientID = clientID;
    }

    
}
