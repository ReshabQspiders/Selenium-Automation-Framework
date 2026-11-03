package com.demowebshop.GenericUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	Select select;
	//Selection
	public void selectAnOption(WebElement selectElement,String value) {
		select=new Select(selectElement);
		select.selectByValue(value);
		
	}
	public void selectAnOption(WebElement selectElement,int Index) {
		select=new Select(selectElement);
		select.selectByIndex(Index);
}
	public void selectAnOption(String visibalText,WebElement selectElement ) {
		select=new Select(selectElement);
		select.selectByContainsVisibleText(visibalText);
}
	//Deselection
    public void deselectAnoption(WebElement deselectElement , String value) {
		select = new Select(deselectElement);
		select.deselectByValue(value);
	}
    public void deselectAnOption(WebElement deselectElement , int index) {
		select = new Select(deselectElement);
		select.deselectByIndex(index);
	}
    public void deselectAnOption(String visibleText , WebElement deselectElement) {
		select = new Select(deselectElement);
		select.deselectByVisibleText(visibleText);
	}
    public void deselectAnOption(int value , String visiabletext , WebElement deselectElement ,String ContainsvisiableText ) {
		select = new Select(deselectElement);
		select.deselectAll();
	}
    public void deselectAnoption(String containsVisiableText , String visiabletext , int value , WebElement deselectElement) {
		select = new Select(deselectElement);
		select.deSelectByContainsVisibleText(visiabletext);
	}	
}
