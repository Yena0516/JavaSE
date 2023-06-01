package section10;

public class Bread {
	/* 속성
	 * 1.빵이름
	 * 2.빵크기
	 * 3.빵종류
	 * 4.빵가격
	 * 
	 * 
	 */
	
	public String breadName;
	public int breadSize;
	public String breadType;
	public int breadPrice;
	public String brand;
	
	public void getInfo() {
		System.out.println("breadName: " + breadName);
		System.out.println("breadSize: " + breadSize);
		System.out.println("breadType: " + breadType);
		System.out.println("breadPrice: " + breadPrice);
		System.out.println("brand: " + brand);
		
	
	}
}
