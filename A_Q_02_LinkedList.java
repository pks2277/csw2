package Assignment_2;

import java.util.*;
    class Student {
        String name;
        int age;
        double marks;

        public Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
    }

        public class A_Q_02_LinkedList {
            public static void main(String[] args) {
                LinkedList<Student> ll = new LinkedList<>();
                ll.add(new Student("Prakhar", 21, 9.1));
                ll.add(new Student("Anil", 19, 8.1));
                ll.add(new Student("Atul", 20, 8.6));

                for (Student s : ll) {
                    System.out.println(s.name + " " + s.age + " " + s.marks);
                }

                Scanner sc = new Scanner(System.in);
                if (ll.isEmpty()) {
                    System.out.println("LinkedList is Empty");
                } else {
                    System.out.println("Enter your Name and Age...");
                    String name1 = sc.nextLine();
                    int age1 = sc.nextInt();
                    for (Student s : ll) {
                        if ((s.name).equals(name1) && s.age == age1) {
                            System.out.println("Present");
                            System.out.println("Hello " + s.name + " Your marks is " + s.marks);
                        }
                    }

                }
                System.out.println("Enter a name of Student you want to delete: ");
                String removestu = sc.next();
                for (Student s : ll) {
                    if (removestu.contentEquals(s.name)) {
                        ll.remove(s);
                    }

                }
                for (Student s : ll) {
                    System.out.println(s.name + " " + s.age + " " + s.marks);
                }
                System.out.println("Size of LinkedList is " + ll.size());
                sc.close();
            }

        }

