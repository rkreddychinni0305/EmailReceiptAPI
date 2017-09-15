package com.americanexpress.email.receipts.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by rchin13 on 9/15/17.
 */
@Path("/email")
@Component
public class EmailReceiptRestApi {

    private static final Logger logger = LoggerFactory.getLogger(EmailReceiptRestApi.class);

    @GET
    @Path("/receipts")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getEmailReceipts(){

        return Response.status(Response.Status.OK).entity("").build();
    }


    @GET
    @Path("/receipts/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getEmailReceiptDetails(){

        return Response.status(Response.Status.OK).entity("").build();
    }
}
