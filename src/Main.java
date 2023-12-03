public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1001;
        if (deposit > 1000) {
            int bonus = deposit / 100;
            int total = balance + deposit + bonus;
            System.out.println("Благодарим за оплату. Ваш бонус составил " + bonus + " рублей." + " Итого на вашем счету, с учетом бонуса " + total + " рублей.");
        } else {
            if (deposit == 0) {
                int total = balance;
                System.out.println("На вашем счету " + total + " рублей.");
            } else {
                int total = balance + deposit;
                System.out.println("Благодарим за оплату. " + "На вашем счету " + total + " рублей.");
            }
        }
    }
}