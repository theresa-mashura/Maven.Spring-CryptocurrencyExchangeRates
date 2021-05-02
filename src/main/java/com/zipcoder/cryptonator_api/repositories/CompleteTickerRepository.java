package com.zipcoder.cryptonator_api.repositories;

import com.zipcoder.cryptonator_api.domain.CompleteTicker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 1/22/18.
 */

@Repository
public interface CompleteTickerRepository extends CrudRepository<CompleteTicker, Long> {

}
