package com.kodilla.challenges;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private Seller seller;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process (final OrderRequest orderRequest) {
        BigDecimal totalPrice = orderService.makeOrder(orderRequest.getBuyer(),orderRequest.getProducts());
        informationService.sendEmail(orderRequest.getBuyer().getName(), orderRequest.getBuyer().geteMail(),orderRequest.getProducts().entrySet().stream().map(productIntegerEntry -> productIntegerEntry.getKey().getName()).collect(Collectors.joining()),totalPrice);
         orderRepository.writeStringToFile(orderRequest.getBuyer().getName(),orderRequest.getSeller().getName(), orderRequest.getProducts().entrySet().stream()
                .map(productIntegerEntry -> productIntegerEntry.getKey().getName())
                .collect(Collectors.joining()), totalPrice);

        OrderDto orderDto = new OrderDto(orderRequest.getBuyer(), orderRequest.getProducts(), true, null);

        //orderRepository.save(orderDto);
        return orderDto;
    }
}
