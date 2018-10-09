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
public interface Shape {
    public abstract int area();
    
    public abstract int perimeter();
    
    public abstract int[] sides();
    
    public String DESCRIPTOR = "Shape";
}
