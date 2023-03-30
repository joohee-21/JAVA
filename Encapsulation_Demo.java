package Assignment;

public class Encapsulation_Demo {
		private int pass=123;
		private String ac_no="ab123";
		private int ac_bal=1000;
		int trans;
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

		}

		public int getAc_bal() {
			return ac_bal;
		}

		public void setAc_bal(int ac_bal) {
			this.ac_bal = ac_bal;
		}

		public int getPass() 
		{
			return pass;
		}

		public void setPass(int pass) 
		{
			this.pass = pass;
		}

		public String getAc_no() 
		{
			return ac_no;
		}

		public void setAc_no(String ac_no) 
		{
			this.ac_no = ac_no;
		}

	}