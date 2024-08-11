package entity;

public class User extends Person{

    private Integer age;
    private String number;
    private String nationality;

    public User(Integer id, String name, String mail, Integer age, String number, String nationality) {
        super(id, name, mail);
        this.age = age;
        this.number = number;
        this.nationality = nationality;
    }

//    public User(Integer age, Long number, String nationality) {
//        this.age = age;
//        this.number = number;
//        this.nationality = nationality;
//    }

    public User() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", number=" + number +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
