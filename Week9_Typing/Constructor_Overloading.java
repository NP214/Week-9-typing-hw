package Week9_Typing;

public class Constructor_Overloading {
    //Java program to overload constructors

        int id;
        String name;
        int age;

        //creating two arg constructor
    Constructor_Overloading(int i, String n) {
            id = i;
            name = n;
        }

        //creating three arg constructor
        Constructor_Overloading(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        public void display() {
            System.out.println(id + " " + name + " " + age);
        }

        public static void main(String args[]) {
            Constructor_Overloading s1 = new Constructor_Overloading(111, "Nidhi");
            Constructor_Overloading s2 = new Constructor_Overloading(222, "Anish", 25);
            s1.display();
            s2.display();
        }

    }
