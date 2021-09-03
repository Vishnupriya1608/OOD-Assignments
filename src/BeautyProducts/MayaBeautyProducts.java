package BeautyProducts;

public class MayaBeautyProducts {
public static void main(String args[])
{
	BeautyPage JKBeautyProducts = new BeautyPage();
	
	// List of followers
	Followers F1 = new Followers("Vishnu Priya","9876543210");
	Followers F2 = new Followers("Sahasra","8765432109");
	Followers F3 = new Followers("Kavya","7654321098");
	Followers F4 = new Followers("Saranya","6543210987");
	Followers F5 = new Followers("Siri","5432109876");
	
	//followers following beauty product Page 
	JKBeautyProducts.Follow(F1);
	JKBeautyProducts.Follow(F2);
	JKBeautyProducts.Follow(F3);
	JKBeautyProducts.Follow(F4);
	JKBeautyProducts.Follow(F5);
	
	//followers unfollowing beauty product Page 
	JKBeautyProducts.unFollow(F2);

	
	F1.FollowBeautyPage(JKBeautyProducts);
	F2.FollowBeautyPage(JKBeautyProducts);
	F3.FollowBeautyPage(JKBeautyProducts);
	F4.FollowBeautyPage(JKBeautyProducts);
	F5.FollowBeautyPage(JKBeautyProducts);
	
	
	//BeautyPage uploaded a new Product
	JKBeautyProducts.upload("JK Face wash");
	
}
}
