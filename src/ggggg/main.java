package ggggg;

import java.util.ArrayList;

public class main {

	/* Создаю по 3 сотрудника, как пример работы*/
	public static void main(String[] args) {
		ArrayList<Ingener> personal_ingener = new ArrayList<Ingener>();
		ArrayList<Manager> personal_maneger = new ArrayList<Manager>();
		
		Ingener temp_i = new Ingener();
		Manager temp_m = new Manager();
		
		for(int i = 0; i < 3; i++) {
			personal_ingener.add(new Ingener(i));
			personal_maneger.add(new Manager(i));
		}
		////////////////////////////////////
		////////////////////////////////////
		
		temp_i = personal_ingener.get(0);
		temp_i.fio = "Test1 Testing1 Tested1";
		temp_i.date = "01.01.2021";
		personal_ingener.set(0, temp_i);
		
		temp_i = personal_ingener.get(1);
		temp_i.fio = "Test2 Testing2 Tested2";
		temp_i.date = "02.01.2021";
		personal_ingener.set(1, temp_i);
		
		temp_i = personal_ingener.get(2);
		temp_i.fio = "Test3 Testing3 Tested3";
		temp_i.date = "03.01.2021";
		personal_ingener.set(2, temp_i);
		
		////////////////////////////////////
		////////////////////////////////////
		
		temp_m = personal_maneger.get(0);
		temp_m.fio = "Artem Testing Tested1";
		temp_m.date = "01.02.2021";
		personal_maneger.set(0, temp_m);
		temp_m = personal_maneger.get(1);
		temp_m.fio = "Artem Testing Tested2";
		temp_m.date = "01.03.2021";
		personal_maneger.set(1, temp_m);
		temp_m = personal_maneger.get(2);
		temp_m.fio = "Artem Testing Tested3";
		temp_m.date = "01.04.2021";
		personal_maneger.set(2, temp_m);
		
		////////////////////////////////////
		////////////////////////////////////
		System.out.println("Personal Manager: ");
		for(int i = 0; i < personal_maneger.size(); i++) {
			temp_m = personal_maneger.get(i);
			System.out.println("ID Manager: " + temp_m.id);
			System.out.println("FIO Manager: " + temp_m.fio);
			System.out.println("Date Manager: " + temp_m.date);
			System.out.println("=============================================");
		}
		System.out.println();
		System.out.println();
		for(int i = 0; i < personal_ingener.size(); i++) {
			temp_i = personal_ingener.get(i);
			System.out.println("ID Ingener: " + temp_i.id);
			System.out.println("FIO Ingener: " + temp_i.fio);
			System.out.println("Date Ingener: " + temp_i.date);
			System.out.println("=============================================");
		}
	}
	
	/*Class Ingener*/
	public static class Ingener implements interface_employee {
		int id;
		String fio;
		String date;
		String position = "Инженер";
		
		public Ingener() {
		}
		
		public Ingener(int id) {
			this.id = id;
		}
		
		public void SetID(int id) {
			this.id = id;
		}
		
		public int GetID() {
			return id;
		}
		
		public void SetFIO(String fio) {
			this.fio = fio;
		}
		
		public String GetFIO() {
			return fio;
		}
		
		public void SetDateStartWork(String date) {
			this.date = date;
		}
		
		public String GetDateStartWork() {
			return date;
		}
		
		public String GetPosition() {
			return position;
		}
		
	}
	/* Class Manager */
	public static class Manager implements interface_employee {
		int id;
		String fio;
		String date;
		String position = "Менеджер";
		
		public Manager() {
		}
		
		public Manager(int id) {
			this.id = id;
		}
		
		public void SetID(int id) {
			this.id = id;
		}
		
		public int GetID() {
			return id;
		}
		
		public void SetFIO(String fio) {
			this.fio = fio;
		}
		
		public String GetFIO() {
			return fio;
		}
		
		public void SetDateStartWork(String date) {
			this.date = date;
		}
		public String GetDateStartWork() {
			return date;
		}
		
		public String GetPosition() {
			return position;
		}
		
	}
	
	/* Interface employee */
	public interface interface_employee {
		void SetID(int id);
		int GetID();
		
		void SetFIO(String fio);
		String GetFIO();
		
		void SetDateStartWork(String date);
		String GetDateStartWork();
		
	}

}

