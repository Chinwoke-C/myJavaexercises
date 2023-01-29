package Chapter16.Queue;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public  int compare(Person firstPerson, Person secondPerson){
        return  firstPerson.getAge()- secondPerson.getAge();
    }

}
