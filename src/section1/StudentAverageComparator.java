/**
 * 
 */
package section1;

import java.util.Comparator;

/**
 * @author Mervin
 *
 */
public class StudentAverageComparator implements Comparator<Student>{

	public int compare(Student average1, Student average2) {
		// TODO Auto-generated method stub
		return average1.getAverage().compareTo(average2.getAverage());
	}

}
