package section09;

public class Movie {
	public String title;
	public int price;
	public String director;
	
	static {
		System.out.println("Movie() static 초기화 블럭");
	}
	//초기화 블럭
	public Movie() {
			this.title ="기생충";
			this.price = 14000;
			this.director ="봉준호";
			
	}
	
}
