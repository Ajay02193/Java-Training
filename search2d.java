public class search2d {
    public static void main(String[] args) {
        int ch=0;
        int[][] arr={{32,87,3,589},{12,1076,2000,8}};
        ran: //label
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1076)
                    {
                        ch=1;
                        System.out.println("Element found at row "+i+" & column "+j);
                        break ran; // lablelled break
                    }
                    System.out.println("inside");
            }
            System.out.println("outside");
        }
        if(ch==0)
            System.out.println("Element not found");
    }
}
