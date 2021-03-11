package com.in28minutes.microservices.limitsservices.bean;

public class Limits {

	private int minimun;
	private int maximum;

	public Limits(int minimun, int maximum) {
		super();
		this.minimun = minimun;
		this.maximum = maximum;
	}

	public Limits() {
		super();
	}

	public int getMinimun() {
		return minimun;
	}

	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
