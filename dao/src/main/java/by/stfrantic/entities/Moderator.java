package by.stfrantic.entities;

import lombok.Data;

import javax.persistence.*;


    @Entity
    @Table(name = "users")
    @Data
    public class Moderator {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column (name = "email", unique = true)
        private  String email;
        @Column (name = "password")
        private String password;
        @Column (name= "firstname")
        private String firstname;
        @Column (name="lastname")
        private String lastname;
        @Column (name="mobile")
        private String mobile;
        @Column (name="city")
        private String city;
        @Column (name="street")
        private String street;
        @Column (name="building")
        private String building;
        @Column (name="housing")
        private String housing;
        @Column (name="flat")
        private String flat;

        public Moderator() {
        }
    }

