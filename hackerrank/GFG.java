package hackerrank;
class GFG
{

    // function for finding common divisor
    static boolean isCommonBase(String base,
                                String s1,
                                String s2)
    {

        for (int j = 0; j < s1.length(); ++j)
        {
            if (base.charAt(j %
                    base.length()) != s1.charAt(j))
            {
                return false;
            }
        }

        for (int j = 0; j < s2.length(); ++j)
        {
            if (base.charAt(j % base.length()) != s2.charAt(j))
            {
                return false;
            }
        }

        return true;
    }

    static int countCommonBases(String s,
                                String t)
    {
        int n1 = s.length(),
                n2 = t.length();
        int count = -1;
        System.out.println(n1);
        if(n1 > 200000){
            System.out.println("truuuuuu");
        }
        for (int i = 1; i <= Math.min(n1, n2); i++)
        {
            String base = s.substring(0, i);
            System.out.println(base);
            if (isCommonBase(base, s, t))
            {
                System.out.println("true");
                count=base.length();
                break;
            }
        }
        return count;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s1 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabca";
        String s2 = "abcabc";

        System.out.println(countCommonBases(s1, s2));
    }
}
