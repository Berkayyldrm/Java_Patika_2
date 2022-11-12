// https://www.hackerrank.com/challenges/java-priority-queue/problem
// For Java 11 or Java 15
import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
class Priorities {
    Queue<String> queue;
    public Priorities() {
        this.queue = new LinkedList<>();
    }
    public void addQueue(String str) {
        this.queue.add(str);
    }

    public List<Student> getStudents(List<String> events) {
        List<Student> listStudent = new ArrayList<>();

        Comparator<Student> orderStudents = new Comparator<>() {
            @Override
            public int compare(Student t1, Student t2) {
                if(t1.getCgpa() < t2.getCgpa()) return 1;
                else if (t1.getCgpa() > t2.getCgpa()) return -1;
                else {
                    int temp = t1.getName().compareTo(t2.getName());
                    if(temp>0) return 1;
                    else if (temp<0) return -1;
                    else {
                        if(t1.getId() > t2.getId()) return -1;
                        else return 1;
                    }
                }
            }
        };


        PriorityQueue<Student> queueStudent = new PriorityQueue<>(orderStudents);
        for (String str:
                events) {
            String[] tempStr = str.split(" ");
            if (tempStr[0].equals("ENTER")) {
                queueStudent.add(new Student(Integer.parseInt(tempStr[3]), tempStr[1], Double.parseDouble(tempStr[2])));
            } else queueStudent.poll();
            this.addQueue(str);
        }
        while (!queueStudent.isEmpty()) {
            listStudent.add(queueStudent.poll());
        }
        return listStudent;
    }

}

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}