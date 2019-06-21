package question1.exemples;



public class MonExemple{
    private int operande1;
    private int operande2;
    private String operateur;
    
    public void setOperande1(int op){this.operande1 = op;}
    public void setOperande2(int op){this.operande2 = op;}
    public void setOperateur(String op){this.operateur = op;}
    
    public int doTheMath(){
        int res = 0;
        switch(this.operateur){
            case "+": res = this.operande1 + this.operande2;break;
            case "-": res = this.operande1 - this.operande2;break;
            case "*": res = this.operande1 * this.operande2;break;
            case "/": res = this.operande1 / this.operande2;break;
            default:break;
        }
        return res;
    }
    
    public String toString(){
        return this.operande1 + this.operateur + this.operande2 + " = " + doTheMath();
    }
}
