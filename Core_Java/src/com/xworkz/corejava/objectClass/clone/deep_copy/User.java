package com.xworkz.corejava.objectClass.clone.deep_copy;

public class User implements Cloneable {

  String name;
  int id;
  Address addr;
  
  User(String name, int id, Address addr){
	  this.name = name;
	  this.id = id;
	  this.addr = addr;
  }

@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + ", addr="+ addr +"]";
}

@Override
protected Object clone() throws CloneNotSupportedException 
{
	User user = null;
	try {
		user = (User) super.clone();
} catch (CloneNotSupportedException e) {
	  System.out.println("Clonable not sopported");
}
	user.addr = (Address) this.addr.clone();//copy of reference object
	return user;
}

}
  

