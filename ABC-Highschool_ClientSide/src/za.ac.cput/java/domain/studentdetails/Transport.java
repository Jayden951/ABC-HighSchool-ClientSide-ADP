/* Transport.java
   Domain Entity for the Transport
   Author: Raeesah Williams (219091498)
   Date: 30 March 2022
*/

package domain.studentdetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Transport implements Serializable
{
    //Constructors
    @Id
    @NotNull
    public String transportID;
    @NotNull
    private String typeOfTransport;

    protected Transport() {
    }

    private Transport (Builder builder)
    {
        this.transportID = builder.transportID;
        this.typeOfTransport = builder.typeOfTransport;
    }

    //Getters
    public String getTransportID()
    {
        return transportID;
    }
    public String getTypeOfTransport()
    {
        return typeOfTransport;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return transportID.equals(transport.transportID) && typeOfTransport.equals(transport.typeOfTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportID, typeOfTransport);
    }

    // toString
    @Override
    public String toString() {
        return "Transport{" +
                "transportID=" + transportID +
                ", typeOfTransport='" + typeOfTransport + '\'' +
                '}';
    }

    //Builder pattern
    public static class Builder
    {
        private String transportID;
        private String typeOfTransport;

        public Transport.Builder TransportID(String transportID) {
            this.transportID = transportID;
            return this;
        }

        public Transport.Builder TypeOfTransport(String typeOfTransport) {
            this.typeOfTransport = typeOfTransport;
            return this;
        }

        //builder copy
        public Builder copy(Transport transport)
        {
            this.transportID = transport.getTransportID();
            this.typeOfTransport = transport.getTypeOfTransport();
            return this;
        }

        public Transport build()
        {
            return new Transport(this);
        }
    }
}