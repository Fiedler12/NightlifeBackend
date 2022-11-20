package com.company.service;


import com.company.model.Bar;
import com.company.model.Bars;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("test")
public class TestService {
    Bars bars = new Bars();

    @GET
    public List<Bar> getTest() {
        return bars.getCurrentBars();
    }

}
