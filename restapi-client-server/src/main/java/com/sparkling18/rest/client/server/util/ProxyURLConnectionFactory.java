package com.sparkling18.rest.client.server.util;

import com.sun.jersey.client.urlconnection.HttpURLConnectionFactory;
import java.io.IOException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.Proxy.Type;

public class ProxyURLConnectionFactory implements HttpURLConnectionFactory {
private Proxy proxy;
private PasswordAuthentication authentication;

public ProxyURLConnectionFactory(URI proxyUri, String proxyUser, String proxyPassword) {
this.proxy = new Proxy(Type.HTTP, new InetSocketAddress(proxyUri.getHost(), proxyUri.getPort()));
if(proxyUser != null) {
this.authentication = new PasswordAuthentication(proxyUser, proxyPassword == null?new char[0]:proxyPassword.toCharArray());
Authenticator.setDefault(new Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return ProxyURLConnectionFactory.this.authentication;
}
});
}

}

public HttpURLConnection getHttpURLConnection(URL url) throws IOException {
return (HttpURLConnection)url.openConnection(this.proxy);
}
}
