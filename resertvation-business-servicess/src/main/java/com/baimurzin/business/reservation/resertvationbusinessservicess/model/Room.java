/*
 * Copyright 2018 by HireRight, Inc. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 *
 * History:
 * V.Baimurzin 2019-02-28 Created
 */
package com.baimurzin.business.reservation.resertvationbusinessservicess.model;

import lombok.Data;

@Data
public class Room {

    private Long id;

    private String name;

    private String roomNumber;

    private String bedInfo;
}
