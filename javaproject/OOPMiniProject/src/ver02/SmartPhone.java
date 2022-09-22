package ver02;

public class SmartPhone {
	
	// 기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
	// 여러개의 인스턴스가 생성될 필요 없다! => 싱글톤 패턴
	//  1. private 생성자
	//  2. 클래스 내부에서 인스턴스를 생성  static private
	//  3. 내부에서 생성한 참조값을 반환 해주는 메소드  static public
	
	// 요구사항
	// 이 클래스는 연락처 정보를 관리하는 클래스입니다.
	// ① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	//   => 10개 정보를 저장할수 있다. -> 배열 인스턴스를 생성  Contact[]
	//      Contact 클래스 기반의 인스턴스를 최대 10개까지 만들어서 배열에 참조값을 저장
	
	private Contact[] contacts;
	
	private SmartPhone(int size){
		contacts = new Contact[size];
	}
	
	private static SmartPhone sp = new SmartPhone(10);
	
	public static SmartPhone getInstance() {
		if(sp==null) {
			sp = new SmartPhone(10);
		}
		return sp;
	}

	
	
	// ② 기능
	//   배열에 인스턴스를 저장하고, 
	//                 수정하고, 
	//                 삭제, 
	//                 검색 후 결과 출력,
	//                 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	

}
