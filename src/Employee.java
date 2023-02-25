public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник: " +
                "id: " + id +
                ", имя: " + name  +
                ", заработная плата: " + salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
