package com.aws.codestar.projecttemplates.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import sun.jvm.hotspot.utilities.BitMap;

public class Order {


    private long orderId;

    private Address address;
    private ArrayList<Parcel> parcel;
    private Customer customer;
    private Receiver receiver;
    private Dimension dimension;
    private Contract contract; // foto del contratto
    private GeoPosition geoPosition;

    private Long price;
    private Packaging packaging;
    private OrderType type;
    private Status status;
    private String preparationTime; // default 1h
    private HashMap<Address, HashMap<Date, Date>> pickUpTimeWindowList;
    private HashMap<Address, HashMap<Date, Date>> pickUpTimeExtimetedWindowList;
    private ArrayList<Date> timeSlot;

    private ProofOfAttemptedDelivery proofOfAttemptedDelivery;

    private Insurance insurance;

    private ReferredPerson referredPerson;

}