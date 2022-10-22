package za.ac.cput.domain.staffdetails;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import za.ac.cput.domain.studentdetails.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
public class Subject implements Serializable {
    @NotNull
    @Id
    private String subjectID;
    @NotNull
    private String modules;
    @NotNull
    private double subAverage;
    @NotNull
    private double stuAverage;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private SubjectDepartment subjectDepartment;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Student student;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Teacher teacher;


    protected Subject(){
    }

    private Subject(Builder builder){
        this.subjectID = builder.subjectID;
        this.modules = builder.modules;
        this.subAverage = builder.subAverage;
        this.stuAverage = builder.stuAverage;
        this.subjectDepartment = builder.subjectDepartment;
        this.student = builder.student;
        this.teacher = builder.teacher;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getModules() {
        return modules;
    }

    public double getSubAverage() {
        return subAverage;
    }

    public double getStuAverage() {
        return stuAverage;
    }

    public SubjectDepartment getSubjectDepartment() {
        return subjectDepartment;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Double.compare(subject.subAverage, subAverage) == 0 && Double.compare(subject.stuAverage, stuAverage) == 0 && Objects.equals(subjectID, subject.subjectID) && Objects.equals(modules, subject.modules) && Objects.equals(subjectDepartment, subject.subjectDepartment) && Objects.equals(student, subject.student) && Objects.equals(teacher, subject.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectID, modules, subAverage, stuAverage, subjectDepartment, student, teacher);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID='" + subjectID + '\'' +
                ", modules='" + modules + '\'' +
                ", subAverage=" + subAverage +
                ", stuAverage=" + stuAverage +
                ", subjectDepartment=" + subjectDepartment +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }

    public static class Builder{
        private String subjectID;
        private String modules;
        private double subAverage;
        private double stuAverage;
        private SubjectDepartment subjectDepartment;
        private Student student;
        private Teacher teacher;



        public Subject.Builder setSubjectID(String subjectID) {
            this.subjectID = subjectID;
            return this;
        }

        public Subject.Builder setModules(String modules) {
            this.modules = modules;
            return this;
        }

        public Subject.Builder setSubAverage(double subAverage) {
            this.subAverage = subAverage;
            return this;
        }

        public Subject.Builder setStuAverage(double stuAverage) {
            this.stuAverage = stuAverage;
            return this;
        }

        public Subject.Builder SubjectDepartment(SubjectDepartment subjectDepartment) {
            this.subjectDepartment = subjectDepartment;
            return this;
        }

        public Subject.Builder Student(Student student) {
            this.student = student;
            return this;
        }

        public Subject.Builder Teacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public Builder copy(Subject subject){
            this.subjectID = subject.getSubjectID();
            this.modules = subject.getModules();
            this.subAverage = subject.getSubAverage();
            this.stuAverage = subject.getStuAverage();
            this.subjectDepartment = subject.subjectDepartment;
            this.student = subject.student;
            this.teacher = subject.teacher;
            return this;
        }
        public Subject build(){
            return new Subject( this);
        }
    }

}
