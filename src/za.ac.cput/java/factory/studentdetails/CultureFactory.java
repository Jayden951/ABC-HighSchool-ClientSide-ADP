/* CultureFactory.java
    Factory package for Culture
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
*/
package factory.studentdetails;

import domain.studentdetails.Culture;
import domain.studentdetails.Student;
import util.Helper;

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