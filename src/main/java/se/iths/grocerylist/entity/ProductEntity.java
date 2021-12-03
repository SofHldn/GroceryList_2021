package se.iths.grocerylist.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;
    private double price;
    private String category;

    @ManyToOne
    private DepartmentEntity departments;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<GroceryListEntity> groceries = new ArrayList<>();


    public ProductEntity() {
    }

    public ProductEntity(String productName, double price, String category, DepartmentEntity departments) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.departments = departments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DepartmentEntity getDepartment() {
        return departments;
    }

    public void setDepartment(DepartmentEntity departments) {
        this.departments = departments;
    }
}
