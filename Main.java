public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[] {
                new Movie("Babylon", Movie.NEW_RELEASE),
                new Movie("Pulp Fiction", Movie.REGULAR),
                new Movie("The Lion King", Movie.CHILDREN),
                new Movie("The Batman", Movie.NEW_RELEASE),
                new Movie("In The Name Of The Father", Movie.REGULAR)
        };
        Customer customer = new Customer("Robert Mooney");
        int days = 1;
        for(Movie m: movies) {
            customer.addRental(new Rental(m, days));
            days++;
        }
        
        System.out.println( customer.statement() );
    }
}
