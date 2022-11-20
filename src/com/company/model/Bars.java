package com.company.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class Bars {
    List<Bar> currentBars = new ArrayList<Bar>();

    public Bars() {
        for (int i = 0; i < 10; i++) {
            Bar newBar = new Bar(i, "bar " + i, 4.5);
            currentBars.add(newBar);
        }
    }
}
