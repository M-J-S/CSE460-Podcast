//************************************************************************************
//
//	Name:   Matthew Sarantos
//	ID:     1203587172
//	Course: CSE 460 
//
//
//*************************************************************************************


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Podcast  {

	private String subscribedCategories;

	private String publishedCategories;


//@Begin	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = args[0];
		Scanner sc = new Scanner(new File(fileName));				// Scanner will use the file input stored in fileName
		

	

		
		

	do{
			String textLine = sc.nextLine().substring(0);		// whatever the input is on the first line it is stored to String textLine 
			String[] tokens = textLine.split(",");				// textLine is parsed splitting up each substring by using the "," char
																// the substrings are then stored into String array titled tokens
			
			
			if(tokens[0].equalsIgnoreCase("Subscribe")){		//if first substring = subscribe then run subscribe method with the other 2 substrings as parameters
				subscribe(tokens[1],tokens[2]); 
			}
			
			
			
			else if(tokens[0].equalsIgnoreCase("Publish")){		//if first substring = publish then run notify method with the other 3 substrings as parameters
				notify(tokens[1],tokens[2],tokens[3]);
			}
			
			
			
			else if(tokens[0].equalsIgnoreCase("Unsubscribe")){	//if first substring = unsubscribe then run unsubscribe method with the other 2 substrings as parameters
				unsubscribe(tokens[1],tokens[2]); 
			}
			
			
			else{
				System.out.println("error");					//print error if the format is wrong or the first string isnt one of the first 3
			}
			
			
			
	}while(sc.hasNext());										//do-while loop runs until there is no more input in the file
	
	
}
		
				

	static ArrayList<Subscriber> SubscribersList = new ArrayList<Subscriber>();		//create a new array list of subscriber objects



	

	public static void subscribe(String subscriberName, String category) {			//subscribe method that will add a new subscriber object to the array list "subscriberslist"
	
		
		SubscribersList.add(new Subscriber(subscriberName, category));
		
	}

	
	
	public static void unsubscribe(String subscriberName, String category) {		// unsubscribe method that will check if the category parameter is equal for every subscriber in the array list to the input
		
		for(int i=0;i<SubscribersList.size();i++){
			
			if(category.equals(SubscribersList.get(i).getSubscribedCategories())){	//if it is equal it will remove the subscriber from the subscriber list
				SubscribersList.remove(i);
				}
			
			

			}
				
		

	}

	

	
	
	public static void notify(String companyName, String category, String notification) throws FileNotFoundException    {		//notify method will notify subscribed users based off their category and then send them the message if the category matches
		





		for(int i=0;i<SubscribersList.size();i++){														//iterates through the subscribersList
		
			if(category.equals(SubscribersList.get(i).getSubscribedCategories())){


		System.out.println(SubscribersList.get(i).subscriberNamePrivate.toLowerCase() + " notified of " + notification.toLowerCase() + " from " + companyName.toLowerCase());
		}

		
		
}



		
		
	}
	
	
	
//@End	

}
