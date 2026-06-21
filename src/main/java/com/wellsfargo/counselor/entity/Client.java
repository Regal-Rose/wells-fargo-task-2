@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    protected Client() {}

    public Client(String name, String contactInfo, Advisor advisor) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.advisor = advisor;
    }

    // getters and setters
}
