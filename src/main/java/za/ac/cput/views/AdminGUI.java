package za.ac.cput.views;

import za.ac.cput.domain.parentdetails.Fees;
import za.ac.cput.domain.parentdetails.Parent;
import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.domain.studentdetails.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminGUI extends JFrame implements ActionListener {
    private Student student;
    private DefaultTableModel StudentTable = new DefaultTableModel();
    private JTable tblStudent = new JTable(StudentTable);
    ArrayList<Student> StudentList = new ArrayList<>();
    ArrayList<Parent> ParentList = new ArrayList<>();
    ArrayList<Sport> SportList = new ArrayList<>();
    ArrayList<Culture> CultureList = new ArrayList<>();
    ArrayList<Transport> TransportList = new ArrayList<>();
    ArrayList<StudentPrestige> StudentPrestigeList = new ArrayList<>();
    ArrayList<Subject> SubjectList = new ArrayList<>();
    ArrayList<SubjectDepartment> SubjectDepartmentList = new ArrayList<>();
    ArrayList<Teacher> TeacherList = new ArrayList<>();
    ArrayList<Fees> FeesList = new ArrayList<>();

    private JFrame pnlMain = new JFrame("Student Table");
    private JPanel pnlBody = new JPanel();

    private JButton btnRefresh = new JButton("Get");
    private JButton btnSave = new JButton("Save");
    private JButton btndelete = new JButton("delete");
    private JButton btnSearch = new JButton("Search");

    private JButton btnExit = new JButton("Exit");

    private GridBagConstraints gbc = new GridBagConstraints();

    public AdminGUI(){
        StudentTable.addColumn("Student Id");
        StudentTable.addColumn("First Name");
        StudentTable.addColumn("Last Name");
        StudentTable.addColumn("grade");
        StudentTable.addColumn("Date of Birth");
        StudentTable.addColumn("ID Number");
        StudentTable.addColumn("Address");
        StudentTable.addColumn("important Health Info");
        StudentTable.addColumn("Student Average");
        tblStudent.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tblStudent.setModel(StudentTable);
        StudentTable = (DefaultTableModel) tblStudent.getModel();

        pnlBody.setLayout(new GridBagLayout());
    }

    public void runStudentTable(){
        pnlMain.add(pnlBody);

        gbc.gridx = 0;
        gbc.gridy = 0;
        pnlBody.add(new JScrollPane(tblStudent));

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.CENTER;
        pnlBody.add(btnRefresh);
        pnlBody.add(btnSave);
        pnlBody.add(btndelete);
        pnlBody.add(btnSearch);
        pnlBody.add(btnExit);

        pnlMain.pack();
        pnlMain.setVisible(true);
        pnlMain.setLocationRelativeTo(null);
        pnlMain.setResizable(false);
        pnlMain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new AdminGUI().runStudentTable();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
