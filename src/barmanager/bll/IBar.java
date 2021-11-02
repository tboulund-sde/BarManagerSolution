package barmanager.bll;

import barmanager.be.Drink;

public interface IBar {

    Drink createDrink(String proofDescription);
    String[] getProducts();

}
