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
            Bar newBar = new Bar(i, "bar " + i, 4.5, "Duis in pharetra ante. Phasellus et sodales enim. Aenean dictum nisi sit amet orci viverra, non efficitur diam dictum. Morbi sit amet interdum quam. Praesent vitae faucibus lorem. Duis malesuada leo eu convallis lacinia. In hac habitasse platea dictumst. Integer dignissim fermentum consequat. In a felis elit.");
            currentBars.add(newBar);
        }
    }
}
