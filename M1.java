class Mul
{
int a,b,c;
void acc(int m,int n)
{
a=m;
b=n;}
void mult()
{
c=a*b;
System.out.println(c);
}
void disp()
{
System.out.println(a+" "+b);
}}
class M1
{
public static void main(String s[])
{
System.out.println("Success....Demo.......!!!!..");
System.out.println("Success....Remo.......!!!!..");
System.out.println("Success....Babul.......!!!!..");
int x=Integer.parseInt(s[0]);
int y=Integer.parseInt(s[1]);
Mul m=new Mul();
m.acc(x,y);
m.mult();
m.disp();
}
}