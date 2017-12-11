import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test1() {
		Student tester = new Student();
		assertEquals(Student.AttendanceGrade.VERY_POOR, tester.getAttendanceGrade(29));
	}
	@Test
	public void test2() {
		Student tester = new Student();
		assertEquals(Student.AttendanceGrade.AVERAGE, tester.getAttendanceGrade(49));
	}
	@Test
	public void test3() {
		Student tester = new Student();
		assertEquals(Student.AttendanceGrade.AVERAGE, tester.getAttendanceGrade(69));
	}
	@Test
	public void test4() {
		Student tester = new Student();
		assertEquals(Student.AttendanceGrade.VERY_GOOD, tester.getAttendanceGrade(90));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test5() {
		Student tester = new Student();
		tester.getAttendanceGrade(101);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test6() {
		Student tester = new Student();
		tester.getAttendanceGrade(-1);
	}
	@Test
	public void test7() throws Exception {
		Student tester = new Student();
		assertEquals(Student.AttendanceGrade.ABSENT, tester.getAttendanceGrade(0));
	}

}
