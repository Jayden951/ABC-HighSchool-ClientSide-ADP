/* SubjectFactory.java
Factory package for SubjectFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package factory.staffdetails;

import domain.staffdetails.Subject;
import domain.staffdetails.SubjectDepartment;
import domain.staffdetails.Teacher;
import domain.studentdetails.Student;
import util.Helper;


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

