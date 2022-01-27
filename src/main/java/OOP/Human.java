package OOP;

public class Human {
    private String Name;
    private String Surname;
    private int Age;

    public Human(String Name, String Surname, int Age) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName(){
        return Name;
    }

    public void  setSurname(String surname) {
        Surname = surname;
    }

    public String getSurname(){
        return Surname;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getAge(){
        return Age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }
}
