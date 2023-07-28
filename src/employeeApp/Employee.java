package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password,String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthplans=healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name){
        if (healthplans[index] == null) {
            healthplans[index] = name;
            System.out.println("Health plan eklendi: " + name);
        } else {
            System.out.println("Belirtilen index dolu: " + index);
        }

        if (index < 0) {
            System.out.println("Index degeri bos: " + index);
            return;
        }

        if (index >= healthplans.length) {
            System.out.println("Index hic varolmadi: " + index);
        }
    }

    public String toString(){
        return "Full Name: " + fullName + "Health plans: " + Arrays.toString(healthplans);
    }
}
