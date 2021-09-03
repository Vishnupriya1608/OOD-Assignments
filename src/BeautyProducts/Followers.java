package BeautyProducts;

public class Followers {
	private String Name;
	private BeautyPage PageName = new BeautyPage();
	private String Mobilenumber;
	
	// constructor for class Followers
	public Followers(String name, String mobilenumber) {
		super();
		Name = name;
		Mobilenumber = mobilenumber;
	}
	
	public void update()
	{
		
		// Message to notify the followers
		System.out.println("Hey " +Name+ ", Beauty Product uploaded : " + PageName.ProductName+ ". Please use Maya16 for 10% discount");
	}
	
	public void FollowBeautyPage(BeautyPage pg) {
		PageName = pg;
	}
}
