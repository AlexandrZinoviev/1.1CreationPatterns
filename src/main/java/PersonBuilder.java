public class PersonBuilder implements IPersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder() {
        super();
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        Person person = new Person(name, surname, age, address);
        if (surname != null) {
            return person;
        } else {
            throw new IllegalStateException("Введите фамилию");
        }
    }
}
