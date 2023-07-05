public abstract class vehicle {

    public String brand;
    public int age;

    public vehicle(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public abstract String doStuff();

    public String getBrand() {
        return this.brand;
    }

    public int getAge() {
        return this.age;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// public class car extends vehicle{

// public String brand(){

// // public car (String brand ){
// super.brand();

// }
// // super(Dostuff);

// }
// public class boat extends vehicle{
// private String brand;

// private boat (String brand){
// super(brand);
// }

// }
