import java.util.*;
public class W88 {
    public int variStake ;
    public static void main(String aaa[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tiger ----> 7");
        System.out.println("Dragon ----> 4 ");
        System.out.println("---Good luck---");
        int i = 0,countWin=0 , countLose=0,countGame=0 ;int[] predit  = new int[4] ;
        for(int ii =0 ; ii<4 ;ii++){
            predit[ii] = scan.nextInt() ;
        }
        boolean pian = work(predit);
        //printPredit(predit);
        int ans = findNextStake(predit[2] ,pian) ;
        
        while(i<30){
            int input = scan.nextInt() ;
            countGame++ ;
            if(input==0){
                if(1%2!=0){
                    pian = work(predit);
                    //printPredit(predit);
                    ans = findNextStake(predit[2] ,pian);    
                }    
                continue;
            }else{
                if(ans == input){
                    countWin++ ;
                    System.out.println("Congratulations :))") ;
                    ans = -1 ;
                }else{ 
                    if(i%2==0){
                        countLose++ ;
                      System.out.println("I'm sorry :(") ;
                    }
                    ans = -1 ;
                }
                if(i%2==0){
                    lurn(predit );
                    predit[2] = input ;
                    System.out.println("wait state....");
                }else{
                    predit[3]=input ;
                    pian = work(predit);
                    //printPredit(predit);
                    ans = findNextStake(predit[2] ,pian) ;
                }
            }
             if(i==19){
                System.out.println("Program Close Good Luck");
            }
            i++ ;
        }
        System.out.println("---COUNT GAME IS : "+countGame+" STATE---") ;
        System.out.println("WIN is : "+countWin+" State") ;
        System.out.println("Lose is : "+countLose+" State");
        
    }
    public static void lurn(int[] predit){
        predit[0] = predit[2] ; predit[1] = predit[3] ;
    }
    public static boolean work(int[] predit){
        int pian=0 , derm =0 ;
        for(int i =0 ; i <(predit.length -1) ; i++){
            if(predit[i]==predit[i+1]){ derm ++ ; }
            else{ pian++ ; }
        }
        if(pian>derm){
            if(pian==3){
                System.out.println("!!!!----Cri----!!!!!");
            }
            return true ;
        }
        else {return false ;}
    }
    public static int findNextStake(int latest , boolean pian){
        if(pian){
            if(latest == 4){System.out.println("stake is : Tiger");
                
            return 7 ;
            }else{System.out.println(("stake is : Dragon"));
            return 4 ; 
            }
        }else{
            if(latest == 4){System.out.println("stake is : Dragon");
            return 4 ;
            }else{System.out.println(("stake is : Tiger"));
            return 7 ;}
        }
    }
    public static void printPredit(int[] predit){
        for(int i : predit){
            System.out.print(i+" ");
        }
    }
}
