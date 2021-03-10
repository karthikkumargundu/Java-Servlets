package com.ltts.demowebproject.model;

public class Aution {
	private int autionid;
	private int playerid;
	private int teamid;
	private int year;
	private int amount;
	public Aution(int autionid, int playerid, int teamid, int year, int amount) {
		super();
		this.autionid = autionid;
		this.playerid = playerid;
		this.teamid = teamid;
		this.year = year;
		this.amount = amount;
	}
	public int getAutionid() {
		return autionid;
	}
	public void setAutionid(int autionid) {
		this.autionid = autionid;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Aution [autionid=" + autionid + ", playerid=" + playerid + ", teamid=" + teamid + ", year=" + year
				+ ", amount=" + amount + "]";
	}
	
	
}
