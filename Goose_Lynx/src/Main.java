//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // output for goose
    Goose goose = new Goose();
    goose.fly();
    goose.move();
    goose.speak();

    // output for lynx
    Lynx lynx = new Lynx();
    lynx.move();
    lynx.speak();

    // output for airplane
Aeroplane airplane = new Aeroplane();
airplane.fly();
}
