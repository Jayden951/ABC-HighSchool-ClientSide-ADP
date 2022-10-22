package za.ac.cput.factory.studentdetails;

import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.domain.studentdetails.Sport;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.util.Helper;

public class SportFactory {
    public static Sport createSport(String sportID, Student studentID, Teacher teacherID, String performanceScore) {

        Helper.isEmptyOrNull("sportID");
        Helper.isEmptyOrNull("studentID");
        Helper.isEmptyOrNull("teacherID");
        Helper.isEmptyOrNull("performanceScore");

        Helper.CheckStringParm("sportID",sportID);
        Helper.CheckStringParm("performanceScore",performanceScore);

        return new Sport.Builder()
                .setSportID(sportID)
                .setStudentID(studentID)
                .setTeacherID(teacherID).
                setPerormanceScore(performanceScore)
                .build();
    }
}
