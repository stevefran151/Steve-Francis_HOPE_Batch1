public class test {
    public static int Substring(String s){
        int c=0;
        for(int i=0;i<s.length()-3;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+2)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i)) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(Substring("aaa"));
    }
}
