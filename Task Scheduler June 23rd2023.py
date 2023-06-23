Question:---https://practice.geeksforgeeks.org/problems/task-scheduler/1

class Solution:
    def leastInterval(self, N, K, tasks):
        # Code here
        
        count=[0]*26  
        
        for i in tasks:
            count[ord(i)-ord('A')]+=1
        
        count.sort(reverse=True)
        m=count[0]-1
        slots=m*K
        
        for i in range(1,26):
            slots -=min(m,count[i])
            
        slots=max(0,slots)
        return len(tasks)+slots
