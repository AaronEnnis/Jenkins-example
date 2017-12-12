import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class studentTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void belowZero() throws Exception {
        Student std = new Student();
        std.getAttendanceGrade(-1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void muchBelowZero() throws Exception {
        Student std = new Student();
        std.getAttendanceGrade(-42);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void above100() throws Exception {
        Student std = new Student();
        std.getAttendanceGrade(101);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void muchAbove100() throws Exception {
        Student std = new Student();
        std.getAttendanceGrade(142);
    }

    @org.junit.Test
    public void absent() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.ABSENT, std.getAttendanceGrade(0));
    }
    @org.junit.Test
    public void lowVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(1));
    }

    @org.junit.Test
    public void highVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(29));
    }
    @org.junit.Test
    public void lowPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.POOR, std.getAttendanceGrade(30));
    }

    @org.junit.Test
    public void highPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.POOR, std.getAttendanceGrade(49));
    }

    @org.junit.Test
    public void lowAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(50));
    }

    @org.junit.Test
    public void highAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(69));
    }

    @org.junit.Test
    public void lowGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(70));
    }

    @org.junit.Test
    public void highGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(89));
    }

    @org.junit.Test
    public void lowVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(91));
    }

    @org.junit.Test
    public void highVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(100));
    }

}