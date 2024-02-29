question 1:

1.1)
code:

package com.oops.basic;

public class Person {



		 String name;
		 int age;//variable->instance variable
		//define variable
		//Constructor->same as classname ->initialize
		//to print the data
		 
		public String getName() {
			return name;
		}
	    public int getAge() {
	        return age;
		}
	    


	//to set the data 
		public void setName(String name,int age) {
			this.name = name;
		
			
				this.age = age;
			
		}
		void getData() {
			System.out.println(this.name+" "+this.age);
		}
		//static method
			public static void main(String[] args) {
				Person p1=new Person();
				
				
				System.out.println("iniya");
				System.out.println(18);
				
			}
}
input:
output:screenshot of IDE
   
getAge0 : int

Console X
<terminated> Person [Java Application] C:\Program Files\Java\jdk-17\bin\javaw.exe (27-Feb-2024, 7:33:39 pm - 7:33:41 pm) [pid: 12072]
    
    iniya
    18

Problems @ Javadoc Declaration

1.2)
code:
package com.productdetails;

import java.util.Scannar;

public class Product {
String pname;
int pid,qty;
float price, total;
void accept()
{       \\Scanner using get the value
	Scannar sc = new Scannar(System.in);
	try 
	{
	System.out.println("enter the product name: ");
	pname = sc.next();
	System.out.println("enter pid: ");
	pid = sc.nextInt();
	System.out.println("enter qty: ");
	qty = sc.nextInt();
	System.out.println("enter price: ");
	price = sc.nextFloat();
	
	}catch (Exception e) {}
	
}
void display()
{
	total = qty * price;
	System.out.println("pid: "+pid+"\nproduct name :"+pname+"\nquantity:"+qty+"\nprice:"+price+"\ntotal amount:"+total+"");
	
}
}
import java.util.Scannar;
public class Cost1 {
	 \\cost1 is main method to excute the program
	public static void main(String[] args) {
		int n;
		float t =0;
		Scannar sc = new Scannar(System.in);
		System.out.print("enter how many product you want:");
		n = sc.nextInt();
		
		Product p1[] = new Product[n];
        \\for loop using check no of product less than input value
        for(int i=0;i<n;i++)
        {
        	p1[i]= new Product();
        	p1[i].accept();
        		
        }
        for(int i=0;i<n;i++)
        {
        	
        	p1[i].display();
        		
        }
        for(int i=0;i<n;i++)
        {
        	t = t+p1[i].total;
        	System.out.println("Total cost:"+t);
        }
	}
}
input:
output:screenshot of IDE
	
Console X
<terminated> Cost1 [Java Application] C:\Program Files\Java\jdk-17\bin\javaw.exe (27-Feb-2024, 8:50:39 pm - 8:50:41 pm) [pid: 16089]
   enter how many you want : 1
   enter the product name:
   samsung
   enter  id:
   101
   enter qty:
   200
   Enter price:
   10000
   pid=101
   product name:samsung
   quantity:200
   price:10000
   Total amount:2000000.0
   Total cost:2.7E7


1.3)
code:
package com.bankcustometr;

public class Account {
	
	
	String name;
	int accno;
	double bal;
	
	
	
	
	 \\ super keyword() access parent class 
	public Account(String name, int accno, double bal) {
		super();
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}
	
	
	void deposite(double a) { bal+=a; }
	void withdraw(double a) { bal-=a; }
	double getbalance() { return(bal); }
	void show()
	{
	System.out.println("________________________");
	System.out.println(" ACCOUNT DETAILS");
	System.out.println("------------------------");
	System.out.println("Name : "+name);
	
	System.out.println("Account No : "+accno);
	System.out.println("Balance : "+bal);
	System.out.println("------------------------");
	}
	}
public class Test1 {

	public static void main(String[] args) {
		Account a2= new Account("Anil",666,5000);
        \\customer to acess account deposit or withdraw process
		a2.deposite(1000);
		a2.withdraw(500);
		a2.deposite(a2.getbalance());
		
		a2.show();
		}
		
	}

input:
output:screenshot of IDE

ACCOUNT DETAILS

Name : Anil
Account No : 666
Balance : 11000.0

Problems
s @ Javadoc Declaration
<terminated> Test1 [Java Application] C:\Program Files\Java\jdk-17\bin\javaw.exe (28-Feb-2024, 8:49:43 pm - 8:49:43 pm) [pid: 15460]


1.4)
code:

package com.customer1;

public class Person1 {
String name;
int age;
Person1(String name,int age){
	this.name = name;
	this.age = age;
	}
}
\\inherits the person1
public class Employee extends Person1{
int emp_id;
double emp_salary;

public Employee(String name, int age, int emp_id, double emp_salary) {
	super(name, age);
	this.emp_id = emp_id;
	this.emp_salary = emp_salary;
}

void printEmployeeDetails()
{
	
	System.out.println("Employee Name : " + name);
	System.out.println("Employee Age : " + age);
	System.out.println("Employee ID : " + emp_id);
	System.out.println("Employee Salary : " + emp_salary);
}
}

public class Main {
       \\excute the Main method to create object then print Employee
	public static void main(String[] args) {
		Employee emp = new Employee("ramya",29,101,20582);
	    emp.printEmployeeDetails();
		
	}

}

input:
output:screenshot of IDE
   
Problems @ Javadoc Declaration @ Console X
<terminated> Main [Java Application] C:\Program Files\Java\jdk-17\bin\javaw.exe (28-Feb-2024, 7:58:54 pm - 7:58:55 pm) [pid: 11240]
    Employee Name : ramya
    Employee Age : 29
    Employee ID : 101
    Employee Salary : 20582.0



           
             
                




	

