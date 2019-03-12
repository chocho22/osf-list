package adr.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {
	public static final List<Map<String,String>> ADDRESS_LIST = 
			new ArrayList<>();
	static {
		Map<String,String> map = new HashMap<>();
		map.put("이름", "일이삼");
		map.put("번호", "123");
		map.put("주소", "일이삼동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "사오육");
		map.put("번호", "456");
		map.put("주소", "사오육동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "칠팔구");
		map.put("번호", "789");
		map.put("주소", "칠팔구동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "십");
		map.put("번호", "10");
		map.put("주소", "십동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "십일");
		map.put("번호", "11");
		map.put("주소", "십일동");
		ADDRESS_LIST.add(map);
		
	}
}
