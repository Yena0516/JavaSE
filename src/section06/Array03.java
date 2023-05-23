package section06;

public class Array03 {
	public static void main(String[] args) {
		// new연산자를 사용하지 않고 직접 배열 값 대입 생성
		String[] names = {"피카츄","라이츄","파이리","꼬부기","버터풀","야도란"};
		//배열내용 출력 해보기
		for(int i =0; i <names.length; i++) {
			System.out.println(names[i]);
			
	}
		System.out.println("==============================");
		
		//배열 값 수정하기
		names[5] = "잠만보";
		
		//확장 for문
		for(String name : names) {  // String name = names[0]
									// name = names[1]
									// name = names[2]
									// name = names[3]
									// ...(중략) ...
									// name = names[5]
			System.out.println(name);
			
		}
}
}
