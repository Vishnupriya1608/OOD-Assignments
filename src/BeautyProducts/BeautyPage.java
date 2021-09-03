package BeautyProducts;

import java.util.ArrayList;
import java.util.List;

public class BeautyPage {
	
	// to store the list of the followers in a variable
	private List<Followers> fol = new ArrayList<>();
    String ProductName;
	
    //If a new customer follows the page
	public void Follow(Followers foll)
	
	{
	fol.add(foll);
	}
	
	//If a customer unfollow the page
	public void unFollow(Followers foll) {
		fol.remove(foll);
	}
	
	//to notify all the followers when the product is uploaded
	public void notifyFollowers()
	{
		for(Followers foll : fol) {
			foll.update();
		}
	}
	
	// to upload beauty product and calling the function notifyFollowers to notify the Followers
	public void upload(String ProductName) {
		this.ProductName = ProductName;
		notifyFollowers();
	}

}
