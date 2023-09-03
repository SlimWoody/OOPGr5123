/**
 * @autor Лузин Павел
 */

package Classes;
import Interfaces.iReturnOrder;

public class AuctionClient extends Actor implements iReturnOrder {
    /** Поле название акции */
    private String auctionName;
    /** Поле Аукционный айди клиента */
    private int auctionClientID = 1;
     /** Поле Количество клиентов в акции */
    private static int auctionClientCount = 7;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * 
     * @param name  - имя
     * @param auctionName  - название акции
     * @param clientID     - количество клиентов в акции
     * @see AuctionClient#AuctionClient()
     */
    public AuctionClient(String name, String auctionName, int clientID) {
        super(name);
        this.auctionName = auctionName;
        this.auctionClientID = clientID;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public int getAuctionClientID() {
        return auctionClientID;
    }

    public void setAuctionClientID(int auctionClientID) {
        this.auctionClientID = auctionClientID;
    }

    public static int getAuctionClientCount() {
        return auctionClientCount;
    }

    public static void setAuctionClientCount(int auctionClientCount) {
        AuctionClient.auctionClientCount = auctionClientCount;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;

    }

    @Override
    public void setTakeOrder(boolean take) {
        super.isTakeOrder = take;
    }

    @Override
    public boolean goodsСheck() {
        return false;
    }

    @Override
    public boolean returnGoods() {
        return false;
    }
}
