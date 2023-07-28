package patterns.builder;

import com.sun.net.httpserver.Headers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connector {
    private String location;
    private List<Headers> headers;

    private int timeout;

    private boolean reConnect;

    private Connector(ConnectorBuilder builder) {
        this.location = builder.location;
        this.headers = builder.headers;
        this.timeout = builder.timeout;
        this.reConnect = builder.reConnect;
    }

//    public Connector(String location) {
//        this.location = location;
//    }
//
//    public Connector(String location, List<Headers> headers) {
//        this.location = location;
//        this.headers = headers;
//    }
//
//    public Connector(List<Headers> headers, int timeout) {
//        this.headers = headers;
//        this.timeout = timeout;
//    }

    public static final class ConnectorBuilder {
        private String location;
        private List<Headers> headers;

        private int timeout;

        private boolean reConnect;

        public ConnectorBuilder() {
            this.headers = new ArrayList<>();
        }

        public ConnectorBuilder withLocation(String location) {
            this.location = location;
            return this;
        }

        public ConnectorBuilder withHeaders(Headers... headers) {
            this.headers.addAll(Arrays.asList(headers));
            return this;
        }

        public ConnectorBuilder withTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public ConnectorBuilder reconnect(boolean reConnect) {
            this.reConnect = reConnect;
            return this;
        }

        public Connector build() {
            return new Connector(this);
        }
    }

    // ...

}
