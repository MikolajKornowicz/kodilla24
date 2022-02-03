package com.kodilla.patterns.singleton;

import com.com.kodilla.patterns.singleton.Logger;
import org.apache.commons.math3.analysis.function.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {


    @Test
    void getLastLog() {
        //given
        Logger logger = Logger.INSTANCE;
        //when
        String lastLog = "Last log";
        logger.log(lastLog);
        //then
        Assertions.assertEquals(logger.getLastLog(), lastLog);

    }
}
