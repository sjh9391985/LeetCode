class Solution {
    public String interpret(String command) {
            String interpret = "";
            String res = "";
        
        for(int i = 0; i < command.length(); i++){
            interpret += command.charAt(i);
        
            switch (interpret) {
                case "G": 
                    res += "G";
                    interpret = "";
                    break;
                case "()": 
                    res += "o";
                    interpret = "";
                    break;
                case "(al)": 
                    res += "al";
                    interpret = "";
                    break;
            }
        }
        return res;
    }
}