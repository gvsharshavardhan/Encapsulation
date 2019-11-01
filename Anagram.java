package Demo_kt;

public class Anagram {

   static  boolean anagram(String str1,String str2)
    {
        boolean flag=true;
        int[] countingArray=new int[256];
        if(str1.length()==str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int a = str1.charAt(i);
                countingArray[a]++;
                a = str2.charAt(i);
                countingArray[a]--;
            }
        }
        else
        {
            return false;
        }
        for(int i=0;i<countingArray.length;i++)
        {
            if(countingArray[i]!=0)
            {
                flag=false;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {


        System.out.println(anagram("abcdd","bcad"));
    }
}
