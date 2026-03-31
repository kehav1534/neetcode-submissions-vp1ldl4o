class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int periodCount = 0;
        String word = "";
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i)=='/' && word !=""){
                if( !stack.empty() && word.equals("..")) {
                    stack.pop();
                    word = "";
                    continue;
                }
                else if((word.equals("..") && stack.empty()) || word.equals(".")){
                    word = "";
                    continue;
                }
                stack.push(word);
                word = "";
                continue;
            }
            else if(path.charAt(i)!='/'){
                word+= path.charAt(i);
            }
            // else{
            // }
            if(!stack.empty()){
                System.out.println(stack.peek());
            }
        }
        if(word.equals("..") && !stack.empty()) stack.pop();
        else if(word!="" && !word.equals(".")){ 
            stack.push(word);
            word =  "";
            }
        String validPath = "";
        if(stack.empty()) return "/";
        while(!stack.empty()){
            validPath =  "/" + stack.pop() + validPath ;
        }
        return validPath;
    }
}