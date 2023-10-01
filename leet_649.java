import java.util.ArrayList;

public class leet_649 {
  public static void main(String[] args) {
    String senate = "DDRRR";
    String ans=predictPartyVictory(senate);
    System.out.println(ans);
  }  
  static String predictPartyVictory(String senate) {
        ArrayList<Character> ch=new ArrayList<>();
        for(int i=0;i<senate.length();i++){
            ch.add(i, senate.charAt(i));

        }

        while(true){
            int r=0,d=0;
            for(int j=0;j<ch.size();j++){
                //int l=ch.size();
                if(ch.get(j)=='R'){
                    r++;
                    System.out.println("r");
                    if(j+1<ch.size() ){
                        if(ch.get(j+1)=='D'){
                            ch.remove(j+1);
                        }
                    }
                    else if(j==ch.size()-1){
                        if(ch.get(0)=='D'){
                            ch.remove(0);
                        }
                    }
                }
                else if(ch.get(j)=='D'){
                    d++;
                    System.out.println("d");
                    if(j+1<ch.size()){
                        if(ch.get(j+1)=='R'){
                            ch.remove(j+1);
                        }
                    }
                    else if(j==ch.size()-1){
                        if(ch.get(0)=='R'){
                            ch.remove(0);
                        }
                    }
                }
            }
            if(r>d ){
                return("Radiant");
            }
            if(r<d){
                return("Dire");
            }
        }
  }
}
