public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1100;
        int bonus = depositAmount / 100;
        int finalScope = initialAccount + depositAmount + bonus;

        if (depositAmount <= 1000) {
            finalScope = initialAccount + depositAmount;
            bonus = 0;
        }
        System.out.println("Ваш итоговый счет " + finalScope + " рублей");
        System.out.println(" У вас " + bonus + " бонусных рублей");
    }
}




