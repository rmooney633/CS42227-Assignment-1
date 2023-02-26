import java.util.ArrayList;

public class Dispatcher {
    ArrayList<Interceptor> listInterceptor = new ArrayList<Interceptor>();

    public void Attach(Interceptor interceptor){
        listInterceptor.add(interceptor);
    }

    public void DispatchRent(ContextObject c) {
        for (Interceptor currentInter : listInterceptor) {
            currentInter.interceptRent(c);
        }
    }

    public void DispatchFrequentRenterPoints(ContextObject c) {
        for (Interceptor currentInter : listInterceptor) {
            currentInter.interceptFrequentRenterPoints(c);
        }
    }

}
