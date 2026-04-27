import java.util.*;
public class ToDoList_NoFrameworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr =new ArrayList<>();
        
        boolean b = true;
        do { 
            System.out.println("enter your choice 1.add 2.delete 3.show");
            String ch = sc.next();
            switch(ch){
                case"add":
                    System.out.println("enter your task: ");
                    String task = sc.next();
                    arr.add(task);
                    System.out.println(task+" task is added ");
                    break;
                case "delete":
                    System.out.println("enter which task no you want to delete: ");
                    int t = sc.nextInt();
                    if(t<=arr.size() && t>0){
                        task = arr.remove(t - 1);
                        System.out.println(task+" deleted ");
                    }
                    else {
                        System.out.println("not found");
                    }
                    break;
                case "show":
                    if(arr.isEmpty()){
                        System.out.println("NO tasks ");
                    }
                    else{
                        for(int i = 0; i < arr.size(); i++){
                            System.out.println((i + 1) + ". " + arr.get(i));
                        }
                    }
                    break;
            }
            System.out.println("enter true for continue: ");
             b = sc.nextBoolean();
        } while (b);
    }
}
