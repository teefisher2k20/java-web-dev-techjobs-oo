package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private final int id;
    private int nextId;
    private String value;


    public JobField() {

        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
