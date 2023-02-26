public class ConcreteInterceptor implements Interceptor {
    
    public void interceptRent(ContextObject c){
        String summary = "The customer (" + c.getCustomerName() +
        ") rented the movie " + c.getRentedTitle() +
        " for the price of £" + c.getTotalCharge() +
        " over the duration of " + c.getTotalDaysRented() + " days!";

        System.out.println(summary);
    }

    public void interceptFrequentRenterPoints(ContextObject c) {
        String summary = "The customer (" + c.getCustomerName() +
        ") currently has " + c.getTotalFrequentRenterPoints() + " frequent renter points!";

        System.out.println(summary);
    }
}
