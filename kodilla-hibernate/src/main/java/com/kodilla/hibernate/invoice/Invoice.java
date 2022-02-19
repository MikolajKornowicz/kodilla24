package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    private int id;
    private String number;
    private List<Item> itemList;

    public Invoice() {
    }

    public Invoice(String number, List<Item> itemList) {
        this.number = number;
        this.itemList = itemList;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column (name = "NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(targetEntity = Item.class,
            mappedBy = "item",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    public List<Item> getItemList() {
        return itemList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
