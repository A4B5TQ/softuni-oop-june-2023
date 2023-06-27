package inheritance.secondDemo;

public class GitLabCaller extends APICaller {
    public GitLabCaller(String addressToCall, HttpConnection httpConnection) {
        super(addressToCall, httpConnection);
    }
}
