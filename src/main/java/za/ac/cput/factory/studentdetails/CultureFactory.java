package za.ac.cput.factory.studentdetails;

import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.util.Helper;

public class CultureFactory {
    public static Culture build(String CultureId, String cultureType, Student student) {

        Helper.isEmptyOrNull("cultureId");
        Helper.isEmptyOrNull("cultureType");
        Helper.isEmptyOrNull("student");

        Helper.CheckStringParm("cultureId", CultureId);
        Helper.CheckStringParm("cultureType", cultureType);

        return new Culture
                .Builder()
                .setCultureId(CultureId)
                .setCultureType(cultureType)
                .setStudent(student)
                .build();
    }
}
