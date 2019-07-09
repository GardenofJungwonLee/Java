package controller;

import log4j.Log4J;
import model.PeopleModel;
import model.domain.People;
import view.EndView;

public class PeopleController {
	public static void request(int reqNumber) {

		if (reqNumber == 1) {
			System.out.println(Log4J.getInstance().info());
			EndView.printAll(PeopleModel.getAll());

		} else if (reqNumber == 2) {

			EndView.printTo(PeopleModel.search("�赿��"));
			EndView.printTo(PeopleModel.search("������"));

		} else if (reqNumber == 3) {

			boolean r = PeopleModel.confirm("Customer");
			if (r) {
				System.out.println(Log4J.getInstance().warn());

			} else {
				System.out.println(Log4J.getInstance().welcome());

			}

		} else if (reqNumber == 4) {

			People v = new People(8, "CEO", "���ػ�", "VIP", "admin");
			boolean r1 = PeopleModel.insert(v);

			if (r1) {
				EndView.printSuccess("ȯ���մϴ� " + v.getName() + " ��");

			} else {
				EndView.printFail("���Կ� �����Ͽ����ϴ�");
			}

		} else if (reqNumber == 5) {

			boolean r = PeopleModel.delete("�赿��");

			if (r) {
				System.out.println(Log4J.getInstance().right());

			} else {
				System.out.println(Log4J.getInstance().error());

			}

		} else if (reqNumber == 6) {
			boolean r = PeopleModel.update("������");

			if (r) {
				System.out.println(Log4J.getInstance().change());

			} else {
				System.out.println(Log4J.getInstance().error());
			}
		} else {

			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�");
		}
	}
}
