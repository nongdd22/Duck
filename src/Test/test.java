package Test;

import Model.Duck;
import Model.MallardDuck;
import Model.RedheadDuck;
import Model.RubberDuck;

public class test {
	public static void main(String[] args) { 
		Duck duck1 = new MallardDuck(); 
		System.out.println("第一只鸭子"); 
		duck1.performFly(); 
		duck1.performQuack(); 

		System.out.println("\n"); 	 
		Duck duck2 = new RubberDuck(); 
		System.out.println("第二只鸭子"); 
		duck2.performFly(); 
		duck2.performQuack(); 
		 		 
		System.out.println("\n"); 
		Duck duck3 = new RedheadDuck(); 
		System.out.println("第三只鸭子"); 
		duck3.performFly(); 
		duck3.performQuack(); 
				 
		 	} 

}
