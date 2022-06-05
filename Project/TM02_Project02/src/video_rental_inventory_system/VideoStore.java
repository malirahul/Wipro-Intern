package video_rental_inventory_system;

public class VideoStore {
	
	private Video[] store;
	
	public int getStoreSize() {
		if(store!=null)
			return store.length;
		else
			return 0;
	}
	public Video getLastAdded() {
		if(store!=null)
			return store[store.length-1];
		else
			return null;
	}
	
	public void addVideo(String name) {
		Video v =new Video(name);
		int storeSize;
		try {
			storeSize = store.length;
		}catch(Exception e) {
			storeSize = 0;
		}
		
		Video[] ns = new Video[storeSize+1];
		ns[storeSize] = v;
		store = ns;
	}
	void doCheckout(String name) {
		if(store ==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v : store) {
			if(v.getName().equals(name)){
				v.doCheckout();
			}
		}
	}
	void doReturn(String name) {
		if(store ==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v : store) {
			if(v.getName().equals(name)){
				v.doReturn();
			}
		}
	}
	void receiveRating(String name,int rating) {
		if(store ==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v : store) {
			if(v.getName().equals(name)){
				v.receiveRating(rating);
			}
		}
	}
	void listInventory() {
		if(store ==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(int i=0;i<80;i++)
			System.out.print("-");
		System.out.printf("\n\t%-15s\t|\t%-15s\t|\t%-15s\n","Video Name","Checkout Status","Rating");
		for(int i=0;i<80;i++)
			System.out.print("-");
		
		for(Video v : store) {
			System.out.printf("\n\t%-15s\t|\t%-15s\t|\t%-15s\n",v.getName(),v.getCheckout(),v.getRating());
		}
	}

}
