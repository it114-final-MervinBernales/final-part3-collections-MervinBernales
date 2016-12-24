/**
 * 
 */
package section1;

import java.util.Comparator;

/**
 * @author Mervin
 *
 */
public class StudentGradeComparator implements Comparator<Student>{

	public int compare(Student grade1, Student grade2) {
		// TODO Auto-generated method stub
		return grade1.getGrade().compareTo(grade2.getGrade());
	}

}
