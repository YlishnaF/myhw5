public class Person {
    String name;
    String position;
    String email;
    String telephone;
    int salary;
    int age;

    public Person( String name, String position, String email, String telephone, int salary, int age ) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary=salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("Person %s %s %s %s %d %d", name, position,email, telephone, salary, age);
    }
}
