package selflearn.selflearn;

public class EmpPojo {
	
	String EmpName;
	int EmpID;
	int EmpAge;
	
	public EmpPojo() {
		
	}
	public EmpPojo(String name, int id, int age) {
		this.EmpName=name;
		this.EmpID=id;
		this.EmpAge=age;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
	public String toString()
    {
 
        // Returning attributes of Recruitment
        return this.EmpName + " " + this.EmpID + " "
            + this.EmpAge;
    }

}
