package com.ltts.demowebproject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.demowebproject.configure.MyConnection;
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
}
