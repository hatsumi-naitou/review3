package jp.co.dhw.review2;

import Teacher;
import override;


public class Teacher extends Teacher{

	public String subject;
	String subjedt = new String();

	public String getSubject() {
	return this.subject;
	}

	@override
	public void setName(Integer id, String firstName, String lastName, String subject) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
	}

	@override
	public void showName() {
		System.out.println(this.id + ":" + this.firstName + " " + this.lastName + " " + this.subject);
	}

	

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("1","髟ｷ貔､","螟ｧ霈�,"繝�じ繧､繝ｳ");
		Teacher1.showName();

		Teacher teacher2 = new Teacher("2","繝ｩ繝�ぅ","繧ｸ繧ｧ繧､繧ｽ繝ｳ","繝�じ繧､繝ｳ");
		Teacher2.showName();

		Teacher teacher3 = new Teacher("3","阮�ｺ�,"髫�,"Web/繧｢繝励Μ");
		Teacher3.showName();

		Teacher teacher4 = new Teacher("4","螻ｱ譛ｬ","豬ｩ蜿ｸ","3DCG");
		Teacher4.showName();

		Teacher teacher5 = new Teacher("5","繝上リ繝悶し","繝弱ヶ繝ｦ繧ｭ","繝�じ繧､繝ｳ");
		Teacher5.showName();

		Teacher teacher6 = new Teacher("6","繧ｳ繝後�","繝ｨ繧ｷ繝�げ","Web/繧｢繝励Μ");
		Teacher6.showName();

		Teacher teacher7 = new Teacher("7","貂｡驛ｨ","譏�ｲｻ","Web/繧｢繝励Μ");
		Teacher7.showName();
	}

}
