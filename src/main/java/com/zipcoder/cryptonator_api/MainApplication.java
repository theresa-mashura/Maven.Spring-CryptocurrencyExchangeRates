package com.zipcoder.cryptonator_api;

import com.zipcoder.cryptonator_api.domain.TickerEntity;
import com.zipcoder.cryptonator_api.services.RestService;
import com.zipcoder.cryptonator_api.services.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Autowired
    private TickerService ts;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            //this.sampleFetch(restTemplate);
            this.display();
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

    @Scheduled(fixedDelay = 50000, initialDelay = 5000)
    public void display() {
        TickerEntity t = this.ts.add("btc", "usd");
        System.out.println(t.toString());
    }

}
