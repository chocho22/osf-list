package osf.list.data;

import java.util.ArrayList;
import java.util.List;

import osf.list.vo.FoodVO;

public class FoodData {
	public static final List<FoodVO> FOOD_LIST = new ArrayList<>();
	static {
		FoodVO food = new FoodVO();
		food.setNumber(1);
		food.setName("참치");
		food.setPrice(98000);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		food.setNumber(2);
		food.setName("마라탕");
		food.setPrice(15000);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		food.setNumber(3);
		food.setName("훠궈");
		food.setPrice(99000);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		food.setNumber(4);
		food.setName("방어회");
		food.setPrice(50000);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		food.setNumber(5);
		food.setName("대하소금구이");
		food.setPrice(50000);
		FOOD_LIST.add(food);

	}
}
