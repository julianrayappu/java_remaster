/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;

/**
 *
 * @author suppiah_00
 */
public class LearningJava {

    private int m_number;
    private String m_string = "one hundred";
    private static int counter;
    
    public LearningJava() { counter++; m_number = counter;}
    
    public LearningJava(int n, String s)
    {
        counter++;
        this.m_number = counter;
        this.m_string = s;
    }
    
    public void setNumber(int n)
    {
        m_number = n;
    }
    
    public void setString(String s)
    {
        m_string = s;
    }
    
    @Override
    public String toString()
    {
        return "LearningJava[" + m_number + ", " + m_string + ", " + counter + "]";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        
        if (obj instanceof LearningJava)
        {
            LearningJava ljObj = (LearningJava) obj;
            if ( (this.m_number == ljObj.m_number) &&
                 (this.m_string.equals(ljObj.m_string))
               )
            {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return m_number + (m_string != null ? m_string.hashCode() : 0) ;
    }
    
    public static void alterByAssignment(LearningJava j)
    {
        j = new LearningJava(1, "One");
        System.out.println("alterByAssignment: j is " + j);
    }
    
    public static void alterByInvocation(LearningJava j)
    {
        j.setNumber(2);
        j.setString("Two");
        System.out.println("alterByInvocation: j is " + j);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LearningJava lj = new LearningJava(3, "Three");
        System.out.println("main: created l as " + lj);
        
        LearningJava.alterByAssignment(lj);
        System.out.println("main: " + lj);
        
        LearningJava.alterByInvocation(lj);
        System.out.println("main: " + lj);
        
        System.out.println("lj instanceof LearningJava: " + (lj instanceof LearningJava));
        System.out.println("arithmetic comparison: " + (5 > 15));
        
        LearningJava jNull = null;
        boolean inst = jNull instanceof LearningJava;
        System.out.println("inst is " + inst);
        
        LearningJava uninitLJ = new LearningJava();
        System.out.println("uninitLJ is " + uninitLJ);
        
        LearningJava.counter++;
        System.out.println("uninitLJ is " + uninitLJ);
        
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length ; i++)
        {
            numbers[i] = i;
        }
        
        System.out.print("numbers = [");               
        for (int n : numbers)
        {
            System.out.print(n + ", ");
        }
        System.out.println("]");
        
        int[] numbers2 = numbers;
        System.out.print("numbers2 = [");               
        for (int n : numbers2)
        {
            System.out.print(n + ", ");
        }
        System.out.println("]");
        
        for(int i = 0; i < numbers2.length ; i++)
        {
            numbers2[i] = i*i;
        }
        System.out.print("numbers = [");               
        for (int n : numbers)
        {
            System.out.print(n + ", ");
        }
        System.out.println("]");        
        
        
        String[] strings = { "Peter", "Jane", "Dog", "Cat", "Ball", "Toy"};
        for (String s : strings)
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        
        LearningJava[] ljArray = { new LearningJava(10, "ten"), new LearningJava(11, "eleven") };
        for (LearningJava local : ljArray)
        {
            System.out.print(local + ", ");
        }
        System.out.println();
        
        // run the garbage collector
        System.gc();
        
        
        Parent p = new Parent("Bob");
        Child c = new Child("Jane", 3);
        Child d = new Child("Peter", 1);
        
        System.out.println("p is " + p);
        System.out.println("c is " + c);
        System.out.println("d is " + d);
        
        Shape square = new Square(5);
        System.out.println("square has area " + square.area());
        System.out.println("square has perimeter " + square.perimeter());
        System.out.println("square has sides : ");
        for (int side : square.sides())
        {
            System.out.print(side + ", ");
        }
        System.out.println();
        
    }
}
