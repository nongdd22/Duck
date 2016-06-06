package Model;

public class RedheadDuck extends Duck{
	public RedheadDuck() { 
		quackBehavior = new MuteQuack(); 
		flyBehavior = new FlyWithRocket(); 
	} 
}
