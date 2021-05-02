package com.zipcoder.cryptonator_api.domain;

//{"ticker":
//        {"base":"BTC","target":"USD","price":"443.7807865468","volume":"31720.1493969300","change":"0.3766203596",},
//"timestamp":1399490941,"success":true,"error":""}

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Ticker {

    private String base;
    private String target;
    private Double price;
    private Double volume;
    private Double change;
}
