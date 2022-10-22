/* SubjectDepartment.java
   Domain Entity for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 30 March 2022
*/

package domain.staffdetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class SubjectDepartment implements Serializable
{
    //Constructors
    @Id
    @NotNull
    private String subDeptID;
    @NotNull
    private String typeSubject;

    protected SubjectDepartment(){
    }

    private SubjectDepartment (Builder builder)
    {
        this.subDeptID = builder.subDeptID;
        this.typeSubject = builder.typeSubject;
    }


    //Getters
    public String getSubDeptID() {
        return subDeptID;
    }
    public String getTypeSubject() {
        return typeSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectDepartment subjectDepartment = (SubjectDepartment) o;
        return subDeptID.equals(subjectDepartment.subDeptID) && typeSubject.equals(subjectDepartment.typeSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subDeptID, typeSubject);
    }

    // toString
    @Override
    public String toString() {
        return "SubjectDepartment{" +
                "subDeptID='" + subDeptID + '\'' +
                ", typeSubject='" + typeSubject + '\'' +
                '}';
    }

    //Builder pattern
    public static class Builder
    {
        private String subDeptID;
        private String typeSubject;

        public SubjectDepartment.Builder SubDeptID(String subDeptID)
        {
            this.subDeptID = subDeptID;
            return this;
        }

        public Builder TypeSubject(String typeSubject)
        {
            this.typeSubject = typeSubject;
            return this;
        }

        public Builder copy(SubjectDepartment subjectDepartment)
        {
            this.subDeptID = subjectDepartment.getSubDeptID();
            this.typeSubject = subjectDepartment.getTypeSubject();
            return this;
        }
        public SubjectDepartment build()
        {
            return new SubjectDepartment(this);
        }
    }
}