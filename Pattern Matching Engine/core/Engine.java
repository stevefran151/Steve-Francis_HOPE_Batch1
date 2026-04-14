package core;

import provider.MatchProvider;
import java.util.ArrayList;
import java.util.List;

public class Engine {
    private List<MatchProvider> pipeline = new ArrayList<>();

    public void addProvider(MatchProvider mp) { pipeline.add(mp); }

    public String execute(String input) {
        for (MatchProvider mp : pipeline) {
            String result = mp.find(input);
            if (result != null) return result;
        }
        return "No match found.";
    }
}
