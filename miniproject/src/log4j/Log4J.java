package log4j;

public class Log4J {
	
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstance(){
		return instance;
	}
	
	public String info() {
		return "�ȳ��ϼ���,ȸ����";
	}
	public String warn() {
		return "������ �����ϴ�";
	
	}public String welcome() {
		return "������ �������� �α����ϼ̽��ϴ�";
	}
	
	public String error() {
		return "��û�Ͻ� ������ ������ �� �����ϴ�";
	}
	public String right() {
		return "��û�Ͻ� ������ �����Ͽ����ϴ�";
	}
	public String change() {
		return "����� ����Ǽ̽��ϴ�";
	}
	
	
}
