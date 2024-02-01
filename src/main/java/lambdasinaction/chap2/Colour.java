package lambdasinaction.chap2;

public enum Colour {
    GREEN("Green"),
    BLUE("Blue"),
    BLACK("Black"),
    RED("Red");


    public final String label;

    private Colour(String label) {
        this.label = label;
    }
}
