package io.paradoxical.common.web.web;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class CorrelationRequestContext {

	@Getter
	@Setter
	private UUID correlationId;
	
}