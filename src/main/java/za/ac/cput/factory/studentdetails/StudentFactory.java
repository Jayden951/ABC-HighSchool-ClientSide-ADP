package za.ac.cput.factory.studentdetails;

import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.util.Helper;

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
