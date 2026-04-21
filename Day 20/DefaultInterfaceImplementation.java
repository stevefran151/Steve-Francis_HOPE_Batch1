interface method{
    default void display(){
        System.out.println("welcome to interface");
    }
}
class hello implements method{
    public void display(){
        System.out.println("overrided the original interface");
    }
}
public class DefaultInterfaceImplementation {
    
}
