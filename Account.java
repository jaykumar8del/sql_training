package com.jdbc;

public class Account {
		private int Account_id;
		private String Account_type;
		private Float opening_bal;
		private String User_id;
		private String Status;
		private String Account_number;
		private Float interest_rate;
		public int getAccount_id() {
			return Account_id;
		}
		public void setAccount_id(int account_id) {
			Account_id = account_id;
		}
		public String getAccount_type() {
			return Account_type;
		}
		public void setAccount_type(String account_type) {
			Account_type = account_type;
		}
		public Float getOpening_bal() {
			return opening_bal;
		}
		public void setOpening_bal(Float opening_bal) {
			this.opening_bal = opening_bal;
		}
		public String getUser_id() {
			return User_id;
		}
		public void setUser_id(String user_id) {
			User_id = user_id;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public String getAccount_number() {
			return Account_number;
		}
		public void setAccount_number(String account_number) {
			Account_number = account_number;
		}
		public Float getInterest_rate() {
			return interest_rate;
		}
		public void setInterest_rate(Float interest_rate) {
			this.interest_rate = interest_rate;
		}
		
		@Override
		public String toString() {
			return "account [Account_id=" + Account_id + ", Account_type=" + Account_type + ", opening_bal=" + opening_bal
					+ ", User_id=" + User_id + ", Status=" + Status + ", Account_number=" + Account_number
					+ ", interest_rate=" + interest_rate + "]";
		}
		

	
}

