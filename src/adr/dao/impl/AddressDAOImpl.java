package adr.dao.impl;

import java.util.List;
import java.util.Map;

import adr.dao.AddressDAO;
import adr.data.AddressData;

public class AddressDAOImpl implements AddressDAO {
	@Override
	public List<Map<String, String>> selectAddressList() {
		return AddressData.ADDRESS_LIST;
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
		for (Map<String, String> a : AddressData.ADDRESS_LIST) {
			if (a.get("이름").indexOf(address.get("이름"))>=0) {
				return a;
			}
		}
		return null;
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {
		return AddressData.ADDRESS_LIST.add(address);
	}

	@Override
	public boolean updateAddress(Map<String, String> address) {
		for (int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			if (a.get("이름").indexOf(address.get("이름"))>=0) {
				if (address.get("번호") != null) {
					a.put("번호", address.get("번호"));
				}
				if (address.get("주소") != null) {
					a.put("주소", address.get("주소"));
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteAddress(Map<String, String> address) {
		for (int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			if (a.get("이름").indexOf(address.get("이름"))>=0) {
				AddressData.ADDRESS_LIST.remove(i);
				return true;
			}
		}
		return false;
	}
}
