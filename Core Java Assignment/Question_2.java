class Employee {
    private String name;
    private String email;
    private String gender;
    private int age;
    private int salary;

    Employee(String name, String email, String gender, int age, int salary) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return this.salary;
    }

    public void addSalary(int amount) {
        this.salary += amount;
    }
}


public class Question_2 {
    public static void main(String args[]) {
        Employee emp1 = new Employee("abcd", "abcd@q.com", "M", 25, 500000);

        System.out.println(emp1.getName());
        System.out.println(emp1.getEmail());
        System.out.println(emp1.getGender());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getSalary());

        emp1.addSalary(100000);
        System.out.println(emp1.getSalary());

        emp1.setName("abcd efgh");
        System.out.println(emp1.getName());
    }
}