//7. Write a java program to implement your own ArrayList which has two methods 
//a) add b) remove and store 5 student information in your ArrayList.

package ArrayList;

import java.util.Iterator;

public class MyArrayListTest {
 public static void main(String[] args) {
     //   MyArrayList<Integer> lst = new MyArrayList<>();
        MyArrayList<Student> stu = new MyArrayList<>();
        Student s1 = new Student("Anthony" , 1001);
        Student s2 = new Student("Mary" , 1005);
        Student s3 = new Student("Joseph" , 1110);
        Student s4 = new Student("Jack" , 1008);
        Student s5 = new Student("James" , 1004);
        Student s6 = new Student("Rose" , 1018);
        //Add elements to the list
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);
        
        Iterator<Student> iterator = stu.iterator();
        while(iterator.hasNext()){
        	System.out.println("List Elements:" + iterator.next().studentname);
        }
        System.out.println("-------------------");
        stu.add(2,s6);
        while (iterator.hasNext()) {
        	System.out.println("List Elements:" + iterator.next().getStudentname());
        }
        System.out.println("-------------------");
        System.out.println(stu.get(2).getStudentname());
        System.out.println("-------------------");
        stu.Remove(5);
        stu.removeRange(1,3);
        System.out.println("List Size:" + stu.size);
        
        System.out.println("-------------------");
        //Reset the iterator to start from index 0
        iterator = stu.iterator();
        while (iterator.hasNext()) {
            System.out.println("List Elements:" + iterator.next().getStudentname());
        }
    }
}
