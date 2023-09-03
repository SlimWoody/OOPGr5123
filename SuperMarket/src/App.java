import Classes.AuctionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new AuctionClient("Pavel", "First Seven", 0);
        iActorBehaviour client5 = new AuctionClient("Vasy", "First Seven", 0);
        iActorBehaviour client6 = new AuctionClient("Anton", "First Seven", 0);
        iActorBehaviour client7 = new AuctionClient("Semen", "First Seven", 0);
        iActorBehaviour client8 = new AuctionClient("Niokita", "First Seven", 0);
        iActorBehaviour client9 = new AuctionClient("Anna", "First Seven", 0);
        iActorBehaviour client10 = new AuctionClient("Sveta", "First Seven", 0);
        iActorBehaviour client11 = new AuctionClient("Liza", "First Seven", 0);


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);
        magnit.acceptToMarket(client8);
        magnit.acceptToMarket(client9);
        magnit.acceptToMarket(client10);
        magnit.acceptToMarket(client11);

        magnit.update();
    }
}