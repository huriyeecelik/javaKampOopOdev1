package oopOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)", "Engin Demirog");

		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", "Emel Denktaþ");
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Huriye Çelik");

		CourseManager courseManager = new CourseManager();
		System.out.println("\n--Course Add--");
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);

		Course[] courses = { course1, course2, course3 };

		System.out.println("\n--Course List--");
		courseManager.listCourse(courses);

		System.out.println("\n--Get Instructor By Course Id--");
		courseManager.getInstructorByCourseId(courses, course1.id);
	}

}
