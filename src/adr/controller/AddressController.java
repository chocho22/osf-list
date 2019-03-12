package adr.controller;

import java.util.HashMap;
import java.util.Map;

import adr.service.AddressService;
import adr.service.impl.AddressServiceImpl;

public class AddressController {

	private AddressService as = new AddressServiceImpl();

	public void doGet(Map<String, String> req, Map<String, Object> res) {
		String cmd = req.get("cmd");
		String name = req.get("name");
		Map<String, String> address = new HashMap<>();
		address.put("이름", name);
		if ("addresslist".equals(cmd)) {
			res.put("addresslist", as.selectAddressList());
		} else if ("address".equals(cmd)) {
			res.put("address", as.selectAddress(address));
		}
	}

	public void doPost(Map<String, String> req, Map<String, Object> res) {
		String cmd = req.get("cmd");
		String name = req.get("name");
		String number = req.get("number");
		String adr = req.get("adr");
		Map<String,String> address = new HashMap<>();
		address.put("이름", name);
		address.put("번호", number);
		address.put("주소", adr);
		
		if("insert".equals(cmd)) {
			res.put("insert", as.insertAddress(address));
		}else if ("update".equals(cmd)) {
			res.put("update", as.updateAddress(address));
		}else if ("delete".equals(cmd)) {
			res.put("delete", as.deleteAddress(address));
		}
	}
}
