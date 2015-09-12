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
 * OrderdetailsId generated by hbm2java
 */
@Embeddable
public class OrderdetailsId implements java.io.Serializable {

  private int orderNumber;
  private String productCode;

  public OrderdetailsId() {
  }

  public OrderdetailsId(int orderNumber, String productCode) {
    this.orderNumber = orderNumber;
    this.productCode = productCode;
  }

  @Column(name = "orderNumber", nullable = false)
  public int getOrderNumber() {
    return this.orderNumber;
  }

  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  @Column(name = "productCode", nullable = false, length = 15)
  public String getProductCode() {
    return this.productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof OrderdetailsId))
      return false;
    OrderdetailsId castOther = (OrderdetailsId) other;

    return (this.getOrderNumber() == castOther.getOrderNumber())
        && ((this.getProductCode() == castOther.getProductCode()) || (this
            .getProductCode() != null && castOther.getProductCode() != null && this
            .getProductCode().equals(castOther.getProductCode())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + this.getOrderNumber();
    result = 37 * result
        + (getProductCode() == null ? 0 : this.getProductCode().hashCode());
    return result;
  }

}
