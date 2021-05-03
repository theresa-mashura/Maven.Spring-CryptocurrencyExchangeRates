package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.domain.TickerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by leon on 1/22/18.
 */

@Service
public class RestService {

    private final RestTemplate restTemplate;

    @Autowired
    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String uri = "https://api.cryptonator.com/api/ticker/";


    public TickerEntity getTicker(String baseCurrency, String targetCurrency) {
        String finalUri =  this.uri + baseCurrency + "-" + targetCurrency;

        ResponseEntity<TickerEntity> response = this.restTemplate.getForEntity(finalUri, TickerEntity.class);
        // Other option to use if restTemplate.getForObject(finalUri, TickerEntity.class)
        // Gives you the object w/o response entity

        return response.getBody();
    }

}
