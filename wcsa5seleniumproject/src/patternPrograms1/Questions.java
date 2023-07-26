package patternPrograms1;

public class Questions
{
public void q2() {
int a = 10;
int b = 20;
a = a + b;
b = a - b;
a = a - b;
System.out.println("[a,b] > ["+a+", "+b+" ]");
}

public static void main(String args[]) {
Questions q = new Questions () ;
q.q2() ;
}
}

