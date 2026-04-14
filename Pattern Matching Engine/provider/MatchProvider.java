package provider;

public interface MatchProvider {
    void add(String p, String r);
    String find(String input);
}
