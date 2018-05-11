package by.stfrantic.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mouses")
@Data
public class Mouse {
    @Id
    @Column (name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (name="name")
    public String name;
    @Column (name="manufacturer")
    public String manufacturer;
    @Column (name="type")
    public String type;
    @Column (name="plug")
    public String plug;
    @Column (name="dpi")
    public String dpi;
    @Column (name="num_buttons")
    public String num_buttons;
    @Column (name="m_long")
    public String m_long ;
    @Column (name="height")
    public String height;
    @Column (name="width")
    public String width;
    @Column (name="weight")
    public String weight;
    @Column (name="price")
    public String price;

    public Mouse() {
    }

}
