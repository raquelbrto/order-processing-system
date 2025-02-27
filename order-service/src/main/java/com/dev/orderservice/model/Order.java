
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Colum(nullable = false)
    private Decimal total_amount;

    @Colum(nullable = false)
    private String status ;

    private LocalDateTime created_at;
}