package oopOdev;

public class CourseManager {
	public void listCourse(Course[] courses) {

		for (Course course : courses) {
			System.out.println("Kurs bilgisi : " + course.name+" --> "+course.instructor);
		}
	}

	public void addCourse(Course course) {
		System.out.println("Kurs bilgisi eklendi : " + course.name);
	}

	public void getInstructorByCourseId(Course[] courses, int courseId) {
		for (Course course : courses) {
			if (courseId == course.id) {
				System.out.println(course.name + " adlý kursun eðitmeni : " + course.instructor);
			}
		}
	}
}
