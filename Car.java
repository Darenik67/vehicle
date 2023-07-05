public class Car extends vehicle {
public Car (String brand , int age){
    super(brand , age);
}
    @Override
    public String doStuff() {
        return "je suis " + getBrand()+ " et je fais vroum vroum ";
    //    throw new UnsupportedOperationException("Unimplemented method 'doStuff'");
    
    
}}


