package com.aws.codestar.projecttemplates.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Address {

    private String origin;
    private String originType;
    private GeoPosition originGeoConding; // add lat e lon
    private HashMap<String, String> originMetainfo;

    private ArrayList<String> crossNode; // pickup path - tracking
    private String destination;

    private String preferredWindowTime; // when the house is open, doorman work hours
    private String mandatoryWindowTime;
    private String deliveryType; // at door, hype, floor
    private String metaInfo;

}
