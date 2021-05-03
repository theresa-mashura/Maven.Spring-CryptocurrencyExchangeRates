package com.zipcoder.cryptonator_api.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class TickerEmbedded {

    private String base;
    private String target;
    private Double price;
    private Double volume;
    private Double change;

    @Override
    public String toString() {
        return "\n---Base: " + base + '\n' +
                "---Target: " + target + '\n' +
                "---Price: " + price + '\n' +
                "---Volume: " + volume + '\n' +
                "---Change: " + change;
    }
}
