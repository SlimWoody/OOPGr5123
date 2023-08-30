import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrinks;
import Domen.Product;
import Services.CoinDispenser;
import Services.Holder;
import Services.VendingMachine;


public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<Product>();
        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Cola", 50);
        Product item3 = new Bottle("Mineral water", 101,(float)1.5);
        Product item4 = new HotDrinks("Coffee", 120, (float)0.3, 90);
        Product item5 = new HotDrinks("Tea", 70, (float)0.3, 85);
        Product item6 = new HotDrinks("Capuchino Coffee", 0, 0, 25);
        Product item7 = new Bottle("BonAqua", 0, 0);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);
        assort.add(item7);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser disp = new CoinDispenser(120);

        VendingMachine venMach1 = new VendingMachine(hold1, disp, assort);

        for (Product prod: venMach1.getProductList()){
            System.out.println(prod);
        }

    }
}
