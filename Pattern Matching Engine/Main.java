

import core.Engine;
import provider.*;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();

        ExactMatcher exact = new ExactMatcher();
        exact.add("steve", "USing exact matcher");
        
        KeywordMatcher keyword = new KeywordMatcher();
        keyword.add("Error", "Logging system failure...");

        engine.addProvider(exact);
        engine.addProvider(keyword);

        System.out.println(engine.execute("steve")); 
        System.out.println(engine.execute("Error"));
    }
}
