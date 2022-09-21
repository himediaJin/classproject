package chapter06.exam;

public class StudenMain {

	public static void main(String[] args) {
		
		// 학생 10명의 정보를 저장하는 배열
		Student[] students = new Student[10];
		
		// 점수 초기화
		for(int i=0; i<students.length; i++) {
			
			students[i] = new Student(
					"학생"+i,
					(int)(Math.random()*51)+50, 
					(int)(Math.random()*51)+50, 
					(int)(Math.random()*51)+50
					);
		}
		
		for(Student s : students) {
			s.printData();
		}
		

	}

}
