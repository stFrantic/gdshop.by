package by.stfrantic.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (name="order_date")
    private String date;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private User user;
}
