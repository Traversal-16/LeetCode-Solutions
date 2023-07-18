class LRUCache 
{
    LinkedHashMap<Integer, Integer> hm;
    int count;
    int capacity;
    
    public LRUCache(int capacity) 
    {
        this.capacity = capacity;
        this.hm = new LinkedHashMap<>();
        count = 0;
    }
    
    public int get(int key) 
    {
        if(hm.get(key) != null)
        {
            int val = hm.remove(key);
            hm.put(key, val);
            return val;
        }
        else
        {
            return -1;
        }  
    }
    
    public void put(int key, int value) 
    {
        if(hm.containsKey(key))
        {
            hm.remove(key);
            hm.put(key, value);
            return; 
        }
        if(count < capacity)
        {
            hm.put(key, value);
            count++;
        }
        else
        {
            int lru =0;
            for(int i: hm.keySet())
            {
                lru = i;
                break;
            }
            hm.remove(lru);
            hm.put(key, value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */