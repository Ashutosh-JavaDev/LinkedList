import java.util.Scanner;
class Nodes{
    int data;
    Nodes next;
    Nodes(int data){
        this.data=data;
    }
   public static class Linked{
    Nodes head=null;
    Nodes tail=null;
    void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Print Stop to stop inserting Value");
        String val;
        while(true){
            val=sc.nextLine();
            if(val.equalsIgnoreCase("Stop")){
                break;
            }
            else{
                try{
                    int data=Integer.parseInt(val);
                    Nodes newN=new Nodes(data);
                    if(head==null){
                        head=tail=newN;
                    }
                    else{
                        
                    }
                }
                catch(NumberFormatException e){

                }
            }
        }
    }
   }
}
public class mergewoList {
    
}
