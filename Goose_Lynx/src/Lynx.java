public class Lynx extends Animal{
    @Override
    public void move() {
        IO.println("This Lynx is moving backward! ");
    }

    @Override
    public void speak() {
        IO.println("This Lynx is speaking to the man.");
    }
}
