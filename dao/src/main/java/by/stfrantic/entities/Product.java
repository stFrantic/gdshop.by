package by.stfrantic.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Product() {
    }
    @JoinColumn(name = "headphone_id", nullable = false)
    @OneToOne
    private Headphone headphone;
    @JoinColumn(name = "mouse_id", nullable = false)
    @OneToOne
    private Mouse mouse;
    @JoinColumn(name = "monitor_id", nullable = false)
    @OneToOne
    private Monitor monitor;

}
