package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.domain.TickerEntity;
import com.zipcoder.cryptonator_api.repositories.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//{"ticker":
//        {"base":"BTC","target":"USD","price":"443.7807865468","volume":"31720.1493969300","change":"0.3766203596"},
//"timestamp":1399490941,"success":true,"error":""}

@Service
public class TickerService {

    @Autowired
    private TickerRepository repository;

    @Autowired
    private RestService restService;

    public TickerEntity add(String base, String target) {
        return this.repository.save(restService.getTicker(base, target));
    }
}
