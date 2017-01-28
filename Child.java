class Parent
{
   private void method1()
   {
     System.out.println ("Parent's method1()");
   }
public void method2() 
  {
    System.out.println ("Parent's method2()");
    method1();
    System.out.println("Option C. Prints : Parent's method2() Parent's method1() ");
    System.out.println("          is correct beacuse the reference of Parent class is created hence it's method will be called and the xtended method calls private method os the same class");
  }
}

class Child extends Parent 
{
  public void method1() {
  System.out.println ("Child's method1()");
} 
public static void main(String args[]) 
 {
   Parent p = new Child();
   p.method2();
 }
}