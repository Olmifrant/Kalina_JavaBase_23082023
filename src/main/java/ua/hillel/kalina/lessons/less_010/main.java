package ua.hillel.kalina.lessons.less_010;

public class main {



        public static void main(String[] args) {

            Person person1 = new Person("Dean   ", "Winchester", "Lawrence", "1-866-907-3235");
            Person person2 = new Person("Sam    ", "Winchester", "Lawrence", "1-866-907-3235");
            Person person3 = new Person("John   ", "Winchester", "Lawrence", "1-866-907-3235");
            Person person4 = new Person("Castiel", "(Cas)     ", "Heaven  ", "Angel Radio");
            Person person5 = new Person("Fergus ", "MacLeod   ", "Hell    ", "Rite at the crossroads");

            System.out.println(person1.personInfo());
            System.out.println(person2.personInfo());
            System.out.println(person3.personInfo());
            System.out.println(person4.personInfo());
            System.out.println(person5.personInfo());
        }

    }

    class Person {

        public Person(String name, String surname, String city, String phone) {

            this.name = name;
            this.surname = surname;
            this.city = city;
            this.phone = phone;

        }
        public String personInfo() {

            return "Позвонить персонажу  " + name + " " + surname + " из города " + city + " можно по номеру " + phone;
        }
        private String name;
        private String surname;
        private String city;
        private String phone;

    }
