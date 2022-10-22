//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//sportFactory.java

package factory.studentdetails;


import domain.staffdetails.Teacher;
import domain.studentdetails.Sport;
import domain.studentdetails.Student;
import util.Helper;

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