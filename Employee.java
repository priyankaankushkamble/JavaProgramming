package org.techhub;

public class Employee {

		private String name;
		private int id;
		private String address;
		private int sal;
		private String prevComp;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		public String getPrevComp() {
			return prevComp;
		}
		public void setPrevComp(String prevComp) {
			this.prevComp = prevComp;
		}
}
