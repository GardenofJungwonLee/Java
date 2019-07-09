package log4j;

public class Log4J {
	
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstance(){
		return instance;
	}
	
	public String info() {
		return "안녕하세요,회원님";
	}
	public String warn() {
		return "권한이 없습니다";
	
	}public String welcome() {
		return "관리자 권한으로 로그인하셨습니다";
	}
	
	public String error() {
		return "요청하신 정보를 수행할 수 없습니다";
	}
	public String right() {
		return "요청하신 정보를 수행하였습니다";
	}
	public String change() {
		return "등급이 변경되셨습니다";
	}
	
	
}
