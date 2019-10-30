package net.swedbank.gyk.collections.productset;

import java.time.LocalDateTime;

public class ProductStatistics {

    /*
    Add fields to ProductStatistics:
    firstSaleOn (LocalDateTime type)
    lastSaleOn (LocalDateTime type)
    salesAmount (double)
     */

    // implement constructor

    private LocalDateTime getMinDate(LocalDateTime d1, LocalDateTime d2) {
        if(d1.compareTo(d2) < 0) return d1;
        return d2;
    }

    private LocalDateTime getMaxDate(LocalDateTime d1, LocalDateTime d2) {
        if(d1.compareTo(d2) > 0) return d1;
        return d2;
    }

    //implement this
    public void updateSalesAmount(double amount) {

    }

    //implement this
    public void updateFirstSalesDate(LocalDateTime dt) {

    }

    //implement this
    public void updateLastSalesDate(LocalDateTime dt) {

    }
}
