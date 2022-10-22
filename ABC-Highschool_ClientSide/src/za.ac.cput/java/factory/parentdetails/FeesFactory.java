/*
FeesFactory.java
Factory for FeesFactory
Author: Tiffany Kiwiets (219322732)
 */

package factory.parentdetails;

import domain.admin.Admin;
import domain.parentdetails.Fees;
import domain.parentdetails.Parent;
import domain.studentdetails.Student;
import util.Helper;


public class FeesFactory {
    public static Fees build (String feeID, Student student, Admin admin, Parent parent, double amount) {

        Helper.isEmptyOrNull("feeID");
        Helper.isEmptyOrNull("studentID");
        Helper.isEmptyOrNull("adminId");
        Helper.isEmptyOrNull("parentID");
        Helper.isEmptyOrNull("amount");

        Helper.CheckStringParm("feeID", feeID);

        return new Fees.Builder()
                .setfeeID(feeID)
                .setStudentID(student)
                .setAdminID(admin)
                .setParentID(parent)
                .setAmount(amount)
                .build();
    }
}