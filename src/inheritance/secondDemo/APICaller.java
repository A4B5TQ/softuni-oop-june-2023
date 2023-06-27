package inheritance.secondDemo;

public class APICaller {

    private String addressToCall;
    protected HttpConnection httpConnection;

    public APICaller(String addressToCall, HttpConnection httpConnection) {
        this.addressToCall = addressToCall;
        this.httpConnection = httpConnection;
    }

    public String getAddressToCall() {
        return addressToCall;
    }
}
