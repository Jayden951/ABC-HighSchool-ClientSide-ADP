/* Culture.java
   Entity for Culture
   Author: Kegomoditswe Leshope - 219189048
   Date: 7 August 2022
*/

package domain.studentdetails;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;


@Entity
public class Culture implements Serializable {
    @Id
    @NotNull
    private String cultureId;
    @NotNull
    private String cultureType;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Student student;

    protected Culture(){
    }

    //Private Constructor====
    private Culture (Builder builder){
        this.cultureId = builder.cultureId;
        this.cultureType = builder.cultureType;
        this.student = builder.student;
    }

    //Getters ====
    public String getCultureId() {
        return cultureId;
    }

    public String getCultureType() {
        return cultureType;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Culture culture = (Culture) o;
        return cultureId.equals(culture.cultureId) && cultureType.equals(culture.cultureType) && student.equals(culture.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cultureId, cultureType, student);
    }

    //toString ====
    @Override
    public String toString() {
        return "Culture{" +
                "cultureId='" + cultureId + '\'' +
                ", cultureType='" + cultureType + '\'' +
                ", student=" + student +
                '}';
    }
    //Builder ====
    public static class Builder{
        private String cultureId;
        private String cultureType;
        private Student student;

        public Culture.Builder setCultureId(String cultureId){
            this.cultureId = cultureId;
            return this;
        }

        public Culture.Builder setCultureType(String cultureType){
            this.cultureType = cultureType;
            return this;
        }

        public Culture.Builder setStudent (Student student){
            this.student = student;
            return this;
        }

        public Builder copy(Culture culture){
            this.cultureId = culture.cultureId;
            this.cultureType = culture.cultureType;
            this.student = culture.student;
            return this;
        }

        public Culture build(){
            return new Culture(this);
        }
    }
}

