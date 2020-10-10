package com.kubedb.client.util.credentials;

import com.kubedb.client.ApiClient;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.ByteString;

/**
 * Uses Username and Password to configure {@link ApiClient} authentication to the Kubernetes API.
 */
public class UsernamePasswordAuthentication implements Authentication {

  private final String username;
  private final String password;

  public UsernamePasswordAuthentication(final String username, final String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public void provide(ApiClient client) {
    final String usernameAndPassword = username + ":" + password;
    client.setApiKeyPrefix("Basic");
    client.setApiKey(
        ByteString.of(usernameAndPassword.getBytes(StandardCharsets.ISO_8859_1)).base64());
  }
}
