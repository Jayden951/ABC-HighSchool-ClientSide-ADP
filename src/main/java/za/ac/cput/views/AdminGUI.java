//package za.ac.cput.views;
//
//import com.google.gson.Gson;
//import okhttp3.*;
//import za.ac.cput.domain.parentdetails.Fees;
//import za.ac.cput.domain.parentdetails.Parent;
//import za.ac.cput.domain.staffdetails.Subject;
//import za.ac.cput.domain.staffdetails.SubjectDepartment;
//import za.ac.cput.domain.staffdetails.Teacher;
//import za.ac.cput.domain.studentdetails.*;
//import za.ac.cput.factory.studentdetails.StudentFactory;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class AdminGUI extends JFrame implements ActionListener {
//
//    public static final MediaType JSON = MediaType.get("application/jason; charset=utf-8");
//
//    private static OkHttpClient client = new OkHttpClient();
//    private DefaultTableModel StudentTable = new DefaultTableModel();
//    private JTable tblStudent = new JTable(StudentTable);
//
//    ArrayList<Student> StudentList = new ArrayList<>();
//    ArrayList<Parent> ParentList = new ArrayList<>();
//    ArrayList<Sport> SportList = new ArrayList<>();
//    ArrayList<Culture> CultureList = new ArrayList<>();
//    ArrayList<Transport> TransportList = new ArrayList<>();
//    ArrayList<StudentPrestige> StudentPrestigeList = new ArrayList<>();
//    ArrayList<Subject> SubjectList = new ArrayList<>();
//    ArrayList<SubjectDepartment> SubjectDepartmentList = new ArrayList<>();
//    ArrayList<Teacher> TeacherList = new ArrayList<>();
//    ArrayList<Fees> FeesList = new ArrayList<>();
//
//    private JFrame pnlMain = new JFrame("Student Table");
//    private JPanel pnlBody = new JPanel();
//    private JButton btnGet = new JButton("Get");
//    private JButton btnSave = new JButton("Save");
//    private JButton btndelete = new JButton("Delete");
//    private JButton btnSearch = new JButton("Search");
//    private JButton btnExit = new JButton("Exit");
//
//    private JTextField txtDescription = new JTextField();
//    private GridBagConstraints gbc = new GridBagConstraints();
//
//    public AdminGUI(){
//        StudentTable.addColumn("Student Id");
//        StudentTable.addColumn("First Name");
//        StudentTable.addColumn("Last Name");
//        StudentTable.addColumn("Grade");
//        StudentTable.addColumn("Date of Birth");
//        StudentTable.addColumn("ID Number");
//        StudentTable.addColumn("Address");
//        StudentTable.addColumn("Important Health Info");
//        StudentTable.addColumn("Student Average");
//        tblStudent.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//
//        tblStudent.setModel(StudentTable);
//        StudentTable = (DefaultTableModel) tblStudent.getModel();
//
//        pnlBody.setLayout(new GridBagLayout());
//    }
//
//    public void runStudentTable(){
//        pnlMain.add(pnlBody);
//
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        pnlBody.add(new JScrollPane(tblStudent));
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.fill = GridBagConstraints.CENTER;
//        pnlBody.add(btnGet);
//        pnlBody.add(btnSave);
//        pnlBody.add(txtDescription);
//        pnlBody.add(btndelete);
//        pnlBody.add(btnSearch);
//        pnlBody.add(btnExit);
//
//        btnGet.addActionListener(this);
//        btnSave.addActionListener(this);
//        btndelete.addActionListener(this);
//        btnSearch.addActionListener(this);
//        btnExit.addActionListener(this);
//
//        pnlMain.pack();
//        pnlMain.setVisible(true);
//        pnlMain.setLocationRelativeTo(null);
//        pnlMain.setResizable(false);
//        pnlMain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    }
//    public static void main(String[] args) {
//        new AdminGUI().runStudentTable();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(btnExit.equals(e.getSource())) {
//            pnlMain.dispose();
//        }
//        if(btnGet.equals(e.getSource())) {
//
//        }
//        if(btndelete.equals(e.getSource())) {
//
//        }
//        if(btnSearch.equals(e.getSource())){
//
//        }
//        if(btnSave.equals(e.getSource())) {
//            store(txtDescription.getText());
//        } else if (e.getSource() == btnExit) {
//            System.exit(0);
//        }
//    }
//    public void store(String description) {
//        try{
//            final String URL = "http://localhost:8080/abc-school-management/student/findAll";
//            Student student = StudentFactory.Build(description);
//            Gson g = new Gson();
//            String jasonString = g.toJson(student);
//            String r = post(URL, jasonString);
//            if (r != null)
//                JOptionPane.showMessageDialog(null, "Successfully saved.");
//            else
//                JOptionPane.showMessageDialog(null,"Sorry, could not store.");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    public String post(final String URL, String json) throws IOException {
//        RequestBody body = RequestBody.create(JSON, json);
//        Request request = new Request.Builder().url(URL).post(body).build();
//        try (Response response = client.newCall(request).execute()) {
//            return response.body().string();
//        }
//    }
//}