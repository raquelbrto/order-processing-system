@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = new Order();

        order = orderRepository.save(order);
        rabbitTemplate.convertAndSend("orderQueue", order);
        return new OrderDTO(order);
    }
}