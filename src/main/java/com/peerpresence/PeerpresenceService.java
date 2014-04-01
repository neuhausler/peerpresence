package com.peerpresence;

import com.peerpresence.health.*;
import com.peerpresence.resources.*;
import com.yammer.dropwizard.*;
import com.yammer.dropwizard.config.*;


public class PeerpresenceService extends Service<PeerpresenceConfiguration>
{
	public static void main(String[] args) throws Exception
	{
		new PeerpresenceService().run(args);
	}

	@Override
	public void initialize(Bootstrap<PeerpresenceConfiguration> bootstrap)
	{
		bootstrap.setName("Peerpresence");
	}

	@Override
	public void run(PeerpresenceConfiguration configuration, Environment environment)
	{
        String pong= configuration.getPong();

		environment.addResource(new PingPongResource(pong));
		environment.addHealthCheck(new PeerpresenceHealthCheck("foo"));
	}

}