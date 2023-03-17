public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer();

        System.out.println("Customer: " + customer1.getName() +
                ", limit: " + customer1.getCreditLimit() +
                ", email: " + customer1.getEmailAddress());

        Customer customer2 = new Customer("Jane", 8000, "jane@gmail.com");

        System.out.println("Customer: " + customer2.getName() +
                ", limit: " + customer2.getCreditLimit() +
                ", email: " + customer2.getEmailAddress());

        Customer customer3 = new Customer("Sara", "sara@sara.com");

        System.out.println("Customer: " + customer3.getName() +
                ", limit: " + customer3.getCreditLimit() +
                ", email: " + customer3.getEmailAddress());
    }



}
