package ggggg;

public class main {

	public static void main(String[] args) {
		
		
	}
	
	public class Ingener implements interface_employee {
		int id;
		String fio;
		String data;
		String position = "Инженер";
		
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
		
		public void SetDataStartWork(String data) {
			this.data = data;
		}
		public String GetDataStartWork() {
			return data;
		}
		
		public String GetPosition() {
			return position;
		}
		
	}
	
	public class Manager implements interface_employee {
		int id;
		String fio;
		String data;
		String position = "Менеджер";
		
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
		
		public void SetDataStartWork(String data) {
			this.data = data;
		}
		public String GetDataStartWork() {
			return data;
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
		
		void SetDataStartWork(String data);
		String GetDataStartWork();
		
	}

}

