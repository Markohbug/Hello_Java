// A recall
void main() {
    // Primitive data types in java
    byte pupilsInClass = 127;
    short bodyCount = 32_000;
    int totalPopulationInGhana = 2_000_000_000;
    long youtube_subscribers = 200_000_000_000L;
    final float molecularMassofHydrogen = 1.0000000000F;
    double atomicMass = 24.13;
    final boolean hasCriminalRecords = true;
    char firstLetterOfName = 'A';

    // A little of Reference types
    String fullName = "Ademola Joseph Ola";
    IO.println(fullName);
    Date date = new Date();
    long time = date.getTime();
    IO.println("My time is currently reading : " + time);

    // A little of Arrays
    String[] food = new String[10];
    food[0] = "Egussi";
    food[1] = "Rice";
    food[2] = "Beans";
    food[3] = "Egg";
    food[4] = "Irish potatoes";
    food[5] = "Cassava";

    // A little of loops

    for (String eat : food) {
        IO.println(eat);
    }

    int[] justCount = {1,2,3,4,5,6,7,8,9,0};

    for (int i = 0; i <= justCount.length; i++) {
        IO.println(justCount[8]);
    }

    // A little on Operations (+,-,*, /)
    int a = 202;
    int b = 132;
    double c = 311.542;

    // A little on conditional statement

    IO.println(a + b);
    if (b > a )
        IO.println( b - a);
    else
    IO.println(b);

    IO.println(c/b);

    double myMath = Math.random() * a;
    IO.println(myMath);

    if (myMath > 10) {
        IO.println("I have chosen a special number for you!!!");
    } else
        IO.println("You will get lucky Next Time!!!");

    double myMath1 = Math.ceil(3.533);
    IO.println("Just checking the Ceiling : " + myMath1);
    double myMath2 = Math.floor(myMath1);
    IO.println("Just checking the floor : " + myMath2);
    double myMath3 = Math.max(a, b);
    IO.println("MAXIMUS : " + myMath3);
    double myMath4 = Math.sqrt(a);
    IO.println(" Square root  : " + myMath4);

    // am only printing primitives here >>>>>

    IO.println("There are a total of " + pupilsInClass + " today.");
    IO.println("her body count is " + bodyCount + " according to OnlyFans.");
    IO.println("total population of people in Ghana are : " + totalPopulationInGhana);
    IO.println("Chaakam has a Youtube channel with " + youtube_subscribers + " in total.");
    IO.println("Atomic Mass of hydrogen: " + molecularMassofHydrogen + 'g');
    IO.println("Atomic Mass of an unknown Element: " + atomicMass);
    IO.println("Tunde has Criminal records: " + hasCriminalRecords);
    IO.println("just printing in Atom " + firstLetterOfName);

}
