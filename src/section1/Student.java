/**
 * 
 */
package section1;

/**
 * @author Mervin
 *
 */
public class Student implements Comparable<Student> {
	String name;
	Integer age;
	Integer grade;
	Double average;
	public Student(String _name, int _age, int _grade, double _average) {
		name = _name;
		age = _age;
		grade = _grade;
		average = _average;
	}
	public String getName(){
		return name;
	}
	public Integer getAge(){
		return age;
	}
	public Integer getGrade(){
		return grade;
	}
	public Double getAverage(){
		return average;
	}
	public int compareTo(Student age) {
		// TODO Auto-generated method stub
		return grade;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{name: ").append(name).append(" ,age: ").append(age).append(" ,grade: ").append(grade).append(" ,average: ").append(average).append("}");
		return sb.toString();
	}
	
}
