package statistics.matcher;

public class HasAtLeast extends Compare {

    public HasAtLeast(int value, String category) {
        super(value, category);
    }

    @Override
    protected boolean compare(int playersValue, int value) {
        return playersValue >= value;
    }
}
