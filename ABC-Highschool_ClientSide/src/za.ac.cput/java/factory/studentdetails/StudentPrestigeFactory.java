/* StudentPrestigeFactory.java
    Factory package for StudentPrestige
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
*/
package factory.studentdetails;


import domain.staffdetails.Subject;
import domain.studentdetails.Culture;
import domain.studentdetails.Sport;
import domain.studentdetails.Student;
import domain.studentdetails.StudentPrestige;
import util.Helper;

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