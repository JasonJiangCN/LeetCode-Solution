class Node{
    public int value;
    public Node next;
    public Node last;
    public int key;
    public Node(int key, int value){
        this.value = value;
        this.key = key;
        this.next = null;
        this.last = null;
    }
}
class LRUCache {
    Map<Integer,Node> mp;
    Node head;
    Node tail;
    int capacity;
    public LRUCache(int capacity) {
        mp = new HashMap<Integer, Node>();
        head = null;
        tail = null;
        this.capacity = capacity;
    }
    public int get(int key) {
        Node nd = mp.get(key);
        if (nd == null)
            return -1;
        update(nd);
        return nd.value;
    }
    private void update(Node nd){
        if (head == nd){
            return;
        }
        if (tail == nd){
            tail = tail.last;
        }
        //remove from original place
        if (nd.last != null)
            nd.last.next = nd.next;
        if (nd.next != null)
            nd.next.last = nd.last;      
        //put to head
        nd.next = head;
        head.last = nd;
        head = nd;
        
        
    }
    public void put(int key, int value) {
        if (mp.get(key) == null){
            //new node
            Node nd = new Node(key, value);
            if (mp.isEmpty()){
                //empty map
                mp.put(key, nd);
                head = nd;
                tail = nd;
            } else {
                //list has something, but not full
                //System.out.println(head.key);
                mp.put(key, nd);
                nd.next = head;
                head.last = nd;
                head = nd;
                if (mp.size() > capacity){
                    tail = tail.last;
                    mp.remove(tail.next.key);
                }
            }
        } else {
            //update the location of the node
            if (mp.get(key).value != value)
                mp.get(key).value = value;
            get(key);   
        }    
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
