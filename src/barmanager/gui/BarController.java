package barmanager.gui;

import barmanager.be.Drink;
import barmanager.bll.BarFactory;
import barmanager.bll.IBar;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class BarController implements Initializable {

    private IBar bar = BarFactory.createBar();

    @FXML
    private ChoiceBox<String> cbProof;

    @FXML
    private Label lblProducts;

    @FXML
    private ListView<String> lstOrderedProducts;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        prepareProofs();
        prepareProducts();
    }

    @FXML
    private void orderDrink()
    {
        String proof = cbProof.getValue();
        Drink drink = bar.createDrink(proof);
        lstOrderedProducts.getItems().add(drink.toString());
    }

    private void prepareProofs() {
        cbProof.getItems().addAll(
                BarFactory.MILD_PROOF,
                BarFactory.MEDIUM_PROOF,
                BarFactory.STRONG_PROOF
        );
    }

    private void prepareProducts()
    {
        lblProducts.setText(String.join(", ", bar.getProducts()));
    }
}
