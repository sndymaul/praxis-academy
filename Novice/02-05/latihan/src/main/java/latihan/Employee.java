package latihan;

/**
 * Employee
 */
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "employee")
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    
    public Employee(String fname, String lname, int salary){
        this.firstName = fname;
        this.lastName = lname;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public void setId( int id ){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName( String last_name){
        this.lastName = last_name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary( int salary ){
        this.salary = salary;
    }

    
}