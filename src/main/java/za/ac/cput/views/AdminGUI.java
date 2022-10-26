package za.ac.cput.views;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.domain.studentdetails.Student;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AdminGUI extends JFrame implements ActionListener
{

    public static final MediaType JSON = MediaType.get("application/jason; charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    private static String run(String URL) throws IOException {
        Request request = new Request.Builder()
                .url(URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    private JFrame frame = new JFrame("Registration");
    private JPanel north = new JPanel();
    private JPanel south = new JPanel();

    private JButton btnAddStudent = new JButton("Add");
    private JButton btnDelete = new JButton("Delete");
    private JButton btnGet = new JButton("Get");
    private JButton btnExit = new JButton("Exit");

    public void runAdminGUI() {
        frame.add(north);
        frame.add(south);
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        south.setLayout(new GridLayout(1, 5));

        TableModel model = new DefaultTableModel();

        Object headers[] = {"Student Id","First Name","Last Name","Grade","Date of Birth","Id Number","Address","Health Details","Student Average"};

        TableColumnModel columnModel = new DefaultTableColumnModel();
        TableColumn firstColumn = new TableColumn(1);
        firstColumn.setHeaderValue(headers[0]);
        columnModel.addColumn(firstColumn);

        TableColumn secondColumn = new TableColumn(0);
        secondColumn.setHeaderValue(headers[1]);
        columnModel.addColumn(secondColumn);

        TableColumn thirdColumn = new TableColumn(0);
        thirdColumn.setHeaderValue(headers[2]);
        columnModel.addColumn(thirdColumn);

        TableColumn forthColumn = new TableColumn(0);
        forthColumn.setHeaderValue(headers[3]);
        columnModel.addColumn(forthColumn);

        TableColumn fifthColumn = new TableColumn(0);
        fifthColumn.setHeaderValue(headers[4]);
        columnModel.addColumn(fifthColumn);

        TableColumn sixthColumn = new TableColumn(0);
        sixthColumn.setHeaderValue(headers[5]);
        columnModel.addColumn(sixthColumn);

        TableColumn seventhColumn = new TableColumn(0);
        seventhColumn.setHeaderValue(headers[6]);
        columnModel.addColumn(seventhColumn);

        TableColumn eighthColumn = new TableColumn(0);
        eighthColumn.setHeaderValue(headers[7]);
        columnModel.addColumn(eighthColumn);

        TableColumn ninthColumn = new TableColumn(0);
        ninthColumn.setHeaderValue(headers[8]);
        columnModel.addColumn(ninthColumn);

        JTable table = new JTable(model, columnModel);

        JScrollPane scrollPane = new JScrollPane(table);

        south.add(btnAddStudent);

        south.add(btnDelete);

        south.add(btnAddStudent);

        south.add(btnGet);

        south.add(btnExit);

        btnDelete.addActionListener(this);
        btnAddStudent.addActionListener(this);
        btnGet.addActionListener(this);
        btnExit.addActionListener(this);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(1000, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (btnDelete.equals(e.getSource())) {

        }
        if (btnAddStudent.equals(e.getSource())) {
            AddStudent();
        }
        if (btnGet.equals(e.getSource())){
            findStudent();
        }
        if (btnExit.equals(e.getSource())) {
            System.exit(0);
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
    public static void AddStudent() {
        try {
            System.out.println("Added Student: ");
            final String URL = "http://localhost:8080/abc-school-management/student/save";
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

    public static void UpdateStudent() {
        try {
            System.out.println("Added Student: ");
            final String URL = "http://localhost:8080/abc-school-management/student/save";
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

    public static void main(String[] args) {
        new AdminGUI().runAdminGUI();
    }
}
