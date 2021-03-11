package com.ltts.demowebproject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demowebproject.configure.MyConnection;
import com.ltts.demowebproject.model.Aution;
import com.ltts.demowebproject.model.Player;

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
	public List<Aution> getAllAutions() throws Exception{
		List<Aution> li=new ArrayList<Aution>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from Aution");
		//Aution a=new Aution();
		while(rs.next()) {
			li.add(new Aution(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
			
		}
		return li;
		
	}
	public Aution getAutionById(int id) throws Exception {
		Aution a=new Aution(id, id, id, id, id);
		List<Aution> li=getAllAutions();
		for(Aution a1:li) {
			if(a1.getAutionid() == id) {
				a.setPlayerid(id);
				a.setTeamid(id);
				a.setYear(id);
				a.setAmount(id);
			}
		}
		
		return a;
	}

}
