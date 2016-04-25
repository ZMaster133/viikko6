package statistics.matcher;

import java.lang.reflect.Method;
import statistics.Player;

public abstract class Compare implements Matcher {

    private int value;
    private String fieldName;

    public Compare(int value, String category) {
        this.value = value;
        fieldName = "get" + Character.toUpperCase(category.charAt(0)) + category.substring(1, category.length());
    }

    @Override
    public final boolean matches(Player p) {
        try {
            Method method = p.getClass().getMethod(fieldName);
            int playersValue = (Integer) method.invoke(p);
            return compare(playersValue, value);

        } catch (Exception ex) {
            System.out.println(ex);
            throw new IllegalStateException("Player does not have field " + fieldName.substring(3, fieldName.length()).toLowerCase());
        }

    }
    
    protected abstract boolean compare(int playersValue, int value);
}
