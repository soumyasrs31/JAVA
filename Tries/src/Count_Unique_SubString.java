public class Count_Unique_SubString {
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

    public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int count = 0;
            for(int i=0; i<root.children.length; i++){
                if(root.children[i] != null){
                    count += countNodes(root.children[i]);
                }
            }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        int count = 0;
        //count suffix -> insert TRIE
        for(int i=0; i<=str.length(); i++){
            String suffix = str.substring(i);
            for(int j=0; j<suffix.length(); j++){
                count++;
            }
            insert(suffix);
        }
        System.out.println("Unique subString is "+countNodes(root));
        System.out.println("Total subString is "+count);
    }
}
