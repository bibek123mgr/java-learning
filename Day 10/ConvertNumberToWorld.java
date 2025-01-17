
public class ConvertNumberToWorld {
    static void numbertoword(char num[]){
        int len = num.length;
        if(len==0){
            System.out.println("string is empty");
            return;
        }
        if(len > 4){
            System.out.println("the number has more than 4 digits");
            return;
        }

        String[] onedigits=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] twodigits=new String[]{"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fiftheen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
        String[] poweroftens = new String[] { "Hundred", "Thousand" };

        if (len == 1) {
            System.out.println(onedigits[num[0]-'0']);
            return;
        }
        int x = 0;
        while (x < num.length) {
            if(len>=3){
                if(num[x]-'0'!=0){
                    System.out.print(onedigits[num[x]-'0']+" ");
                    System.out.print(poweroftens[len-3]+" ");
                }
                --len;
                // System.out.println(len);
            }
            else{
                if (num[x] - '0' == 1) {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.print(twodigits[sum]);
                    return;
                }else if(num[x]-'0'==2 && num[x+1]-'0' ==0){
                    System.out.print("Twenty");
                    return;
                }else{
                    int i=(num[x]-'0');
                    if(i>0){
                        System.out.print(multipleoftens[i]+" ");
                    }else{
                        System.out.print("");
                        ++x;
                        if(num[x]-'0' != 0){
                            System.out.print(onedigits[num[x]-'0']);
                        }
                    }
                }
                ++x;
            }
        }
    }
    public static void main(String[] args) {
        numbertoword("111".toCharArray());
        numbertoword("1".toCharArray());

    }
}
