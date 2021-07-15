package HW1;

import java.io.*;
import java.util.*;

public class Card{
	
	//Below are provided attributes of cards
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 9;
	public static final String[] COLORS = {"blue", "green", "red", "yellow"};
	
	private String color;
	private int value;
	
	//Constructor
	Card(String color, int value){
		setColor(color);
		setValue(value);
	}//end of Constructor
	
	public static boolean isValidColor(String name) {
		for(String eachcolor : COLORS) {
			if(eachcolor.equals(name))
				return true;
		}
		return false;
	}
	
	public void setColor(String color) {
		if(isValidColor(color))
			this.color = color;
		else
			throw new IllegalArgumentException();
	}
	
	public void setValue(int value) {
		if(MIN_VALUE <= value && value <= MAX_VALUE)
			this.value = value;
		else
			throw new IllegalArgumentException();
	}
	
	public String getColor() {
		return this.color;
	}
		
	public int getValue() {
		return this.value;
	}
	
	public boolean matches(Card that) {
		if(that == null) return false;
		if(this.color.equals(that.color) || this.value == that.value)
			return true;
		else
			return false;
	}
	
	public boolean equals(Card that) {
		if(that == null) return false;
		if(this.color.equals(that.color) && this.value == that.value)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return this.color + this.value;
	}
	
}
