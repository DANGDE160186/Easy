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

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PaymentsId generated by hbm2java
 */
@Embeddable
public class PaymentsId implements java.io.Serializable {

  private int customerNumber;
  private String checkNumber;

  public PaymentsId() {
  }

  public PaymentsId(int customerNumber, String checkNumber) {
    this.customerNumber = customerNumber;
    this.checkNumber = checkNumber;
  }

  @Column(name = "customerNumber", nullable = false)
  public int getCustomerNumber() {
    return this.customerNumber;
  }

  public void setCustomerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
  }

  @Column(name = "checkNumber", nullable = false, length = 50)
  public String getCheckNumber() {
    return this.checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof PaymentsId))
      return false;
    PaymentsId castOther = (PaymentsId) other;

    return (this.getCustomerNumber() == castOther.getCustomerNumber())
        && ((this.getCheckNumber() == castOther.getCheckNumber()) || (this
            .getCheckNumber() != null && castOther.getCheckNumber() != null && this
            .getCheckNumber().equals(castOther.getCheckNumber())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + this.getCustomerNumber();
    result = 37 * result
        + (getCheckNumber() == null ? 0 : this.getCheckNumber().hashCode());
    return result;
  }

}
