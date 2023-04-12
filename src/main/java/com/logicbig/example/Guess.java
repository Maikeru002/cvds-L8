package com.logicbig.example;

import java.util.Objects;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "DATOS")
public class Guess {
    @Id
    @Column(name = "PROPIEDAD")
    private String Property;
    @Column(name = "VALOR")
    private String Value;

    public Guess(String newProperty, String newValue) {
        Property = newProperty;
        Value = newValue;
    }

    public Guess() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Guess guess = (Guess) o;
        return Objects.equals(Property, guess.Property) && Objects.equals(Value, guess.Value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Property, Value);
    }

    @Override
    public String toString() {
        return "Guess{" +
                "Property=" + Property +
                ", Value='" + Value +
                '}';
    }

    // getters
    public String getProperty() {
        return Property;
    }

    public String getValue() {
        return Value;
    }

    // setters
    public void setProperty(String newProperty) {
        Property = newProperty;
    }

    public void setValue(String newValue) {
        Value = newValue;
    }

}
