package com.ltts.demowebproject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demowebproject.configure.MyConnection;
import com.ltts.demowebproject.model.Player;
import com.ltts.demowebproject.model.Team;

public class TeamDao {
	
	public boolean insertTeam(Team t) throws Exception{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into Team values(?,?)");
		ps.setInt(1, t.getTeamid());
		ps.setString(2, t.getTeamname());
		

		return ps.execute();
		//return false;
		
	}
	public List<Team> getAllTeams() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from Team");
		//Team t=new Team();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2)));
			
		}
		return li;
		
	}
	public Team getTeamById(int id) throws Exception {
		Team t = new Team(id, null);
		List<Team> li=getAllTeams();
		for(Team t1:li) {
			if(t1. getTeamid() == id) {
				t.setTeamid(id);
				t.setTeamname(t1.getTeamname());
				
			}
		}
		
		return t;
	}
}
