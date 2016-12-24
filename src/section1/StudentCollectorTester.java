/**
 * 
 */
package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mervin
 *
 */
public class StudentCollectorTester {
	static List<Student> myStudents;
	static List<Student> students;
	static List<Student> createStudents(){
		List<Student> myStudents = new ArrayList<Student>();
		Student s;
		s = new Student("Alison", 19, 1, 4.0);
		myStudents.add(s);
		s = new Student("Barbara", 18, 2, 3.5);
		myStudents.add(s);
		s = new Student("Charlie", 17, 1, 3.8);
		myStudents.add(s);
		s = new Student("Donald", 20, 3, 3.6);
		myStudents.add(s);
		s = new Student("Edward", 21, 4, 2.8);
		myStudents.add(s);
		return myStudents;
	}
	static void sortStudent(){
		myStudents = createStudents();	
		students = myStudents;
		System.out.println("BEFORE sorting:" + students);

		Collections.sort(students);
		System.out.println("AFTER sorting:" + students);
	}
	static void sortStudentInReverseOfNaturalOrder(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE sorting:" + students);

		Comparator<Student> reverseOrder = Collections.reverseOrder();
		Collections.sort(students, reverseOrder);
		System.out.println("AFTER sorting:" + students);
	}
	static void sortBasedOnGrade(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE sorting:" + students);
		StudentGradeComparator studentGradeComparator = new StudentGradeComparator();
		Collections.sort(students, studentGradeComparator);
		System.out.println("AFTER sorting:" + students);
	}
	static void sortBasedOnReversedAverage(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE sorting:" + students);
		StudentAverageComparator studentAverageComparator = new StudentAverageComparator();
		Comparator<Student> ReversestudentAverageComparator = Collections.reverseOrder(studentAverageComparator);
		System.out.println("AFTER sorting:" + ReversestudentAverageComparator);		
	}
	static List<Student> shuffleStudents(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE shuffling:" + students);
		Collections.shuffle(students);
		System.out.println("AFTER shuffling:" + students);
		return students;
	}
	static List<Student> reverseStudents(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE reversing:" + students);
		Collections.reverse(students);
		System.out.println("AFTER reversing:" + students);
		return students;
	}
	static List<Student> swap1stAnd2ndStudents(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE  swapping:" + students);
		Collections.swap(students, 0 , 1);
		System.out.println("AFTER  swapping:" + students);
		return students;
	}
	static List<Student> copyStudents(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("BEFORE copy:" + students);
		List<Student> copyStudents = new ArrayList<Student>(myStudents.size());
		Collections.copy(copyStudents, myStudents);
		System.out.println("AFTER copy:" + copyStudents);
		return copyStudents;
	}
	static Student maxStudentInStudents(){
		students = new ArrayList<Student>(myStudents);
		System.out.println("original students:" + students);
		Collections.sort(students);
		System.out.println("sorted   persons:" + students);
		Student maxStudent = Collections.max(students);
		System.out.println("MAX student:" + maxStudent);
		return maxStudent;
	}
	static int IntegerbinarySearchOrderedStudents(){
		students = new ArrayList<Student>(myStudents);
		Student studentToSearch = students.get(1);
		int indexOfFoundPerson = Collections.binarySearch(students, studentToSearch);
		System.out.println("BEFORE sorting:" + "studentToSearch:" + studentToSearch + ", indexOfFoundstudent:" + indexOfFoundPerson);
		Collections.sort(students);
		indexOfFoundPerson = Collections.binarySearch(students, studentToSearch);
		System.out.println("AFTER sorting:" + "studentToSearch:" + studentToSearch + ", indexOfFoundstudent:" + indexOfFoundPerson);
		return indexOfFoundPerson;
		
	}
}
