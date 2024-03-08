public class stringsearch {
    public static void main(String[] args) {
        int cnt=0;
        String sm="peter piper picked a "+"peck of pickled peppers";
        for(int i=0;i<sm.length();i++){
            if(sm.charAt(i)=='p')
                cnt++;
            else continue;
        }
        System.out.println("Total no. of p's in the given string is "+cnt);
    }
}
