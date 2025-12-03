//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

   transactionFee(10);
}

public static boolean transactionFee(double fee) {
    int transactions = 4;
    double balance = 800_000;
    // Calculate the total fee for all past transactions
    double totalFee = 0.0;
    for (int i = 1; i <= transactions; i++) {
        totalFee += i * fee;
    }

    // Check if balance can afford it
    if (balance - totalFee > 0) {
        balance -= totalFee;
        return true;
    } else {
        // Not enough money → set to 0 and fail
        balance = 0.0;
        return false;
    }
}
