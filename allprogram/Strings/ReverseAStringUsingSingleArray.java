package allprogram.Strings;

public class ReverseAStringUsingSingleArray {
    public static void main(String[] args) {
        String str ="SANTOSH";
        //"HSOTNAS"
        char[] ch = str.toCharArray();
        for (int i = 0,j=str.length()-1; i < j; i++,j--) {
            System.out.print("ch[i]-> "+ch[i]+" ch[j]-> "+ch[j]+"\n");
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            System.out.print("ch[i]-> "+ch[i]+" ch[j]-> "+ch[j]+"\n");
        }
        System.out.println("\n"+String.copyValueOf(ch));
    }
}
