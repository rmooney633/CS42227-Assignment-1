public class ContextObject {
    private Rental rental;
    private Customer customer;

    public ContextObject(Rental r, Customer c){
        this.rental = r;
        this.customer = c;
    }

    public String getRentedTitle() {
        return rental.getMovie().getTitle();
    }

    public int getTotalDaysRented() {
        return rental.getDaysRented();
    }

    public double getTotalCharge() {
        return rental.getCharge();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getTotalFrequentRenterPoints() {
        return rental.getFrequentRenterPoints();
    }
}
