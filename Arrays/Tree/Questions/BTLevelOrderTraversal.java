package Tree.Questions;

import java.util.*;

public class BTLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levesize=queue.size();
            List<Integer> currentlevells=new ArrayList<>(levesize);
            for (int i = 0; i < levesize; i++) {
                Node cn=queue.poll();
                currentlevells.add(cn.val);
                if(cn.left!=null){
                    queue.offer(cn.left);
                }if(cn.right!=null){
                    queue.offer(cn.right);
                }
            }
            result.add(currentlevells);
        }
        return result;
    }
    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        Queue<Pair> qu=new LinkedList<>();
        qu.offer(new Pair(root,0));
        while (!qu.isEmpty()){
            Pair p=qu.poll();
            int hd=p.distance;
            Node tmp=p.node;
            if(mp.get(hd)==null){
                mp.put(hd,tmp.val);
            }
           if(tmp.left!=null){
               qu.offer(new Pair(tmp.left,hd-1));
           }if(tmp.right!=null){
               qu.offer((new Pair(tmp.right,hd+1)));
            }
           for (Map.Entry<Integer,Integer> m:mp.entrySet()){
                ans.add(m.getValue());
           }

        }
        return ans;
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Map<Integer,Integer> hm=new TreeMap<>();
        Queue<Pair> qu=new LinkedList<>();
        qu.offer(new Pair(root,0));
        while(!qu.isEmpty()){
            Pair p=qu.poll();
            int hd=p.distance;
            Node tmp=p.node;
            hm.put(hd,tmp.val);
            if(tmp.left!=null){
                qu.offer(new Pair(tmp.left,hd-1));
            }if(tmp.right!=null){
                qu.offer(new Pair(tmp.right,hd+1));
            }
        }
        for (Map.Entry<Integer,Integer> m:
             hm.entrySet()) {
            result.add(m.getValue());
        }
        return result;
    }
    public List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Pair> qu = new LinkedList<>();
        qu.offer(new Pair(root, 0));
        Map<Integer, List<Integer>> mp = new TreeMap<>();
        while (!qu.isEmpty()) {
            Pair p=qu.poll();
            int hd=p.distance;
            Node tmp=p.node;
            mp.computeIfAbsent(hd, key -> new ArrayList<>()).add(tmp.val);
                if(tmp.left!=null){
                    qu.offer(new Pair(tmp.left,hd-1));
                }if(tmp.right!=null){
                    qu.offer(new Pair(tmp.right,hd+1));
            }
        }
        for (Map.Entry<Integer,List<Integer>> en:
             mp.entrySet()) {
            result.add(en.getValue());
        }
        return result;
    }
}
class Pair {
    Node node;
    int distance;

    public Pair(Node node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

