//************************************************************************************
//
//	Name:   Matthew Sarantos
//	ID:     1203587172
//	Course: CSE 460 
//
//
//*************************************************************************************


public class Subscriber{
	
	
	private String subscribedCategories;

	String subscriberNamePrivate;
	
	//@Begin

	public Subscriber(String subscriberName, String category) {						//subscriber object with 2 parameters
		
		subscriberNamePrivate = subscriberName;										//subscriber name parameter
		
		setSubscribedCategories(category);											//subscriber category parameter
		

		
	}
																					//toString which will make sure to print the parameter and not the location
	@Override
	public String toString() {
	    return this.getSubscribedCategories();
	}



	public void notify(String category, String notification) {

	}

	public String getSubscribedCategories() {										//get method 
		return subscribedCategories;
	}

	public void setSubscribedCategories(String subscribedCategories) {				//set method
		this.subscribedCategories = subscribedCategories;
	}
	
	
	//@End
}




