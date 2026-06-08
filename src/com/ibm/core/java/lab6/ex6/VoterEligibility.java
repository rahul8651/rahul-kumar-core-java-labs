package com.ibm.core.java.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class VoterEligibility {

    public static List<Integer> votersList(Map<Integer, LocalDate> personMap) {

        List<Integer> voterIds = new ArrayList<>();

        LocalDate today = LocalDate.now();

        for (Map.Entry<Integer, LocalDate> entry : personMap.entrySet()) {

            int id = entry.getKey();
            LocalDate dob = entry.getValue();

            int age = Period.between(dob, today).getYears();

            if (age > 18) {
                voterIds.add(id);
            }
        }

        return voterIds;
    }

    public static void main(String[] args) {

        Map<Integer, LocalDate> persons = new HashMap<>();

        persons.put(101, LocalDate.of(2000, 5, 10));
        persons.put(102, LocalDate.of(2010, 8, 15));
        persons.put(103, LocalDate.of(1998, 12, 20));
        persons.put(104, LocalDate.of(2008, 3, 25));

        List<Integer> voters = votersList(persons);

        System.out.println("Eligible Voter IDs: " + voters);
    }
}