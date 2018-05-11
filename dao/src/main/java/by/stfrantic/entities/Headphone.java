package by.stfrantic.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "headphones")
@Data
public class Headphone {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    public String name;
    @Column(name = "manufacturer")
    public String manufacturer;
    @Column(name = "plug")
    public String plug;
    @Column(name = "output_power")
    public String output_power;
    @Column(name = "input_power")
    public String input_power;
    @Column(name = "min_volume")
    public String min_volume;
    @Column(name = "max_volume")
    public String max_volume;
    @Column(name = "weight")
    public String weight;
    @Column(name = "price")
    public String price;

    public Headphone() {
    }

}