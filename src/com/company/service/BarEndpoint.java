package com.company.service;

import com.company.model.Bar;
import com.company.model.Bars;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("bars")
public class BarEndpoint {

    @GET
    public List<Bar> getBars() {
        Bars bars = new Bars();
        return bars.getCurrentBars();
    }

    @GET
    @Path("/{id}")
    public Bar getBar(@PathParam("id") int id) {
        Bars bars = new Bars();
        for (int i = 0; i < bars.getCurrentBars().size(); i++) {
            if (bars.getCurrentBars().get(i).getId() == id) {
                return bars.getCurrentBars().get(i);
            }
        }
        return null;
    }
}
