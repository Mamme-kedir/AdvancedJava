public class ArrayDemo {
    public static void main(String[] args) {
        float [] Marks={99,98,77,55,88,85.2f};
        float Average;
        float Sum=0;
        for(float i: Marks){
            Sum += i;
        }
        Average = Sum/Marks.length;
            System.out.println("The avarage makr of the student is "+ Average);
            String [][] FullName={{"Melat","Alemu"},{"Nega","Meseret"},{"Selam","Abdi"}};
            System.out.println("No\t\tName\t\t\tFName");
            int i=1;
            for(String row[]: FullName)
            {
                
                System.out.println(i+"\t\t"+ row[0]+ "\t\t\t"+row[1]);
                i++;
            }
    }
}
