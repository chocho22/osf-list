package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;

public class Execute {
	public static void main(String[] args) {
		FoodController fc = new FoodController();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();

		// select food list
//		req.put("cmd", "foodlist");
//		fc.doGet(req, res);
//		System.out.println(res);

		
		// select food
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd", "food");
//		req.put("number", "5");
//		fc.doGet(req, res);
//		System.out.println(res);

//		req.put("cmd","insert");
//		req.put("number","5");
//		req.put("name","피자");
//		req.put("price","22000");
//		fc.doPost(req,res);
//		System.out.println(res);
//		
		
		// update food
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd", "update");
//		req.put("number", "4");
//		req.put("name", "해장국");
//		req.put("price", "6000");
//		fc.doPost(req, res);
//		
//		req.put("cmd", "foodlist");
//		fc.doGet(req, res);
//		System.out.println(res);

		
		// delete food
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "delete");
		req.put("number", "1");
		fc.doPost(req, res);

		req.put("cmd", "foodlist");
		fc.doGet(req, res);
		System.out.println(res);

		
		// insert food
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "insert");
		req.put("name", "메론");
		req.put("number", "6");
		req.put("price", "20000");
		fc.doPost(req, res);
		
		req.put("cmd", "foodlist");
		fc.doGet(req, res);
		System.out.println(res);
	}
}
