package com.ltts.demowebproject.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demowebproject.configure.MyConnection;
import com.ltts.demowebproject.model.Player;
import com.ltts.demowebproject.model.User;

public class UserDao {
	public boolean insertUser (User u) throws Exception 
	{
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into User values(?,?,?,?,?,?)");
		ps.setString(1, u.getEmailid());
		ps.setInt(2, u.getMobile());
		ps.setString(3, u.getName());
		ps.setString(1, u.getPassword());
		ps.setString(2, u.getAddress());
		ps.setInt(3, u.getDOB());
		return ps.execute();
		//return false;
		
	}
		public List<Player> getAllPlayers() throws Exception{ 
			List<Player> li=new ArrayList<Player>();
			Connection mc=MyConnection.getConnection(); // TRanfers control to another 
			Statement ps=mc.createStatement();
			ResultSet rs=ps.executeQuery("select * from Player");
			//Player p=new Player();
			while(rs.next()) {
				li.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3)));
				
			}
			return li;
			
		}
		public Player getPlayerById(int id) throws Exception {
			Player p=new Player();
			List<Player> li=getAllPlayers();
			for(Player p1:li) {
				if(p1.getPlayerId() == id) {
					p.setPlayerId(id);
					p.setPlayerName(p1.getPlayerName());
					p.setCountry(p1.getCountry());
				}
			}
			
			return p;
		}

}
