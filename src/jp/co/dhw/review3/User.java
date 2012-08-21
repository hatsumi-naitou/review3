package jp.co.dhw.review3;

import User;

class User{

	public Integer id;
	public String firstName;
	public String lastName;

	public String getName() {
		return this.id;
		return this.firstName;
		return this.lastName;
	}

	public void setName(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void showName() {
		System.out.println(this.id + ":" + this.firstName + " " + this.lastName);
	}


	public static void main(String[] args) {
		User user1 = new User("1","takeda","noritaka");
		user1.showName();

		User user2 = new User("2","imada","takashi");
		user2.showName();

		User user3 = new User("3","sakemi","shingo");
		user3.showName();

		User user4 = new User("4","naitou","hatsumi");
		user4.showName();

		User user5 = new User("5","nagao","yukiko");
		user5.showName();

		User user6 = new User("6","enoeda","daigo");
		user6.showName();

		User user7 = new User("7","takesue","norikazu");
		user7.showName();

		User user8 = new User("8","harada","kiyoshi");
		user8.showName();

		User user9 = new User("9","takaki","kaori");
		user9.showName();

		User user10 = new User("10","nagano","junpei");
		user10.showName();

	}

}
