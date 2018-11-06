package com.rsy.Except;
/**
*@author Nico
*2018年7月17日下午7:00:28
*/
public class FoodException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 446900149590740217L;

	//定义异常类型
	private int foodExceptionType;
	
	//定义不同的业务异常类型:金属，土，洗浴用品，电子产品
	public static final int TYPE_METAL = 1;
	
	public static final int TYPE_SOIL = 2;
	
	public static final int TYPE_BATH = 3;
	
	public static final int TYPE_ELECT = 4;
	
	public FoodException(int foodExceptionType) {
		this.foodExceptionType = foodExceptionType;
	}
	
	public String getMessage(){
		if (this.foodExceptionType == FoodException.TYPE_METAL) {
			return "自定义业务异常：不可以吃金属";
		}else if(this.foodExceptionType == FoodException.TYPE_SOIL) {
			return "自定义业务异常：不可以吃土";
		}else if(this.foodExceptionType == FoodException.TYPE_BATH) {
			return "自定义业务异常：不可以吃沐浴露";
		}else if(this.foodExceptionType == FoodException.TYPE_ELECT) {
			return "自定义业务异常：不可以吃电子产品";
		}
		return "未定义类型的自定义异常";
	}

	public int getFoodExceptionType() {
		return foodExceptionType;
	}

	
}
