package pl.sda.hibernate.inheritance.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("DIRECTOR")
public class DirectorV2 extends EmployeeV2 {

    private String departments;

    public DirectorV2(){

    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }
}
