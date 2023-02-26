public class testInterceptor {
    
    public void testInterceptors() {
        ConcreteInterceptor concInterceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.Attach(concInterceptor);

        Customer customer = new Customer("Robert Mooney");
        customer.setDispatcher(dispatcher);

        Rental movie1 = new Rental(new Movie("In The Name Of The Father", Movie.REGULAR), 3);
        Rental movie2 = new Rental(new Movie("Memento", Movie.REGULAR), 3);
        Rental movie3 = new Rental(new Movie("In Bruges", Movie.REGULAR), 3);
        Rental movie4 = new Rental(new Movie("Toy Story", Movie.CHILDREN), 3);
        Rental movie5 = new Rental(new Movie("Babylon", Movie.NEW_RELEASE), 3);

        customer.addRental(movie1);
        customer.addRental(movie2);
        customer.addRental(movie3);
        customer.addRental(movie4);
        customer.addRental(movie5);

        ContextObject c = new ContextObject(movie1, customer);
        dispatcher.DispatchRent(c);
        String expected = "The customer (Robert Mooney) rented the movie In The Name Of The Father for the price of £2 over the duration of 3 days!";

        System.out.println(expected);
        System.out.println(customer.statement());
        System.out.println(dispatcher.equals(customer.statement()));
    }
}
