import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (hasAddress()) {
            this.address = address;
        } else {
            System.out.println("Город уже существует");
        }
    }

    public boolean hasAddress() {
        if (this.address == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAge() {
        if (this.age == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
            System.out.println("С Днем рождения!");
        } else {
            System.out.println("Возраст неизвестен");
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setSurname(this.surname)
                .setAddress(this.address);
        return child;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

}
