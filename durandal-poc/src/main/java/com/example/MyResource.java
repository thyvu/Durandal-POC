package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	private final DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type. 
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return this.formatter.format(new Date());
    }
}
