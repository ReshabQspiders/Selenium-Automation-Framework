package com.demowebshop.generic_utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	Select select;
	//Selection
	public void selectAnOption(WebElement selectElement,String value) {
		select=new Select(selectElement);
		select.selectByValue(value);
	}
	public void selectAnOption(WebElement selectElement,int index) {
		select=new Select(selectElement);
		select.selectByIndex(index);
	}
	public void selectAnOption(String visibleText,WebElement selectElement) {
		select=new Select(selectElement);
		select.selectByContainsVisibleText(visibleText);
	}
	//Deselection
	public void deselectAnOption(WebElement selectElement,String value) {
		select=new Select(selectElement);
		select.deselectByValue(value);
	}
	public void deselectAnOption(WebElement selectElement,int index) {
		select=new Select(selectElement);
		select.deselectByIndex(index);
	}
	public void deselectAnOption(String visibleText,WebElement selectElement) {
		select=new Select(selectElement);
		select.deSelectByContainsVisibleText(visibleText);
	}

}
