package cse0518.pg_api.request.payco;

import com.google.gson.annotations.SerializedName;

public class OrderStatusData {

	@SerializedName("status")
	private String status;
	
	public OrderStatusData(String status) {
		this.status = status;
	}
	
}
