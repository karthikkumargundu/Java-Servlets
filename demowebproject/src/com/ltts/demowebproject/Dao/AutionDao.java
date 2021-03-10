package com.ltts.demowebproject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.demowebproject.configure.MyConnection;
import com.ltts.demowebproject.model.Aution;

public class AutionDao {
	public boolean insertAution(Aution a) throws Exception{
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into aution values(?,?,?,?,?)");
		ps.setInt(1, a.getAutionid());
		ps.setInt(2, a.getPlayerid());
		ps.setInt(3, a.getTeamid());
		ps.setInt(4, a.getYear());
		ps.setInt(5, a.getAmount());
		return ps.execute();
		//return false;
		
	}
}
