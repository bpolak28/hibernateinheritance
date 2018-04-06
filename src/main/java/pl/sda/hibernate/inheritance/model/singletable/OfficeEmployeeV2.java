package pl.sda.hibernate.inheritance.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("OFFICE_EMP")
public class OfficeEmployeeV2 extends EmployeeV2 {

    private String skills;

    public OfficeEmployeeV2(){

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
