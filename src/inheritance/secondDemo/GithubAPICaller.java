package inheritance.secondDemo;

public class GithubAPICaller extends APICaller{
    public GithubAPICaller(String addressToCall, HttpConnection httpConnection) {
        super(addressToCall, httpConnection);
    }

    public void connect() {
        System.out.println(super.httpConnection.connect(super.getAddressToCall()));
        super.httpConnection.terminate();
    }


}
