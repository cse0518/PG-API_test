package cse0518.pg_api.request.naver;

import com.google.gson.annotations.SerializedName;

public class NaverPlaceData {

	@SerializedName("product_order_id")
	private String[] product_order_id;
	
	public void setProductOrderId(String[] product_order_id) {
		this.product_order_id = product_order_id;
	}
	
}
