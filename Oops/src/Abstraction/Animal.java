package Abstraction;

public abstract class Animal {
String name;
 Animal(String name){
	 this.name = name;
 }
 //abstract method implemented by subclass
 abstract void livingPlace();
 //common for all subclass
 void name() {
	 System.out.println("It is:" + name);
 }
}
