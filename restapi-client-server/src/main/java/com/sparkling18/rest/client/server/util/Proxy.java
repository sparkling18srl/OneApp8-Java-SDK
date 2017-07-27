package com.sparkling18.rest.client.server.util;

import java.net.URI;

public class Proxy {
    private URI uri;
    private String username;
    private String password;

    public Proxy(URI uri, String username, String password) {
        this.uri = uri;
        this.username = username;
        this.password = password;
    }

    public Proxy(URI uri) {
        this(uri, null, null);
    }

    public URI getUri() {
        return uri;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
