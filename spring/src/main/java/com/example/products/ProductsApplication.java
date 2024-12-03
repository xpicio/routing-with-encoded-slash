package com.example.products;

import org.apache.tomcat.util.buf.EncodedSolidusHandling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsApplication {
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatCustomizer() {
      return factory -> factory.addConnectorCustomizers(connector -> connector.setEncodedSolidusHandling(
          EncodedSolidusHandling.DECODE.getValue()));
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }
}
