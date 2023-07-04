import java.util.PriorityQueue;
public class PQ_For_Object {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pt = new PriorityQueue<>();
        pt.add(new Student("A", 4));
        pt.add(new Student("B",3));
        pt.add(new Student("C", 20));
        pt.add(new Student("D",1));

        while(!pt.isEmpty()){
            System.out.println(pt.peek().name +" "+pt.peek().rank);
            pt.remove();
        }
    }
}
