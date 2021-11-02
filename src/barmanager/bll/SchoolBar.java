package barmanager.bll;

import barmanager.be.Drink;

public class SchoolBar implements IBar {
    @Override
    public Drink createDrink(String proofDescription) {
        switch (proofDescription)
        {
            case BarFactory.MILD_PROOF:
                return new Drink("Beer", 33);
            case BarFactory.MEDIUM_PROOF:
                return new Drink("Wine", 75);
            case BarFactory.STRONG_PROOF:
                return new Drink("Tequilla shot", 2);
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[] {
                "Beer",
                "Wine",
                "Tequilla shot"
        };
    }
}
