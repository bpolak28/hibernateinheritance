package pl.sda.hibernate.inheritance.model.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "director_tableperclass")
public class Director extends Employee {

    private String departments;

    public Director(){

    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }
}
