package za.ac.cput.factory.staffdetails;

import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.util.Helper;

public class SubjectDepartmentFactory {
    public static SubjectDepartment Build(String subDeptID,
                                          String typeSubject){
        Helper.isEmptyOrNull("subDeptID");
        Helper.isEmptyOrNull("typeSubject");

        Helper.CheckStringParm("subDeptID", subDeptID);
        Helper.CheckStringParm("typeSubject", typeSubject);

        return new SubjectDepartment.Builder()
                .SubDeptID(subDeptID)
                .TypeSubject(typeSubject)
                .build();
    }
}
