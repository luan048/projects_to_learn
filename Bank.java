public class Bank {
    double balance = 10500;

    public void moneyRecived(double value) { // void é para quando o método não tiver return, quando tiver, se deve informar o tipo
        balance += value;

        System.out.println("The value " + value + " has been added");
        System.out.println(balance);
    }

    public void moneySend(double value) {
        balance -= value;

        System.out.println("The value " + value + " has been send");
        System.out.println(balance);
    }
}