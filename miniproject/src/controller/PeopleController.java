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

			EndView.printTo(PeopleModel.search("김동범"));
			EndView.printTo(PeopleModel.search("석유진"));

		} else if (reqNumber == 3) {

			boolean r = PeopleModel.confirm("Customer");
			if (r) {
				System.out.println(Log4J.getInstance().warn());

			} else {
				System.out.println(Log4J.getInstance().welcome());

			}

		} else if (reqNumber == 4) {

			People v = new People(8, "CEO", "서해상", "VIP", "admin");
			boolean r1 = PeopleModel.insert(v);

			if (r1) {
				EndView.printSuccess("환영합니다 " + v.getName() + " 님");

			} else {
				EndView.printFail("가입에 실패하였습니다");
			}

		} else if (reqNumber == 5) {

			boolean r = PeopleModel.delete("김동범");

			if (r) {
				System.out.println(Log4J.getInstance().right());

			} else {
				System.out.println(Log4J.getInstance().error());

			}

		} else if (reqNumber == 6) {
			boolean r = PeopleModel.update("석유진");

			if (r) {
				System.out.println(Log4J.getInstance().change());

			} else {
				System.out.println(Log4J.getInstance().error());
			}
		} else {

			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
}
