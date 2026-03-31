class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
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
        }
        if(word.equals("..") && !stack.empty()) stack.pop();
        else if(word!="" && !word.equals(".") && !word.equals("..")){ 
            stack.push(word);
            word =  "";
            }
        word  = "";
        if(stack.empty()) return "/";
        while(!stack.empty()){ 
            word =  "/" + stack.pop() + word ;
        }
        return word;
    }
}
