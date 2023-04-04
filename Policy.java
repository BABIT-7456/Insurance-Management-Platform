@Entity
public class Policy {
    @Id
    private Long id;
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double premiumAmount;
    @ManyToOne
    private Client client;
    // getters and setters
}

@Entity
public class Client {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    // getters and setters
}

@Entity
public class Claim {
    @Id
    private Long id;
    private String description;
    private LocalDate date;
    private Double amount;
    @ManyToOne
    private Policy policy;
    // getters and setters
}