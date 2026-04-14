package provider;

import matcher.models.*;
import java.util.ArrayList;
import java.util.List;

public class KeywordMatcher implements MatchProvider {
    private List<Rule> rules = new ArrayList<>();

    public void add(String p, String r) { rules.add(new Rule(p, r)); }

    public String find(String input) {
        for (Rule rule : rules) {
            if (input.contains(rule.pattern())) return rule.response();
        }
        return null;
    }
}
