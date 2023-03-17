
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Menu menu= new Menu();
		Statistics s= new Statistics();
		do{
		       do 
		         {menu.read();
		        
			     } while(!(menu.rightchoice()));//elegxos an exei epileksei o xristis mia apo tis epiloges tou Menu
		       
		     
				if (menu.getChoice() =='G'||menu.getChoice() =='g') {
					Hang hang= new Hang();
					int right=0;
					
				    do {
				    	
					     do {
			    	         System.out.println("The random word is now:" + hang.getmisWordarray() );
			    	         System.out.println("\nYou have "+hang.getlefttries()+" guesses left. ");
			    	         hang.read();
			    	         if(!(hang.isLetter(hang.getletter())))
			    	    	   System.out.println("You must enter a letter! ");} 
					     while(!(hang.isLetter(hang.getletter()))); // epanalipsi gia elegxo an einai letter to gramma pou evale o xristis
				
					   
					   if (hang.alreadyput(hang.getletter()))
			    		  System.out.println("You already guessed "+ hang.getletter()+"!"); // elegxos an exei valei to idio letter
					   else 
						   if(hang.letterexists(hang.getletter()))
					        {System.out.println("Bravo Correct!!! :) ");
			    	         hang.putletter(hang.getletter());
			    	         right=right+hang.timesexist(hang.getletter());}// prosthiki twn right apantisewn wste na metrithei pote exei vrethei i leksi
					       else{
					         System.out.println("There are no "+hang.getletter()+"'s in this word. ");
					         hang.settries();}// prosthiki twn prospathiwn pou ekane o xristis wste na kathoristei pote tha xasei
					   
					   if(!(hang.alreadyput(hang.getletter())))
					      hang.putguessletter(hang.getletter());//prosthiki twn grammatwn pou vazei o xristis wste na uparxoun ston guessarray
					   
			      
				    }while(right!=hang.getword().length()&&hang.getlefttries()>0);
			    
			      if(hang.getlefttries()>0) {
			         System.out.println("Congratulations!! You guessed the word "+hang.getword());
			         System.out.println("You made "+right+" correct guesses and "+hang.gettries()+" wrong guesses. ");
			         s.setwins();}
			      else 
				     System.out.println("You lost :( The word was "+hang.getword());
				  s.setgames();}
				
		        if(menu.getChoice() =='s'||menu.getChoice() =='S')
		    	s.showstatistics();}
			
		while(menu.getChoice() !='E'&&menu.getChoice() !='e');
				 
	}
}