public class Find_Prefix_Word {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0; i<children.length; i++){
                this.children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean checkPrefix(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }else{
                curr = curr.children[idx];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word[] = {"apple","app","mango","man","woman"};
        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }
        System.out.println(checkPrefix("app"));//true
        System.out.println(checkPrefix("appp"));//false
    }
}
