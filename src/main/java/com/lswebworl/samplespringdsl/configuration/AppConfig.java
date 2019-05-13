package com.lswebworl.samplespringdsl.configuration;

import com.microsoft.azure.storage.StorageCredentials;
import com.microsoft.azure.storage.StorageCredentialsAccountAndKey;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.StorageUri;
import com.microsoft.azure.storage.blob.CloudBlockBlob;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  /**
   * Adds a CloudBlock Blob Client to the Bean Registry.
   * @return CloudBlockBlob
   */
  @Bean(name = "CloudBlockBlob")
  public CloudBlockBlob cloudBlockBlob() throws StorageException, URISyntaxException {
    StorageCredentials creds = 
        new StorageCredentialsAccountAndKey("shared1", "here gooes my key jG/zyK");
    
    StorageUri storageUri = new StorageUri(new URI("https://shared1.blob.core.windows.net/mxtest"));
    CloudBlockBlob client = new CloudBlockBlob(storageUri, creds);
    return client;
  }

}