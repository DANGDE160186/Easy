/*******************************************************************************
* Copyright (c) 2015 lostinsoftware. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*
* Contributors:
*          lostinsoftware - initial implementation and ongoing maintenance
*          
*******************************************************************************/
package com.lostinsoftware.classicmodels.model;

// Generated 12-ago-2015 22:07:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "employees", catalog = "classicmodels")
public class Employees implements java.io.Serializable {

  private int employeeNumber;
  private Employees employees;
  private Offices offices;
  private String lastName;
  private String firstName;
  private String extension;
  private String email;
  private String jobTitle;
  private Set<Employees> employeeses = new HashSet<Employees>(0);
  private Set<Customers> customerses = new HashSet<Customers>(0);

  public Employees() {
  }

  public Employees(int employeeNumber, Offices offices, String lastName,
      String firstName, String extension, String email, String jobTitle) {
    this.employeeNumber = employeeNumber;
    this.offices = offices;
    this.lastName = lastName;
    this.firstName = firstName;
    this.extension = extension;
    this.email = email;
    this.jobTitle = jobTitle;
  }

  public Employees(int employeeNumber, Employees employees, Offices offices,
      String lastName, String firstName, String extension, String email,
      String jobTitle, Set<Employees> employeeses, Set<Customers> customerses) {
    this.employeeNumber = employeeNumber;
    this.employees = employees;
    this.offices = offices;
    this.lastName = lastName;
    this.firstName = firstName;
    this.extension = extension;
    this.email = email;
    this.jobTitle = jobTitle;
    this.employeeses = employeeses;
    this.customerses = customerses;
  }

  @Id
  @Column(name = "employeeNumber", unique = true, nullable = false)
  public int getEmployeeNumber() {
    return this.employeeNumber;
  }

  public void setEmployeeNumber(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "reportsTo")
  public Employees getEmployees() {
    return this.employees;
  }

  public void setEmployees(Employees employees) {
    this.employees = employees;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "officeCode", nullable = false)
  public Offices getOffices() {
    return this.offices;
  }

  public void setOffices(Offices offices) {
    this.offices = offices;
  }

  @Column(name = "lastName", nullable = false, length = 50)
  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Column(name = "firstName", nullable = false, length = 50)
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column(name = "extension", nullable = false, length = 10)
  public String getExtension() {
    return this.extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  @Column(name = "email", nullable = false, length = 100)
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "jobTitle", nullable = false, length = 50)
  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
  public Set<Employees> getEmployeeses() {
    return this.employeeses;
  }

  public void setEmployeeses(Set<Employees> employeeses) {
    this.employeeses = employeeses;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
  public Set<Customers> getCustomerses() {
    return this.customerses;
  }

  public void setCustomerses(Set<Customers> customerses) {
    this.customerses = customerses;
  }

}
