package com.peerpresence.resources;

import java.util.concurrent.atomic.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.peerpresence.core.*;
import com.yammer.metrics.annotation.*;


@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingPongResource
{
	private final AtomicLong counter;
	private final String     pong;

	public PingPongResource(String pong)
	{
		this.counter= new AtomicLong();
		this.pong   = pong;
	}

	@GET
	@Timed
	public Saying sayPing()
	{
		return new Saying(counter.incrementAndGet(), pong);
	}

}
