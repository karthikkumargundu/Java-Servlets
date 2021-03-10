package com.ltts.demowebproject.model;

public class Team {
			 
			private int teamid;
			private String teamname;
			public Team(int teamid, String teamname) {
				super();
				this.teamid = teamid;
				this.teamname = teamname;
			}
			public int getTeamid() {
				return teamid;
			}
			public void setTeamid(int teamid) {
				this.teamid = teamid;
			}
			public String getTeamname() {
				return teamname;
			}
			public void setTeamname(String teamname) {
				this.teamname = teamname;
			}
			@Override
			public String toString() {
				return "Team [teamid=" + teamid + ", teamname=" + teamname + "]";
			}
			
}

	
	
