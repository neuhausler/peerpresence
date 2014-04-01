package com.peerpresence.health;

import com.yammer.metrics.core.*;


public class PeerpresenceHealthCheck extends HealthCheck
{

	public PeerpresenceHealthCheck(String healthcheckName)
	{
		super(healthcheckName);
	}

	@Override
	protected Result check() throws Exception
	{
		return Result.healthy();
	}
}
