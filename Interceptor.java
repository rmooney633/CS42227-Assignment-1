public interface Interceptor {
    // List of all points of interception

    void interceptRent(ContextObject c);

    void interceptFrequentRenterPoints(ContextObject c);
}
