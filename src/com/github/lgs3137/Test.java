package com.github.lgs3137;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class Test extends UiAutomatorTestCase {
	
	public static void main (String [] args){

        String jarName = "AppTest";
        String testClass = "com.github.lgs3137.Test";
        String testName ="testDemo";
        String androidId ="1";
        new UiAutomatorHelper(jarName,testClass,testName,androidId);
    }

	public void testDemo() throws UiObjectNotFoundException {

		UiDevice.getInstance().pressHome();	//返回桌面首页

		UiObject info = new UiObject(new UiSelector().text("信息"));		//定位“信息”
		info.clickAndWaitForNewWindow();	//打开“信息”
		sleep(1000);	//等待1秒

		UiObject creat = new UiObject(new UiSelector().resourceId("com.android.mms:id/create_new_btn"));
		creat.clickAndWaitForNewWindow();
		sleep(1000);

		UiObject rec_edit = new UiObject(new UiSelector().resourceId("com.android.mms:id/mz_recipient_edit"));
		rec_edit.click();
		UiDevice.getInstance().pressDelete();
		rec_edit.setText("10086");
		sleep(1000);

		UiObject text_edit = new UiObject(new UiSelector().resourceId("com.android.mms:id/embedded_text_editor"));
		text_edit.click();
		UiDevice.getInstance().pressDelete();
		text_edit.setText("6666");
		sleep(500);

		UiObject pull = new UiObject(new UiSelector().resourceId("com.android.mms:id/right_btn"));
		pull.clickAndWaitForNewWindow();
		UiDevice.getInstance().pressBack();
		
	}

}
