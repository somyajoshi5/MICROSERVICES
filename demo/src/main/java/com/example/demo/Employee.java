package com.example.demo;

import lombok.*;

import java.util.Objects;


public class Employee {
    int id;
    String name;
    int depId;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && depId == employee.depId && Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, depId);
//    }

    public Employee(int id, String name, int depId) {
        this.id = id;
        this.name = name;
        this.depId = depId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depId=" + depId +
                '}';
    }
}
