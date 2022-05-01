package com.task4;

public class HeightComparison {
    public static void height_decider(int height) throws tallException, averageException, shortException{
        if(height < 170){
            throw new shortException("You are short");
        }
        else if(height>=170 && height < 185){
            throw new averageException("You are average");
        }
        else if(height>=185){
            throw new tallException(("You are tall"));
        }
    }

    public static void main(String args[]){
        try{
            height_decider(183);
        }
        catch (shortException x){
            System.out.println(x);
        }
        catch (averageException x){
            System.out.println(x);
        }
        catch (tallException x){
            System.out.println(x);
        }
    }
}
