package inheritance.secondDemo;

public class Main {
    public static void main(String[] args) {
//        APICaller apiCaller = new APICaller("https");
        HttpConnection httpConnection = new HttpConnection();

        GithubAPICaller githubAPICaller = new GithubAPICaller("https..",httpConnection);
        githubAPICaller.connect();
    }
}
