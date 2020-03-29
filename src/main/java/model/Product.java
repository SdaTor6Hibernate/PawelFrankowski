package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private int productId;
    @Column(name = "PRO_NAME")
    private String productName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PRO_CAT_ID", referencedColumnName =  "CAT_ID")
    private Category productCategoryId;
    @Column(name = "PRO_PRICE")
    private BigDecimal productPrice;
    @Column(name = "PRO_DESCRIPTION")
    private String productDescription;
}
