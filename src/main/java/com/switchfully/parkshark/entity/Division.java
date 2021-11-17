package com.switchfully.parkshark.entity;

import javax.persistence.*;

@Entity
@Table(name = "Division")
public class Division {

    @Id
    @Column(name = "div_id")
    @SequenceGenerator(name = "Division_div_id_seq", sequenceName = "Division_div_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Division_div_id_seq")
    private int id;

    @Column(name = "div_name")
    private String name;

    @Column(name = "div_original_name")
    private String originalName;

    @OneToOne
    @JoinColumn(name = "div_director_id")
    private Employee director;

    @OneToOne
    @JoinColumn(name = "div_upper_div_id")
    private Division upperDivision;

    public Division(String name, String originalName, Employee director, Division upperDivision) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
        this.upperDivision = upperDivision;
    }

    public Division() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Employee getDirector() {
        return director;
    }

    public Division getUpperDivision() {
        return upperDivision;
    }

    public static class DivisionBuilder{
        private String name;
        private String originalName;
        private Employee employee;
        private Division division;

        public DivisionBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DivisionBuilder setOriginalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        public DivisionBuilder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public DivisionBuilder setDivision(Division division) {
            this.division = division;
            return this;
        }

        public Division build(){
            return new Division(name, originalName, employee, division);
        }
    }
}
