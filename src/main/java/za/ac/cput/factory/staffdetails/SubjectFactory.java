package za.ac.cput.factory.staffdetails;

import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.util.Helper;

public class SubjectFactory {
    public static Subject build (String subjectID,
                                 String modules,
                                 double subAverage,
                                 double stuAverage,
                                 SubjectDepartment subjectDepartment,
                                 Student student,
                                 Teacher teacher){

        Helper.isEmptyOrNull("subjectID");
        Helper.isEmptyOrNull("modules");
        Helper.isEmptyOrNull("subAverage");
        Helper.isEmptyOrNull("stuAverage");
        Helper.isEmptyOrNull("subjectDepartment");
        Helper.isEmptyOrNull("student");
        Helper.isEmptyOrNull("teacher");

        Helper.CheckStringParm("subjectID",subjectID);
        Helper.CheckStringParm("modules",modules);


        return new Subject.Builder()
                .setSubjectID(subjectID)
                .setModules(modules)
                .setSubAverage(subAverage)
                .setStuAverage(stuAverage)
                .SubjectDepartment(subjectDepartment)
                .Student(student)
                .Teacher(teacher)
                .build();
    }
}
