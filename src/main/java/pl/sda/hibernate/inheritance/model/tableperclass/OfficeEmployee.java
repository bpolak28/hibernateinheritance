package pl.sda.hibernate.inheritance.model.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "office_emp_tableperclass")
public class OfficeEmployee extends Employee {

    private String skills;

    public OfficeEmployee(){

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
