public class Goose extends Animal implements Flying {

    @Override
    public void fly() {
        IO.println("Goose is flying faster than the aeroplane...");
    }

    @Override
    public void move() {
        IO.println("This goose is moving fast ");
    }

    @Override
    public void speak() {
        IO.println("This goose is speaking! ");
    }
}
