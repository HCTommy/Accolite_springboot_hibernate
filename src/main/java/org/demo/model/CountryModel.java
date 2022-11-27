package org.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class CountryModel {
    @Id
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
