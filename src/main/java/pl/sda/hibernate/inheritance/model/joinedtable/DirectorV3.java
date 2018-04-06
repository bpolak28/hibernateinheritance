package pl.sda.hibernate.inheritance.model.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "director_joined")
@PrimaryKeyJoinColumn(name = "id")
public class DirectorV3 extends EmployeeV3 {

    private String departments;

    public DirectorV3(){

    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }
}
