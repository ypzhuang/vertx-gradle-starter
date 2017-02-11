package io.vertx.starter;

import java.util.concurrent.atomic.AtomicInteger;

import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class Whisky {
	private Logger log = LoggerFactory.getLogger(Whisky.class);

	private static final AtomicInteger COUNTER = new AtomicInteger();

	private final int id;

	private String name;

	private String origin;

	public Whisky(String name, String origin) {
		log.debug("construct Whisky:"+name + " " + origin);
		this.id = COUNTER.getAndIncrement();
		this.name = name;
		this.origin = origin;
	}

	public Whisky() {
		log.debug("construct Whisky()");
		this.id = COUNTER.getAndIncrement();
	}

	public String getName() {
		return name;
	}

	public String getOrigin() {
		return origin;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
