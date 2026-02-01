package com.demo.spring.springcore.reftypes;

public class Scores {
	private Double maths;
	private Double physics;
	private Double cs;
	
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getCs() {
		return cs;
	}
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", cs=" + cs + "]";
	}
	public void setCs(Double cs) {
		this.cs = cs;
	}
}
