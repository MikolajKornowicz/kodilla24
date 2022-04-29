package com.kodilla.patterns2.facade;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Item {

    private final Long productId;
    private final double qty;
}
