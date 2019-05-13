package com.lswebworl.samplespringdsl.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AzureRoute extends RouteBuilder {

  @Override
  public void configure() {
    from("azure-blob://shared1/mxtest/nlabla?azureBlobClient=#cloudBlockBlob")
      .to("file://c:/mx/source")
      .end();
  }

}