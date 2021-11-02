package barmanager.bll;

public class BarFactory {
    public static final String MILD_PROOF = "Mild";
    public static final String MEDIUM_PROOF = "Medium";
    public static final String STRONG_PROOF = "Strong";

    public static IBar createBar() {
        return new SodaDiscoBar();
    }
}
