package Model;

//抽象类，所有鸭子的父类
public abstract class Duck {

	 QuackBehavior quackBehavior; 
	 FlyBehavior flyBehavior; 
	      
	 public void performQuack() { 
		 quackBehavior.quack(); 
	 } 
	 public void performFly() { 
	 	 flyBehavior.fly(); 

	 }
}
