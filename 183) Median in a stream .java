import heapq

 

def addNum(ele,smallHeap,bigHeap):

 

    heapq.heappush(smallHeap,-ele)

 

    if smallHeap and bigHeap and -smallHeap[0]>bigHeap[0]:

        ele=-heapq.heappop(smallHeap)

        heapq.heappush(bigHeap,ele)

 

    if len(smallHeap)>len(bigHeap)+1:

        ele=-heapq.heappop(smallHeap)

        heapq.heappush(bigHeap,ele)

 

    if len(bigHeap)>len(smallHeap)+1:

        ele=heapq.heappop(bigHeap)

        heapq.heappush(smallHeap,-ele)

 

 

 

def median(smallHeap,bigHeap):

 

    if len(smallHeap)>len(bigHeap):

        return -smallHeap[0]

 

    if len(smallHeap)<len(bigHeap):

        return bigHeap[0]

 

    return (-smallHeap[0]+bigHeap[0])//2

        

 

 

 

def findMedian(arr, n):

    smallHeap=[]

    bigHeap=[]

    ans=[]

    for i in arr:

        addNum(i,smallHeap,bigHeap)

        temp=median(smallHeap,bigHeap)

        ans.append(temp)

    return ans