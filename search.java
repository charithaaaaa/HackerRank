class search{
    public static void main(String[] args) {
        int[] c ={20,14,17,10,34,86};
        int element= 9;
        for(int i=0;i<c.length;i++){
            if(c[i]==element){
                System.out.println("Element found at index: "+i);
                return;
            }
        }        
        System.out.println("Element not found in the array.");
    }
}