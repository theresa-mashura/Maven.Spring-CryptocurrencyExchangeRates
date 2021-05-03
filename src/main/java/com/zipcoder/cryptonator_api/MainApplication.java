package com.zipcoder.cryptonator_api;

import com.zipcoder.cryptonator_api.domain.TickerEntity;
import com.zipcoder.cryptonator_api.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Autowired RestService rs;


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            //this.sampleFetch(restTemplate);
            this.fetchTest();
        };
    }

//    private void sampleFetch(RestTemplate restTemplate) {
//        String uriString = "https://api.cryptonator.com/api/ticker/btc-usd";
//        System.out.println("Fetching object from cryptonator.com");
//        System.out.println("Attempting to retrieve object from URI...");
//        System.out.println(uriString);
//        Object jsonObject = restTemplate.getForObject(uriString, Object.class);
//        System.out.println(jsonObject.toString());
//    }

    public void fetchTest() {
        TickerEntity ct = this.rs.getTicker("btc", "usd");
        System.out.println(ct.toString());
        System.out.println(ct.getTicker().toString());
    }

}
