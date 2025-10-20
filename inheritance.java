public class inheritance{


class Person {
	String Id;
	String Name;
	Person()
	{
		this.Id="000";
		this.Name="Unknown";
	}
	Person(String I,String N){
		this.Id=I;
		this.Name=N;
	}
	void Show () {
		System.out.println(this.Id+" "+this.Name);
	}
}
		
		class Student extends Person{
			private String dept="Unassigned";
			private float EnteranceExam=0.0f;
			Student()
			{
				super();
				this.dept="Unassigned";
				this.EnteranceExam=0.0f;
			}
			void show()
			{
				System.out.println(this.Id+" "+this.dept+" "+ this.EnteranceExam);
			}		
		void setInfo(String d,Float r) {
			this.dept=d;
			this.EnteranceExam=r;
			
		}	
        Student(String Id, String Name, String d, float result)
        {
            super(Id, Name);
            this.dept = d;
            this.EnteranceExam = result;

        }
		}
	


    


	

	public static void main(String[] args) {
Person p1=new Person("Id001","Selam");
Person p2=new Person();
p1.Show();
p2.Show();
Student S1 =new Student();
S1.show();
	}

}

