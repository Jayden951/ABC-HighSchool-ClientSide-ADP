/*
SupportStaff.java
Factory for SupportStaffFactory
Author: Tiffany Kiwiets (219322732)
*/

package factory.staffdetails;


import domain.admin.Admin;
import domain.staffdetails.SupportStaff;
import util.Helper;

public class SupportStaffFactory {
    public static SupportStaff build (String suppStaffID, String suppStaffName, String suppStaffSurname, String cellNumber, String importHealthInfo, String qualification,
                                      String typeOfWork, Admin admin) {

        Helper.isEmptyOrNull("suppStaffID");
        Helper.isEmptyOrNull("suppStaffName");
        Helper.isEmptyOrNull("suppStaffSurname");
        Helper.isEmptyOrNull("cellNumber");
        Helper.isEmptyOrNull("importHealthInfo");
        Helper.isEmptyOrNull("qualification");
        Helper.isEmptyOrNull("typeOfWork");
        Helper.isEmptyOrNull("admin");

        Helper.CheckStringParm("suppStaffID", suppStaffID);
        Helper.CheckStringParm("suppStaffName", suppStaffName);
        Helper.CheckStringParm("suppStaffSurname", suppStaffSurname);
        Helper.CheckStringParm("cellNumber", cellNumber);
        Helper.CheckStringParm("importHealthInfo", importHealthInfo);
        Helper.CheckStringParm("qualification", qualification);
        Helper.CheckStringParm("typeOfWork", typeOfWork);

        return new SupportStaff.Builder()
                .setSuppStaffID(suppStaffID)
                .setSuppStaffName(suppStaffName)
                .setSuppStaffSurname(suppStaffSurname)
                .setCellNumber(cellNumber)
                .setImportHealthInfo(importHealthInfo)
                .setQualification(qualification)
                .setTypeOfWork(typeOfWork)
                .setAdminID(admin)
                .build();
    }
}