package com.kodilla.patterns.builder.BigMac;

import com.kodilla.patterns.builder.bigmac.BigMac;
import com.kodilla.patterns.builder.bigmac.Bun;
import com.kodilla.patterns.builder.bigmac.Sauce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite {

    @Test
    void BigMacBuilderTestSuite() {
        //given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(Bun.BUN)
                .sauce(Sauce.BOTH)
                .burgers(1)
                .ingredients("Onion")
                .ingredients("Paprika")
                .ingredients("Cheese")
                .build();
        System.out.println(bigMac);
        //when
        int howManyIngredients = bigMac.getIngredients().size();
        //then
        Assertions.assertEquals(3, howManyIngredients);
    }
}

