package com.ltts.demowebproject.model;

public class User {
		private String emailid;
		private int mobile;
		private String name;
		private String password;
		private String address;
		private int DOB;
		private String first_name;
		private String last_name;
		private int regdate;
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getDOB() {
			return DOB;
		}
		public void setDOB(int dOB) {
			DOB = dOB;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public int getRegdate() {
			return regdate;
		}
		public void setRegdate(int regdate) {
			this.regdate = regdate;
		}
		public User(String emailid, int mobile, String name, String password, String address, int dOB,
				String first_name, String last_name, int regdate) {
			super();
			this.emailid = emailid;
			this.mobile = mobile;
			this.name = name;
			this.password = password;
			this.address = address;
			DOB = dOB;
			this.first_name = first_name;
			this.last_name = last_name;
			this.regdate = regdate;
		}
		@Override
		public String toString() {
			return "User [emailid=" + emailid + ", mobile=" + mobile + ", name=" + name + ", password=" + password
					+ ", address=" + address + ", DOB=" + DOB + ", first_name=" + first_name + ", last_name="
					+ last_name + ", regdate=" + regdate + "]";
		}
}