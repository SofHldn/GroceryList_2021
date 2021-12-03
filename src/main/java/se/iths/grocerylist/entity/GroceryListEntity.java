package se.iths.grocerylist.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GroceryListEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public GroceryListEntity(String name, Set<UserEntity> users, ProductEntity products, ProductEntity product) {
        this.name = name;
        this.users = users;
        this.products = products;
        this.product = product;
    }

    @ManyToMany(mappedBy = "groceries", cascade = CascadeType.ALL)
    private Set<UserEntity> users;

    @ManyToOne
    private ProductEntity product;

    public GroceryListEntity() {
    }

    public GroceryListEntity(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }


    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    public GroceryListEntity() {
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
