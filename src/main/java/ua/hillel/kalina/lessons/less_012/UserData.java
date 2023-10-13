package ua.hillel.kalina.lessons.less_012;

public class UserData {

    private String name;
    private String surname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String phone;
    private String email;
    private int weight;
    private int pressure1;
    private int pressure2;
    private int steps;
    private int age;


    public UserData(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                     String phone, String email, int weight, int pressure1, int pressure2, int steps) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
        this.email = email;
        this.weight = weight;
        this.pressure1 = pressure1;
        this.pressure2 = pressure2;
        this.steps = steps;
        this.age = (2023 - yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure1() {
        return pressure1;
    }

    public int getPressure2() {
        return pressure2;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure1(int pressure1) {
        this.pressure1 = pressure1;
    }

    public void setPressure2(int pressure2) {
        this.pressure2 = pressure2;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printUserInfo(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Дата рождения: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Давление: " + pressure1 + "/" + pressure2);
        System.out.println("Количество шагов: " + steps);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Эл.почта: " + email);
        System.out.println();
    }

}
