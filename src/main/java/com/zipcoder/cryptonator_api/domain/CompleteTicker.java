package com.zipcoder.cryptonator_api.domain;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by leon on 1/22/18.
 */

// Example Request: https://api.cryptonator.com/api/full/btc-usd

//{"ticker":
//        {"base":"BTC","target":"USD","price":"443.7807865468","volume":"31720.1493969300","change":"0.3766203596"},
//"timestamp":1399490941,"success":true,"error":""}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompleteTicker {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Ticker ticker;
    private String timeStamp;
    private boolean success;
    private String error;


}
