package com.xworkz.corejava.objectClass.equal_To;

import java.util.Objects;

public class Ac {

	String brand;
	int stars;
	double price;
	String color;

	Ac(String brand,int stars,double price,String color){
		this.brand = brand;
		this.stars = stars;
		this.price = price;
		this.color = color;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(brand, color, price, stars);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Ac other = (Ac) obj;
//		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && stars == other.stars;
//	}	
	
	public boolean equals(Object obj) {
			if(obj instanceof Ac) {
				Ac ac = (Ac)obj;
				if(this.brand== ac.brand) {
					if(this.stars ==ac.stars) {
						if(this.price == ac.price) {
							if(this.color == ac.color) {	
								return true;
							}
							else {
								return false;
							}
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
			}		
			else {
				return false;
			}
			return false;
			}
			
					
}
		
	
