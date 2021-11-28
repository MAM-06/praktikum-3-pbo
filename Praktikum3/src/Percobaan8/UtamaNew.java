/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan8;

/**
 *
 * @author MAM
 */
public class UtamaNew {
    public static void main(String[] args)
    {
        Test3 o=new Test3();
        o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("Ini selalu dicetak");
        };
    }
}
