package za.ac.cput.domain.parentdetails;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.studentdetails.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
public class Fees implements Serializable {
    @NotNull
    @Id
    private String feeID;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Student studentID;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Admin adminID;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Parent parentID;
    @NotNull
    private double amount;

    protected Fees() {
    }

    //Private constructor
    private Fees(Builder builder) {
        this.feeID = builder.feeID;
        this.studentID = builder.studentID;
        this.adminID = builder.admin;
        this.parentID = builder.parentID;
        this.amount = builder.amount;
    }

    //getters
    public String getFeeID() {
        return feeID;
    }

    public Student getStudentID() {
        return studentID;
    }

    public Admin getAdminID() {
        return adminID;
    }

    public Parent getParentID() {
        return parentID;
    }

    public double getAmount() {
        return amount;
    }



    @Override
    public String toString() {
        return "Fees{" +
                "feeID='" + feeID + '\'' +
                ", studentID=" + studentID +
                ", adminID=" + adminID +
                ", parentID=" + parentID +
                ", amount=" + amount +
                '}';
    }

    public static class Builder {
        private String feeID;
        private Student studentID;
        private Admin admin;
        private Parent parentID;
        private double amount;

        public Builder setfeeID(String feeID) {
            this.feeID = feeID;
            return this;
        }

        public Builder setStudentID(Student studentID) {
            this.studentID = studentID;
            return this;
        }

        public Builder setAdminID(Admin adminID) {
            this.admin = adminID;
            return this;
        }

        public Builder setParentID(Parent parentID) {
            this.parentID = parentID;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }


        public Builder copy(Fees fees) {
            this.feeID = fees.getFeeID();
            this.studentID = fees.getStudentID();
            this.admin = fees.getAdminID();
            this.parentID = fees.getParentID();
            this.amount = fees.getAmount();
            return this;
        }

        public Fees build() { return new Fees( this); }
    }
}
