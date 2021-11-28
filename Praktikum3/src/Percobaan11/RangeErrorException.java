/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan11;

/**
 *
 * @author MAM
 */
public class RangeErrorException extends Throwable{
    public RangeErrorException(String s)
    {
        super(s);
    }
    public static void main(String[] args)
    {
        int position=1;
        try
        {
            if(position>0)
            {
                throw new RangeErrorException("Position " +position);
            }
        }
        catch(RangeErrorException e)
        {
            System.out.println("Range error: " +e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
