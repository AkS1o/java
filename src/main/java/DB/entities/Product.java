package DB.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50,nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
