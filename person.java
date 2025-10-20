public class person {
    String Name;
    String Id;
static int n = 0;
    person (String I, String N){
        this.Name = N ;
        this.Id = I;
        n++;
    }
    void show()
    {
        System.out.println(this.Id+ " "+this.Name);
    }
static void Total()
{
    System.out.println("Total No of objects :" + n);
}



public static void main (String[]arg){
    person.Total();
    person p1 = new person("I001", "Alemu");
    p1.show();
    person.Total();
    person p2 = new person("I002", "Rahel");
    p2.show();
    person.Total();
}
}