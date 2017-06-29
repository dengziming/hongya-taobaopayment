package com.hongya.log.test;
import com.hongya.log.client.AnalyticsEngineSDK;

public class Test {
	public static void main(String[] args) {
		AnalyticsEngineSDK.onChargeSuccess("orderid123", "hongya_123");
		AnalyticsEngineSDK.onChargeRefund("orderid456", "hongya_456");
	}
}
