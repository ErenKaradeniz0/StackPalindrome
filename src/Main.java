public class Main {
    public static void main(String[] args) {
        String text = "ABCCBA";
        int index=0;
        Stack<Character> stack = new Stack<Character>();
        char ch =text.charAt(index);
        while (index!=text.length()/2){
            stack.push(ch);
            index+=1;
            ch =text.charAt(index);

        }
        while (!stack.isEmpty()){
            ch =text.charAt(index);
            if(stack.pop()==ch){
                index+=1;
            }
        }
       if( index==text.length()){
           System.out.println("Palindrome");
       }
       else
           System.out.println("Not Palindrome");
    }
}