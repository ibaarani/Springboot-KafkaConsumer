package datamodel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "kafkamessage")
public class testdb {


    @Id
    String str;

    public testdb(String str) {
        this.str = str;
    }

    public testdb() {

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
