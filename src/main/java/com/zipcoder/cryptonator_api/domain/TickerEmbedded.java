package com.zipcoder.cryptonator_api.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@ToString
public class TickerEmbedded {

    private String base;
    private String target;
    private Double price;
    private Double volume;
    private Double change;
}
