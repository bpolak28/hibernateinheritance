package pl.sda.hibernate.inheritance.model.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "office_emp_joinedtable")
@PrimaryKeyJoinColumn(name = "id")
public class OfficeEmployeeV3 extends EmployeeV3 {

    private String skills;

    public OfficeEmployeeV3(){

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
