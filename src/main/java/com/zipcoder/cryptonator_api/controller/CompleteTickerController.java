package com.zipcoder.cryptonator_api.controller;

import com.zipcoder.cryptonator_api.domain.CompleteTicker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 * Created by leon on 1/22/18.
 */

@Controller
public class CompleteTickerController {

    @Autowired
    private RestTemplate restTemplate;

    private final String uri = "https://api.cryptonator.com/api/ticker";

    public CompleteTicker getTicker(String baseCurrency, String targetCurrency) {
        String finalUri =  uri + baseCurrency + "-" + targetCurrency;

        ResponseEntity<CompleteTicker> response = restTemplate.getForEntity(finalUri, CompleteTicker.class);

        return response.getBody();
    }

}
