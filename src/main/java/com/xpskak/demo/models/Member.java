package com.xpskak.demo.models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")
public class Member {

    Long id;

    Long team_id;

    String name;

    Date birthday;

    String phoneNr;

    String email;

    int rank;

    Long login_id;
}
