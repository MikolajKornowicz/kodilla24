package challenges;

import java.math.BigDecimal;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process (final OrderRequest orderRequest) {
        BigDecimal totalPrice = orderService.makeOrder(orderRequest.getBuyer(),orderRequest.getProducts());
        informationService.sendEmail(orderRequest.getBuyer().geteMail(), orderRequest.getProducts(), totalPrice);
        OrderDto orderDto = new OrderDto(orderRequest.getBuyer(), orderRequest.getProducts(), true, totalPrice);

        //orderRepository.save(orderDto);
        return orderDto;
    }
}
