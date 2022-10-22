package za.ac.cput.factory.studentdetails;

import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.domain.studentdetails.Sport;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.domain.studentdetails.StudentPrestige;
import za.ac.cput.util.Helper;

public class StudentPrestigeFactory {
    public static StudentPrestige build(String prestigeId, String prestigeType, Student student, Sport sport, Culture culture, Subject subject){

        Helper.isEmptyOrNull("prestigeId");
        Helper.isEmptyOrNull("prestigeType");
        Helper.isEmptyOrNull("student");
        Helper.isEmptyOrNull("sport");
        Helper.isEmptyOrNull("culture");
        Helper.isEmptyOrNull("subject");

        Helper.CheckStringParm("prestigeId", prestigeId);
        Helper.CheckStringParm("prestigeType", prestigeType);

        return new StudentPrestige.Builder().prestigeId(prestigeId).prestigeType(prestigeType).student(student).sport(sport).culture(culture).build();
    }
}
