package org.vistula.restassured.pet;

public class Information {

    private long id;
    private String name;
    private String nationality;
    private Integer salary;

    public Information() {
    }

    public Information(long id, String name, String nationality, Integer salary) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
