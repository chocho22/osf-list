package adr;

import java.util.HashMap;
import java.util.Map;

import adr.controller.AddressController;

public class Execute {
	public static void main(String[] args) {
		AddressController ac = new AddressController();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();
		
		// select addresslist
		req.put("cmd", "addresslist");
		ac.doGet(req, res);
		System.out.println(res);
		
		// select address
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "address");
		req.put("name", "칠팔");
		ac.doGet(req, res);
		System.out.println(res);
		
		// insert address
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","insert");
		req.put("name", "십이");
		req.put("number", "12");
		req.put("adr", "십이동");
		ac.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		req.put("cmd", "addresslist");
		ac.doGet(req, res);
		System.out.println(res);
		
		// update address
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "update");
		req.put("name", "십일");
		req.put("number", "1100");
		req.put("adr", "십일본동");
		ac.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		req.put("cmd", "addresslist");
		ac.doGet(req, res);
		System.out.println(res);
		
		// delete address
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "delete");
		req.put("name", "일이삼");
		ac.doPost(req, res);
		
		req = new HashMap<>();
		req.put("cmd", "addresslist");
		ac.doGet(req, res);
		System.out.println(res);
		
	}
}
