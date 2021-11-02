package barmanager.bll;

import barmanager.be.Drink;

public class SodaDiscoBar implements IBar {
    @Override
    public Drink createDrink(String proofDescription) {
        switch (proofDescription) {
            case BarFactory.MILD_PROOF:
                return new Drink("Vand", 50);
            case BarFactory.MEDIUM_PROOF:
                return new Drink("Sodavand", 33);
            case BarFactory.STRONG_PROOF:
                return new Drink("Energidrik", 100);
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[] {
                "Vand",
                "Sodavand",
                "Energidrik"
        };
    }
}
