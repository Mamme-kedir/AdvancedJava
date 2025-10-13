public class LoopsDemo {
    static int n;
static int sum()
{
    int s=0, i=1;
    do {
        s += i;
        i++;
    }while(i<=n);
    return s;
}
static int evensum()
{
    int s=0, i=1;
    while (i<=n) {
        if (i%2==0) {
            s += i;
            
        }i++;}
        return s;
    }
    

static int squaresum()
    {
        int s=0;
        for(int i=1; i<=n; i++)
        {
            s += i*i;
        }
        return s;
    }

public static void main (String[] args){
    n = 100;
    int s1 =sum();
    int s2 = evensum();
    int s3 = squaresum();
System.out.println("sum = " + s1);
System.out.println("even sum = " + s2);
System.out.println("square sum = " + s3);

}
}
