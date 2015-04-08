package cis550.controller;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.HashMap;

public class FunWithDB {

		private ArrayList<DBLayer> dbList;
		private ResultSet rs;

		public FunWithDB(ResultSet rs)
		{
			this.rs=rs;
		}
		
//		public void display()
//		{
//			for (DBLayer db: this.dbList)
//			{
////				System.out.print("Categories:"+db.getBusiness().getCategories()+"\t");
////				System.out.print("Name:"+db.getBusiness().getName()+"\t");
////				System.out.print("City:"+db.getBusiness().getCity()+"\t");
////				System.out.print("State:"+db.getBusiness().getState()+"\t");
////				System.out.print("Full_address:"+db.getBusiness().getFull_address()+"\n");
//			//	System.out.print("Full_address:"+db.getBusiness().getYelp_attributes()+"\n");
//				System.out.print("Hours:"+db.getBusiness().getHours()+"\n");
//				System.out.println("Next record:");
//				
//			}
//		}
			
		
		
		public void experiment(Statement stmt)
		{
			String category = "Restaurant";
			ArrayList<Integer> list = new ArrayList<Integer>();
			HashMap<Integer,Float> map = new HashMap<Integer,Float>();
			PriorityQueue <Float> valueList = new PriorityQueue <Float>();
			String currCategory="";
			String sql="";
			int review_count =0;
			try{
				while (rs.next())
				{
					currCategory= rs.getString("categories");
					if (currCategory.toLowerCase().contains(category.toLowerCase()))
					{
						Integer id = rs.getInt("id");
						review_count = rs.getInt("review_count");
						sql = "select * from reviews where business_id ="+ 
								id.toString();
						ResultSet rs1 = stmt.executeQuery(sql);
						float score = calcScore(rs1, review_count);
						map.put(id, score);
						valueList.add(score);
					}
				}
				for (Float e: valueList)
				{
					System.out.println(e);
				}
				
				
				
//				for (Integer i: list)
//					System.out.println(i);
			}
			catch (SQLException se)
			{
				se.printStackTrace();
			}
		}
		
		private float calcScore(ResultSet rs1, int review_count)throws SQLException
		{
			float score =0;
			float check = 4/7;
			System.out.println(check);
			int [] count_array = new int [5];
			while (rs1.next())
			{
				//System.out.println(rs1.getFloat("stars"));
				int stars = (int) rs1.getFloat("stars");
			//	System.out.println(stars);
				switch (stars)
				{
					case 5: count_array[4]+=1;
							break;
					case 4: count_array[3]+=1;
							break;
					case 3: count_array[2]+=1;
							break;
					case 2: count_array[1]+=1;
							break;
					case 1: count_array[0]+=1;
							break;
					default: break;
				}
			}
			for (int i=0; i< 5; i++)
				score+= (count_array[i]/review_count)*(i+1/10);
			
			return score;
				
		}
		public float distance(float lat1, float lat2, float lon1, float lon2)
		{
			float R = 6371000;
			return 0;
		}
		
}
