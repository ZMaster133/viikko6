package statistics.matcher;

public class HasFewerThan extends Compare {

    public HasFewerThan(int value, String category) {
        super(value, category);
    }

    @Override
    protected boolean compare(int playersValue, int value) {
        return playersValue < value;
    }
}
