package provider;
import java.util.*;

public class ExactMatcher implements MatchProvider {
    private Map<String, String> data = new HashMap<>();

    public void add(String p, String r) { data.put(p, r); }
    public String find(String input) { return data.get(input); }
}