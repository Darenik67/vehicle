public class boat extends vehicle{
    public boat (String brand, int age) {
        super(brand, age);
    }
   @Override 
   public String doStuff(){
    return " je suis " + getBrand() +" et je fais glouglou";

   }
}
