package com.zipcoder.cryptonator_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@JsonIgnoreProperties(ignoreUnknown = true) // indicates that any properties not bound in this type should be ignored
public class TickerEntity implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private TickerEmbedded ticker;
    private Long timestamp; // unix timestamp
    private Boolean success;
    private String error;

    public Date getTime() {
        return new Date( (long) this.timestamp * 1000 );
        // Java expected milliseconds, so multiply by 1000
    }
}

