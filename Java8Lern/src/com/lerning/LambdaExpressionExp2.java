package com.lerning;

interface Drawable {
	
	public String say( String name);
}

public class LambdaExpressionExp2 {
	
	public static void main(String str[]){
		
				
		Drawable d1=(name)-> {
			
			return "Hello" + name; 
		};
		
		System.out.println("Hi"+ d1.say("Arvind"));
		System.out.println("Hi");
		
	}
	
	

}
