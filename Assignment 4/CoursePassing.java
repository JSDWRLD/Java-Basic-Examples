public class CoursePassing {
    public static void main(String[] args) {
        // Test the passCourse method
        boolean finalResult1 = passCourse(false, false);
        boolean finalResult2 = passCourse(false, true);
        boolean finalResult3 = passCourse(true, false);
        boolean finalResult4 = passCourse(true, true);

        System.out.println("passCourse(false, false) returns " + finalResult1);
        System.out.println("passCourse(false, true) returns " + finalResult2);
        System.out.println("passCourse(true, false) returns " + finalResult3);
        System.out.println("passCourse(true, true) returns " + finalResult4);
    }

    public static boolean passCourse(boolean passedFinal, boolean passedAssignments) {
        // The student passes the course if both the final and assignments are passed
        return passedFinal && passedAssignments;
    }
}
