/* StudentFactory.java
Factory package for StudentFactory
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/

package factory.studentdetails;

import domain.studentdetails.Student;
import util.Helper;

public class StudentFactory {
    public static Student Build(String studentID,
                                String stuName,
                                String stuSurname,
                                int grade,
                                String dob,
                                int idNumber,
                                String address,
                                String importantHealthInfo,
                                double stuAverage) {


        Helper.isEmptyOrNull("studentID");
        Helper.isEmptyOrNull("stuName");
        Helper.isEmptyOrNull("stuSurname");
        Helper.isEmptyOrNull("grade");
        Helper.isEmptyOrNull("dob");
        Helper.isEmptyOrNull("idNumber");
        Helper.isEmptyOrNull("address");
        Helper.isEmptyOrNull("importantHealthInfo");
        Helper.isEmptyOrNull("stuAverage");

        Helper.CheckStringParm("studentID", studentID);
        Helper.CheckStringParm("stuName", stuName);
        Helper.CheckStringParm("stuSurname", stuSurname);
        Helper.CheckStringParm("dob", dob);
        Helper.CheckStringParm("importantHealthInfo", importantHealthInfo);

        return new Student.Builder().
                StudentID(studentID).
                StuName(stuName).
                StuSurname(stuSurname).
                Grade(grade).
                Dob(dob).
                IdNumber(idNumber).
                Address(address).
                ImportantHealthInfo(importantHealthInfo).
                StuAverage(stuAverage).
                build();

    }
}