package vscode.Medium_Level;

public class _20_Senario_based{
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
    }
    
}
class Bank{
    float getROI(){
        return 0;
    }
}
class SBI extends Bank{
    float getSBI(){
        return 8.4f
    }
}
