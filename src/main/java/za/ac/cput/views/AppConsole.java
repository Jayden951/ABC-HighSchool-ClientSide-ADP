package za.ac.cput.views;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.parentdetails.Fees;
import za.ac.cput.domain.parentdetails.Parent;
import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.domain.staffdetails.SupportStaff;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.domain.studentdetails.StudentPrestige;
import za.ac.cput.domain.studentdetails.Transport;

import java.io.IOException;

public class AppConsole {
    private static OkHttpClient client = new OkHttpClient();

    private static String run(String URL) throws IOException {
        Request request = new Request.Builder()
                .url(URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void findAdmin() {
        try {
            System.out.println("Admin Details: ");
            final String URL = "http://localhost:8080/abc-school-management/admin/all";
            String responsebody = run(URL);
            JSONArray admin = new JSONArray(responsebody);

            for (int i = 0; i < admin.length(); i++) {
                JSONObject admins = admin.getJSONObject(i);

                Gson g = new Gson();
                Admin a = g.fromJson(admins.toString(), Admin.class);
                System.out.println(a.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findCulture() {
        try {
            System.out.println("Culture Details: ");
            final String URL = "http://localhost:8080/abc-school-management/culture/all";
            String responsebody = run(URL);
            JSONArray culture = new JSONArray(responsebody);

            for (int i = 0; i < culture.length(); i++) {
                JSONObject cultures = culture.getJSONObject(i);

                Gson g = new Gson();
                Culture c = g.fromJson(cultures.toString(), Culture.class);
                System.out.println(c.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findFees() {
        try {
            System.out.println("Fees Details: ");
            final String URL = "http://localhost:8080/abc-school-management/fees/all";
            String responsebody = run(URL);
            JSONArray fees = new JSONArray(responsebody);

            for (int i = 0; i < fees.length(); i++) {
                JSONObject fee = fees.getJSONObject(i);

                Gson g = new Gson();
                Fees f = g.fromJson(fee.toString(), Fees.class);
                System.out.println(f.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findStudent() {
        try {
            System.out.println("Student Details: ");
            final String URL = "http://localhost:8080/abc-school-management/student/findAll";
            String responsebody = run(URL);
            JSONArray student = new JSONArray(responsebody);

            for (int i = 0; i < student.length(); i++) {
                JSONObject students = student.getJSONObject(i);

                Gson g = new Gson();
                Student s = g.fromJson(students.toString(), Student.class);
                System.out.println(s.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findTeacher() {
        try {
            System.out.println("Teacher Details: ");
            final String URL = "http://localhost:8080/abc-school-management/teacher/all";
            String responsebody = run(URL);
            JSONArray teacher = new JSONArray(responsebody);

            for (int i = 0; i < teacher.length(); i++) {
                JSONObject teachers = teacher.getJSONObject(i);

                Gson g = new Gson();
                Teacher t = g.fromJson(teachers.toString(), Teacher.class);
                System.out.println(t.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findSubjectDepartment() {
        try {
            System.out.println("Subject Department Details: ");
            final String URL = "http://localhost:8080/abc-school-management/subjectDepartment/all";
            String responsebody = run(URL);
            JSONArray subjectdepartment = new JSONArray(responsebody);

            for (int i = 0; i < subjectdepartment.length(); i++) {
                JSONObject subjectdepartments = subjectdepartment.getJSONObject(i);

                Gson g = new Gson();
                SubjectDepartment t = g.fromJson(subjectdepartments.toString(), SubjectDepartment.class);
                System.out.println(t.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findParent() {
        try {
            System.out.println("Parent Details: ");
            final String URL = "http://localhost:8080/abc-school-management/parent/all";
            String responsebody = run(URL);
            JSONArray parent = new JSONArray(responsebody);

            for (int i = 0; i < parent.length(); i++) {
                JSONObject parents = parent.getJSONObject(i);

                Gson g = new Gson();
                Parent p = g.fromJson(parents.toString(), Parent.class);
                System.out.println(p.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findSubject() {
        try {
            System.out.println("Subject Details: ");
            final String URL = "http://localhost:8080/abc-school-management/subject/all";
            String responsebody = run(URL);
            JSONArray subject = new JSONArray(responsebody);

            for (int i = 0; i < subject.length(); i++) {
                JSONObject subjects = subject.getJSONObject(i);

                Gson g = new Gson();
                Subject su = g.fromJson(subjects.toString(), Subject.class);
                System.out.println(su.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findStudentprestige() {
        try {
            System.out.println("Subject-prestige Details: ");
            final String URL = "http://localhost:8080/abc-school-management/student-prestige/all";
            String responsebody = run(URL);
            JSONArray studentprestige = new JSONArray(responsebody);

            for (int i = 0; i < studentprestige.length(); i++) {
                JSONObject studentprestiges = studentprestige.getJSONObject(i);

                Gson g = new Gson();
                StudentPrestige sp = g.fromJson(studentprestiges.toString(), StudentPrestige.class);
                System.out.println(sp.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findsupportStaff() {
        try {
            System.out.println("Support Staff Details: ");
            final String URL = "http://localhost:8080/abc-school-management/supportStaff/all";
            String responsebody = run(URL);
            JSONArray supportstaff = new JSONArray(responsebody);

            for (int i = 0; i < supportstaff.length(); i++) {
                JSONObject supportstaffs = supportstaff.getJSONObject(i);

                Gson g = new Gson();
                SupportStaff ss = g.fromJson(supportstaffs.toString(), SupportStaff.class);
                System.out.println(ss.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findtransport() {
        try {
            System.out.println("Transport Details: ");
            final String URL = "http://localhost:8080/abc-school-management/transport/all";
            String responsebody = run(URL);
            JSONArray trasnport = new JSONArray(responsebody);

            for (int i = 0; i < trasnport.length(); i++) {
                JSONObject transports = trasnport.getJSONObject(i);

                Gson g = new Gson();
                Transport t = g.fromJson(transports.toString(), Transport.class);
                System.out.println(t.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        findAdmin();
        findCulture();
        findFees();
        findStudent();
        findTeacher();
        findSubjectDepartment();
        findParent();
        findSubject();
        findStudentprestige();
        findsupportStaff();
        findtransport();
    }
}
